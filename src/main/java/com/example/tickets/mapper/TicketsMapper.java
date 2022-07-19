package com.example.tickets.mapper;

import com.example.tickets.dto.TicketDto;
import com.example.tickets.model.Ticket;
import org.springframework.stereotype.Component;

@Component
public class TicketsMapper {
    public TicketDto toDto(Ticket ticket) {
        TicketDto dto = new TicketDto();
        dto.setId(ticket.getId());
        dto.setDescription(ticket.getDescription());
        dto.setTimeChange(ticket.getTimeChange());
        dto.setTimeOfCreation(ticket.getTimeOfCreation());
        dto.setName(ticket.getName());
        return dto;
    }

    public Ticket toEntity(TicketDto ticketDto) {
        Ticket entity = new Ticket();
        entity.setDescription(ticketDto.getDescription());
        entity.setName(ticketDto.getName());
        entity.setId(ticketDto.getId());
        return entity;
    }
}
