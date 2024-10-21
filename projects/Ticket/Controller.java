public class Controller {

    public void CreateTicket() {
        long currentTime = System.currentTimeMillis();
        Ticket ticket = new Ticket();
        System.out.println("ID: " + ticket.getID);
        System.out.println("Time: " + ticket.getcreatedTS);
    }

}