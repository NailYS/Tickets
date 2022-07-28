package com.example.tickets.dto;

import lombok.Data;

import java.sql.Timestamp;


@Data
public class TicketDto {
    private Boolean isActive = true;
    private long id;
    private Timestamp timeOfCreation;
    private String name;
    private String description;
    private Timestamp timeChange;
}

