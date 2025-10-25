package com.Tactical.Report.Task.demo.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ItemDTO {
    private String id;


    @NotBlank(message = "Name is required and cannot be empty")
    private String name;

    private String description;
}
