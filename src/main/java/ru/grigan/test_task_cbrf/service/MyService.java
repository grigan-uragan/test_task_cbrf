package ru.grigan.test_task_cbrf.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.grigan.test_task_cbrf.entity.ValCurs;
import ru.grigan.test_task_cbrf.entity.Valute;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class MyService {
    private final String URL = "https://www.cbr-xml-daily.ru/daily_json.js";
    @Autowired
    private RestTemplate restTemplate;

    public ValCurs getCurs() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        ValCurs valCurs = mapper.readValue(getStringResponse(), ValCurs.class);
        return valCurs;
    }

    private String getStringResponse() {
        ResponseEntity<String> entity = restTemplate.exchange(URL, HttpMethod.GET, null,
                new ParameterizedTypeReference<String>() {
                });
        return entity.getBody();
    }

    public List<Valute> getValutes(ValCurs curs) {
        Map<Double, String> map = curs.getValute().values().stream().collect(Collectors.toMap(
                k -> (Math.abs(k.getValue()- k.getPrevious())), Valute::getName
        ));
        TreeMap<Double, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.putAll(map);
        List<String> collect = treeMap.values().stream().limit(5).collect(Collectors.toList());
        return curs.getValute().values().stream()
                .filter(v-> collect.contains(v.getName()))
                .collect(Collectors.toList());
    }
}
