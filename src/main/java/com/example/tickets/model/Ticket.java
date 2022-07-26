package com.example.tickets.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "tickets")
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @CreationTimestamp
    private Timestamp timeOfCreation;
    private String name;
    private String description;
    @UpdateTimestamp
    private Timestamp timeChange;
    private Boolean isActive = true;
}
