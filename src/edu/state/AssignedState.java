package edu.state;

import edu.ticket.Ticket;
import edu.enums.TicketStatus;


public class AssignedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {

        ticket.getHandlerStrategy().assign();

        ticket.setState(new InProgressState());
        ticket.setStatus(TicketStatus.IN_PROGRESS);
    }
}
