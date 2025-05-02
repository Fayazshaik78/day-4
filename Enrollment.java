public class Enrollment {
    
        public String getEnrollmentDetails(String platfrom, String cource, String student){
            return "pltfrom :"+platfrom + "\ncource :" + cource+ "\nstudent :"+student;
        }
        public static void main(String[] args) {
            Enrollment enrollment = new Enrollment();
            System.out.println(enrollment.getEnrollmentDetails("Udemy","javaprogram","Alice"));
            System.out.println(enrollment.getEnrollmentDetails("Udemy","Web Devolpment","Bob"));
        }
        
    }
    
    

