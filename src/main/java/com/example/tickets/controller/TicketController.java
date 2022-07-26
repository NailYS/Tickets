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

    @PostMapping("archiving/{id}")
    public TicketDto archivingTicket(@PathVariable(name = "id") Long id) {
        return ticketService.archivingTicket(id);
    }

    @PostMapping("unzipping/{id}")
    public TicketDto unzippingTicket(@PathVariable(name = "id") Long id) {
        return ticketService.unzippingTicket(id);
    }

    @GetMapping("get_archivingTicket")
    public List<TicketDto> getArchivingTicket() {
        return ticketService.getArchivingTicket();
    }

}