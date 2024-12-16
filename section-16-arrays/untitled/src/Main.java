import Student.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


        Student student = new Student("Renjith",new int [] {1,2,3,4,5});
        System.out.println("Number of marks is :" + student.getNumberOfMarks());
        System.out.println("Total marks is :" + student.getTotalMarks());
        System.out.println("Average marks is :" + student.getAverageMarks());
        System.out.println("Max marks is :" + student.getMaxMarks());
        System.out.println("Min marks is :" + student.getMinMarks());

        System.out.println("");

        Student student1 = new Student("Deepthi",new int [] {1,2,3,4,5,56,78});
        System.out.println("Number of marks is :" + student1.getNumberOfMarks());
        System.out.println("Total marks is :" + student1.getTotalMarks());
        System.out.println("Average marks is :" + student1.getAverageMarks());
        System.out.println("Max marks is :" + student1.getMaxMarks());
        System.out.println("Min marks is :" + student1.getMinMarks());
    }
}