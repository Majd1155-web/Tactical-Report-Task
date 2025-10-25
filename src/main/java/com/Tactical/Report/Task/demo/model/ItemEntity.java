package com.Tactical.Report.Task.demo.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
@Getter
@Setter
public class ItemEntity {

    @Id
    private String id;

    @NotBlank(message = "Name is required and cannot be empty")
    private String name;

    private String description;
}