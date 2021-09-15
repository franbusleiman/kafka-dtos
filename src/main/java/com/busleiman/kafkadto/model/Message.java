package com.busleiman.kafkadto.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@Data
public class Message<T> {


    private int messageCode;


    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS,include = JsonTypeInfo.As.PROPERTY,property = "@class")
    private T messageContent;

}