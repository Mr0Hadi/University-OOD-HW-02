package edu.state;

import edu.ticket.Ticket;
import edu.enums.TicketStatus;

public class InProgressState implements TicketState {

    @Override
    public void handle(Ticket ticket) {

        System.out.println("Working on ticket");

        ticket.getHandlerStrategy().respond(ticket);

        ticket.setState(new ResolvedState());
        ticket.setStatus(TicketStatus.RESOLVED);
    }
}
