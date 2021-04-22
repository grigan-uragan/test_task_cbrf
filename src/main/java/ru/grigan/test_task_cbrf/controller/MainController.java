package ru.grigan.test_task_cbrf.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.grigan.test_task_cbrf.entity.ValCurs;
import ru.grigan.test_task_cbrf.entity.Valute;
import ru.grigan.test_task_cbrf.service.MyService;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private MyService service;

    @GetMapping
    public String getValute(Model model) throws JsonProcessingException {
        ValCurs curs = service.getCurs();
        List<Valute> valutes = service.getValutes(curs);
        model.addAttribute("valutes", valutes);
        return "index";
    }
}
