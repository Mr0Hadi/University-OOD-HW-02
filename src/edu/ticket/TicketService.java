package edu.ticket;

public class TicketService {

    public void process(Ticket ticket) {

        while (ticket.getStatus() != TicketStatus.CLOSED) {
            ticket.handle();
        }

        System.out.println("Logging ticket handling : "
                + ticket.getId() + " -> " + ticket.getStatus());
    }
}
