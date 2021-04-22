package ru.grigan.test_task_cbrf.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Valute {
    @JsonProperty("ID")
    private String id;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private long nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private double value;
    @JsonProperty("Previous")
    private double previous;

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

    public String getNumCode() {
        return numCode;
    }

    public void setNumCode(String value) {
        this.numCode = value;
    }

    public String getCharCode() {
        return charCode;
    }

    public void setCharCode(String value) {
        this.charCode = value;
    }

    public long getNominal() {
        return nominal;
    }

    public void setNominal(long value) {
        this.nominal = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getPrevious() {
        return previous;
    }

    public void setPrevious(double value) {
        this.previous = value;
    }

    @Override
    public String toString() {
        return "Valute{" +
                "id='" + id + '\'' +
                ", numCode='" + numCode + '\'' +
                ", charCode='" + charCode + '\'' +
                ", nominal=" + nominal +
                ", name='" + name + '\'' +
                ", value=" + value +
                ", previous=" + previous +
                '}';
    }
}
