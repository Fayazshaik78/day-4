public class Travels {
    
        public String getReservationDetails(String agency, String destinetion, int travellars){
            return "Hotel name :"+agency + "\nGuset Name :" + destinetion+ "\nnights :"+travellars;
        }
        public static void main(String[] args) {
            Travels travel = new Travels();
            System.out.println(travel.getReservationDetails("wanderalust","paris",2));
            System.out.println(travel.getReservationDetails("wanderlust","paris",3));
        }
        
    }
    
    

