package ru.grigan.test_task_cbrf.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Map;

public class ValCurs {
    @JsonProperty("Date")
    private Date date;
    @JsonProperty("PreviousDate")
    private Date previousDate;
    @JsonProperty("PreviousURL")
    private String previousURL;
    @JsonProperty("Timestamp")
    private Date timestamp;
    @JsonProperty("Valute")
    private Map<String, Valute> valute;

    public Date getDate() { return date; }
    public void setDate(Date value) { this.date = value; }

    public Date getPreviousDate() { return previousDate; }
    public void setPreviousDate(Date value) { this.previousDate = value; }

    public String getPreviousURL() { return previousURL; }
    public void setPreviousURL(String value) { this.previousURL = value; }

    public Date getTimestamp() { return timestamp; }
    public void setTimestamp(Date value) { this.timestamp = value; }

    public Map<String, Valute> getValute() { return valute; }
    public void setValute(Map<String, Valute> value) { this.valute = value; }

    @Override
    public String toString() {
        return "ValCurs{" +
                "date=" + date +
                ", previousDate=" + previousDate +
                ", previousURL='" + previousURL + '\'' +
                ", timestamp=" + timestamp +
                ", valute=" + valute +
                '}';
    }
}
