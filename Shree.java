import java.util.Scanner;

public class Shree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1: call function");
            System.out.println("2: exit");
            int input = sc.nextInt();

            if (input == 1) {
                checkMarks(sc);
            } else {
                break;
            }
        }

        sc.close();
    }

    public static void checkMarks(Scanner sc) {
        System.out.println("Enter the any value");
        int mark = sc.nextInt();

        if (mark <= 50) {
            System.out.println("Fail");
        } else if (mark <= 60) {
            System.out.println("D grade");
        } else if (mark <= 70) {
            System.out.println("C grade");
        } else if (mark <= 80) {
            System.out.println("B grade");
        } else if (mark <= 90) {
            System.out.println("A grade");
        } else if (mark <= 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Invalid");
        }
    }
}
