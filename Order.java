public class Order {
    public String getOrderDetails(String restaurantName, String foodItem, int quantity){
        return "Restaurant Name :"+ restaurantName + "\nFood Item :" + foodItem +"\nquaninty :" + quantity;
     
    }
    public static void main(String[] args) {
        Order order = new Order();


      //  order.getOrderDetails("spice garden", "panner batter masala", 2);
       // order.getOrderDetails("spice garden ", "chicken biriyani ",  1);
        System.out.println(order.getOrderDetails("Spice Garden", "Paneer Butter Masala", 2));
         System.out.println(order.getOrderDetails("Spice Garden", "Chicken Biryani", 1));
        
    }

}
