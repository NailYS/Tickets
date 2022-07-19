package com.example.tickets.controller;


import com.example.tickets.dto.TicketDto;
import com.example.tickets.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
@RequiredArgsConstructor
public class TicketController {

    private final TicketService ticketService;

    @GetMapping
    public List<TicketDto> getAllTickets() {
        return ticketService.getAllTicket();
    }

    @PostMapping
    public TicketDto createNewTickets(@RequestBody TicketDto ticket) {
        return ticketService.createTicket(ticket);
    }

    @PatchMapping
    public TicketDto editTicket(@RequestBody TicketDto ticket) {
        return ticketService.editTicket(ticket);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable(name = "id") Long id) {
        ticketService.deleteTicket(id);
    }

//    @DeleteMapping("/{id}")
//    public TicketDto archivingDto() {
//        return null;
//    }
}
