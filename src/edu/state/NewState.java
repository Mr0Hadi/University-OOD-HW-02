package edu.state;

import edu.ticket.Ticket;
import edu.enums.TicketStatus;

public class NewState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket created");

        switch (ticket.getChannel()) {
            case WEB -> System.out.println("Received from web");
            case EMAIL -> System.out.println("Received from email");
        }

        ticket.setState(new AssignedState());
        ticket.setStatus(TicketStatus.ASSIGNED);
    }
}
