package buyTickets;

public class BuyTicket {

    public static void main(String[] args) {
       /*
       Ticket for: Mr or Mrs -NAME-
       Ticket price: -PRICE-
        */

        Ticket ticket = new Ticket();
        ticket.setName("Sergeo");
        ticket.setSex('M');
        ticket.setAge(300);
        ticket.setPrice(100);

        System.out.println("Ticket for: " + ticket.getName());
        System.out.println("Ticket price: " + ticket.getPrice());

        System.out.println("_____________");

        Ticket ticket2 = new Ticket();
        ticket2.setName("Anna");
        ticket2.setSex('F');
        ticket2.setAge(300);
        ticket2.setPrice(100);

        System.out.println("Ticket for: " + ticket2.getName());
        System.out.println("Ticket price: " + ticket2.getPrice());
    }

}
