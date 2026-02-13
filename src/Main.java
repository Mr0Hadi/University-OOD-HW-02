import edu.ticket.Ticket;
import edu.ticket.TicketService;
import edu.enums.*;

public class Main {

    public static void main(String[] args) {

        TicketService ticketService = new TicketService();

        Ticket ticket = new Ticket(
                1,
                TicketChannel.WEB,
                TicketType.BUG
        );

        ticketService.handle(ticket);
    }
}

