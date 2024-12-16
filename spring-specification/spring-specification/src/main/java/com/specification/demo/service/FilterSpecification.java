package com.specification.demo.service;

import com.specification.demo.dto.ComparisonOperator;
import com.specification.demo.dto.FilterDto;
import com.specification.demo.dto.Operator;
import com.specification.demo.dto.RequestDto;
import jakarta.persistence.criteria.Predicate;
import lombok.Data;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class FilterSpecification<T> {

    public static <T> Specification<T> getFilterSpecification(FilterDto filterDto) {
        return (root, query, criteriaBuilder) -> {
            return criteriaBuilder.equal(root.get(filterDto.getName()), filterDto.getValue());
        };
    }

    public static <T> Specification<T> getFilterSpecification(RequestDto filterDto) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            for (FilterDto filter : filterDto.getFilters()) {
                switch (filter.operation) {
                    case ComparisonOperator.EQUAL -> {
                        Predicate predicate = criteriaBuilder.equal(root.get(filter.getName()), filter.getValue());
                        predicates.add(predicate);
                    }
                    case ComparisonOperator.LIKE -> {
                        Predicate predicate = criteriaBuilder.like(root.get(filter.getName()), "%" + filter.getValue() + "%");
                        predicates.add(predicate);
                    }
                    case ComparisonOperator.IN -> {
                        String[] values = filter.getValue().split(",");
                        Predicate predicate = root.get(filter.getName()).in(values);
                        predicates.add(predicate);
                    }
                    case ComparisonOperator.LESS_THAN -> {
                        Predicate predicate = criteriaBuilder.lessThan(root.get(filter.getName()), filter.getValue());
                        predicates.add(predicate);
                    }
                    case ComparisonOperator.GREATER_THAN -> {
                        Predicate predicate = criteriaBuilder.greaterThan(root.get(filter.getName()), filter.getValue());
                        predicates.add(predicate);
                    }
                    case ComparisonOperator.BETWEEN -> {
                        String[] splitRange = filter.getValue().split(",");
                        Predicate between = criteriaBuilder.between(root.get(filter.getName()), Long.parseLong(splitRange[0]), Long.parseLong(splitRange[1]));
                        predicates.add(between);
                    }
                    case JOIN -> {
                        Predicate joinPredicate = criteriaBuilder.equal(root.join(filter.getJoinTable()).get(filter.getName()), filter.getValue());
                        predicates.add(joinPredicate);
                    }
                }
            }

            if (filterDto.getOperator() == Operator.AND) {
                return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
            } else {
                return criteriaBuilder.or(predicates.toArray(new Predicate[0]));
            }
        };
    }



}