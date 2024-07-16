import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter class: ");
        String clsname = scanner.nextLine();
        // Input student name
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
// Input student name and roll number
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        // Input marks for three subjects
        System.out.print("Enter marks for Maths: ");
        int marks1 = scanner.nextInt();

        System.out.print("Enter marks for Physics: ");
        int marks2 = scanner.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int marks3 = scanner.nextInt();

        // Calculate total, average, and grade
        int totalMarks = marks1 + marks2 + marks3;
        double averageMarks = totalMarks / 3.0;
        String grade;
        
       if (averageMarks <= 50) {
            grade = "Fail";
        } else if (averageMarks <= 60) {
            grade = "D" ;
        } else if (averageMarks <= 70) {
            grade = "C" ;
        } else if (averageMarks <= 80) {
            grade = "B" ;
        } else if (averageMarks <= 90) {
            grade =  "A";
        } else if (averageMarks <= 100) {
            grade = "Topper" ;
        } else {
            System.out.println("Invalid marks entered.");
            scanner.close();
            return;
        }

        // Print the marksheet
        System.out.println("\nMarksheet:");
        System.out.println("Enter the name: " + studentName);
        System.out.println("Enter the name: " + rollNumber);
        System.out.println("Maths Marks: " + marks1);
        System.out.println("Physics Marks: " + marks2);
        System.out.println("Chemistry Marks: " + marks3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);

        scanner.close();
    

        }
        }





