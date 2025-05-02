public class Hotel {
    public String getReservationDetails(String hotelName, String guestName, int nights){
        return "Hotel name :"+hotelName + "\nGuset Name :" + guestName+ "\nnights :"+nights;
    }
    public static void main(String[] args) {
        Hotel hotel= new Hotel();
        System.out.println(hotel.getReservationDetails("grand place","divid",3));
        System.out.println(hotel.getReservationDetails("grand place","maria",2));
    }
    
}
