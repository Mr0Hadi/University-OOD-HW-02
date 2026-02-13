package edu.ticket;

import edu.ticket.factory.*;
import edu.enums.TicketChannel;
import edu.enums.TicketStatus;
import edu.enums.TicketType;
import edu.state.TicketState;
import edu.strategy.TicketHandlerStrategy;

public class Ticket {
    int id;
    private TicketState state;
    private final TicketChannel channel;
    private TicketStatus status;
    String type;
    String request;
    String response;
    private final TicketHandlerStrategy handlerStrategy;

    public Ticket(int id, TicketChannel channel, TicketType type) {
        this.id = id;
        this.channel = channel;
        this.type = type.name();
        this.handlerStrategy = TicketHandlerFactory.create(type);
    }

    public void setState(TicketState state) {
        this.state = state;
    }
    

    public TicketState getState() {
        return state;
    }

    public TicketChannel getChannel() {
        return channel;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public TicketHandlerStrategy getHandlerStrategy() {
        return handlerStrategy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public int getId() {
        return this.id;
    }
}
