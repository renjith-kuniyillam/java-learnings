package Inheritance;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "renjith.k@siemens.com", "1234567890");
        System.out.println(person);
        Student student = new Student("Jane Doe", "reasdsfssfad@gin.com", "1234567890", "1234", "Computer Science", 4.5);
        System.out.println(student);


        Empolyee emp1 = new Empolyee("John Doe", "john.doe@gmail.com", "1234567890", "1234", "Sr Software Engg", 100000);

        System.out.println(emp1);




    }


}
