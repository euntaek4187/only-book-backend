package org.myongjithon.onlybook.domain.category.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {
    @Id
    private String name;
}
