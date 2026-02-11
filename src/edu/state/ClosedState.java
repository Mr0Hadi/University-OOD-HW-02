package edu.state;

import edu.ticket.Ticket;

public class ClosedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket closed");
    }
}
