package com.specification.demo.dto;

import lombok.Data;

@Data
public class FilterDto {
    public String name;
    public String value;
    public ComparisonOperator operation;
    public String joinTable;
}
