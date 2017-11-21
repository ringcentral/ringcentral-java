package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ReservationDate
{
    //
    public String date;
    public ReservationDate date(String date) {
        this.date = date;
        return this;
    }
    //
    public Boolean max;
    public ReservationDate max(Boolean max) {
        this.max = max;
        return this;
    }
    //
    public Boolean min;
    public ReservationDate min(Boolean min) {
        this.min = min;
        return this;
    }
}
