package edu.ticket;

import edu.enums.*;

public class TicketService {

    public void process(Ticket ticket) {

        while (ticket.getStatus() != TicketStatus.CLOSED) {
            ticket.getState().handle(ticket);
        }

        System.out.println("Logging ticket handling : "
                + ticket.getId() + " -> " + ticket.getStatus());
    }
}
