public class Main {
    public static void main(String[] args) {
        Person rektor = new Person("Alimzhan Igenbayev","Abylai Khan, 1/1");
        Staff staff = new Staff("Satbek Abdyldayev","USA","SDU", 1 );
        Student student = new Student("Beisen Adilov", "SDU", "Computer Science", 1,1.0);
        System.out.println("Rektor is "+rektor.getName());
        System.out.println("Staff is "+ staff.getName());
        System.out.println("Student is "+student.getName());
    }
}
