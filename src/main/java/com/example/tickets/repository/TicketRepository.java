package com.example.tickets.repository;

import com.example.tickets.model.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {
    List<Ticket> findAll();

    Ticket findTicketById(long id);
}
