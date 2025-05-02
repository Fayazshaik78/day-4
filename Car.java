public class Car{
    public void  displayDetails(String showroomName, String modelName, int price){
        System.out.println("Showroom Name :"+showroomName);
        System.out.println("String modelName :"+modelName);
        System.out.println("int price :"+price);


    }
    public static void main(String[] args) {
        Car cars = new Car();
        cars.displayDetails("Elite moters", "Tesla Model S", 80000);
        
    }

    
}