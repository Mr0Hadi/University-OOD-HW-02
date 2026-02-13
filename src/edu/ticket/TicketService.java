package edu.ticket;

import edu.enums.TicketStatus;

public class TicketService {


    public void handle(Ticket ticket) {
        String currentStatus = ticket.getStatus().name();
        String type = ticket.type;
        String channel = ticket.getChannel().name();

        if (currentStatus.equals("NEW")) {
            System.out.println("Ticket created");

            if (channel.equals("WEB")) {
                System.out.println("Received from web");
            } else if (channel.equals("EMAIL")) {
                System.out.println("Received from email");
            }

            ticket.setStatus(TicketStatus.ASSIGNED);
        }

        if (currentStatus.equals("ASSIGNED")) {
            if (type.equals("BUG")) {
                System.out.println("Assigned to engineering");
            } else {
                System.out.println("Assigned to support");
            }
            ticket.setStatus(TicketStatus.IN_PROGRESS);
        }

        if (currentStatus.equals("IN_PROGRESS")) {
            System.out.println("Working on ticket");

            if (type.equals("BUG")) {
                System.out.println("Sending bug response");
            } else {
                System.out.println("Sending generic response");
            }

            ticket.setStatus(TicketStatus.RESOLVED);
        }

        if (currentStatus.equals("RESOLVED")) {
            System.out.println("Ticket resolved");
            ticket.setStatus(TicketStatus.CLOSED) ;
        }

        if (currentStatus.equals("CLOSED")) {
            System.out.println("Ticket closed");
        }

        System.out.println("Logging ticket handling : " + ticket.getId() + " -> " + ticket.getStatus());
    }
}
