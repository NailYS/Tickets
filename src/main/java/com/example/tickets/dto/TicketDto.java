package com.example.tickets.dto;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;


@Data
public class TicketDto {
    private long id;
    private Timestamp timeOfCreation;
    private String name;
    private String description;
    private Timestamp timeChange;
}

