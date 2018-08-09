package com.senapati.model;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import lombok.Data;

import java.sql.Date;

@Data
public class InputModel {

    @CsvBindByName(column = "ACCOUNT NUMBER")
    private String accountNo;

    @CsvBindByName(column = "TRADE DATE")
    @CsvDate("yyyyMMdd")
    private Date tradeDate;

    @CsvBindByName(column = "CURRENCY")
    private String currency;

    @CsvBindByName(column = "AMOUNT")
    private Double amount;

    @CsvBindByName(column = "DESCRIPTION")
    private String description;
}
