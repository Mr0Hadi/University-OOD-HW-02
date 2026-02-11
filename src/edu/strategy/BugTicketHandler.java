package edu.strategy;

import edu.ticket.Ticket;

public class BugTicketHandler implements TicketHandlerStrategy {

    @Override
    public void assign() {
        System.out.println("Assigned to engineering");
    }

    @Override
    public void respond(Ticket ticket) {
        System.out.println("Sending bug response");
        ticket.setResponse("Bug fix is on the way");
    }
}
