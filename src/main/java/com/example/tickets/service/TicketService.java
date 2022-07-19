package com.example.tickets.service;

import com.example.tickets.dto.TicketDto;

import java.util.List;

public interface TicketService {
    List<TicketDto> getAllTicket();

    TicketDto createTicket(TicketDto ticket);

    TicketDto editTicket(TicketDto ticket);

    void deleteTicket(long id);

    TicketDto archivingDto(long id);
}
