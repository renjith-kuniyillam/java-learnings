package com.specification.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class RequestDto {
    private List<FilterDto> filters;

    private Operator operator;


}
