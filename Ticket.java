public class Ticket{
    
    public String getTicketInfo(String theatername, String moviename, String seatnumber){
        return "theatername :"+theatername + "\nmovie name :" + moviename+ "\nseat number :"+seatnumber;
    }
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        System.out.println(ticket.getTicketInfo("Galaxy cineams","intrestellar","A10"));
        System.out.println(ticket.getTicketInfo("galaxy cinemas", "incetionn", "B12"));
    }
    
}



