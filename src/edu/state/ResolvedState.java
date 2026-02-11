package edu.state;

import edu.ticket.Ticket;
import edu.enums.TicketStatus;

public class ResolvedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket resolved");

        ticket.setState(new ClosedState());
        ticket.setStatus(TicketStatus.CLOSED);
    }
}
