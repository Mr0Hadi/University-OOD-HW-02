package edu.ticket.factory;

import edu.enums.TicketStatus;

public class TicketHandlerFactory {

    public static TicketHandlerStrategy create(TicketType type) {
        return switch (type) {
            case BUG -> new BugTicketHandler();
            case GENERIC -> new GenericTicketHandler();
        };
    }
}