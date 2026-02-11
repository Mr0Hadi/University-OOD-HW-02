package edu.strategy;

import edu.ticket.Ticket;

public interface TicketHandlerStrategy {
    void assign();
    void respond(Ticket ticket);
}
