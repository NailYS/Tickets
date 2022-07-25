package com.example.tickets.dto;

import lombok.Data;


import javax.persistence.Column;
import java.sql.Timestamp;


@Data
public class TicketDto {
    private Boolean isActive;
    private long id;
    private Timestamp timeOfCreation;
    private String name;
    private String description;
    private Timestamp timeChange;
}

