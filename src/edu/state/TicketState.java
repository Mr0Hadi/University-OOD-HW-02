package edu.state;

import edu.ticket.Ticket;

public interface TicketState {
    void handle(Ticket ticket);
}