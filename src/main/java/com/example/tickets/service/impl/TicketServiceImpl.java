package com.example.tickets.service.impl;

import com.example.tickets.dto.TicketDto;
import com.example.tickets.mapper.TicketsMapper;
import com.example.tickets.model.Ticket;
import com.example.tickets.repository.TicketRepository;
import com.example.tickets.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor

public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;
    private final TicketsMapper ticketsMapper;

    @Override
    public List<TicketDto> getAllTicket() {
        List<Ticket> ticketList = ticketRepository.findAll();
        List<TicketDto> ticketDtos = new ArrayList<>();
        for (Ticket ticket : ticketList) {
            if (ticket.getIsActive() == true) {
                ticketDtos.add(ticketsMapper.toDto(ticket));
            } else {
                System.out.println("false");
            }
        }
        return ticketDtos;
    }

    @Override
    public TicketDto createTicket(TicketDto ticket) {
        ticketRepository.save(ticketsMapper.toEntity(ticket));
        return ticket;

    }

    @Override
    public TicketDto editTicket(TicketDto ticket) {
        boolean exists = ticketRepository.existsById(ticket.getId());
        if (exists) {
            Ticket ticket1 = ticketsMapper.toEntity(ticket);
            ticketRepository.save(ticket1);
            ticket = ticketsMapper.toDto(ticket1);
            return ticket;
        } else {
            throw new EntityNotFoundException();
        }
    }

    @Override
    public void deleteTicket(long id) {
        ticketRepository.deleteById(id);
    }

    @Override
    public TicketDto archivingTicket(long id) {
        ticketRepository.findTicketById(id).setIsActive(false);
        return null;
    }
}
