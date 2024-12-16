package com.specification.demo.dto;

import lombok.Data;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Objects;

@Data
public class PageRequestDto {
    private int page;
    private int size;
    private Sort.Direction sort = Sort.Direction.ASC;
    private String sortBy;

    public Pageable getPageRequest() {
        int page = Objects.isNull(this.getPage()) ? 0 : this.page;
        int size = Objects.isNull(this.getSize()) ? 10 : this.size;
        Sort.Direction sort = Objects.isNull(this.getSort()) ? Sort.Direction.ASC : this.getSort();
        String sortBy = Objects.isNull(this.getSortBy()) ? "id" : this.getSortBy();


        PageRequest request = PageRequest.of(page, size, sort, sortBy);
        return request;
    }
}
