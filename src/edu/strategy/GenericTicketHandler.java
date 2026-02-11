package edu.strategy;

import edu.ticket.Ticket;

public class GenericTicketHandler implements TicketHandlerStrategy {

    @Override
    public void assign() {
        System.out.println("Assigned to support");
    }

    @Override
    public void respond(Ticket ticket) {
        System.out.println("Sending generic response");
        ticket.setResponse("We are checking your request");
    }
}
