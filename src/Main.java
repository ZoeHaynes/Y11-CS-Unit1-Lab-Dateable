import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        int dateable = (7+(age/2));
        System.out.println(age+"-year olds should date somebody who is at least "+dateable+ " years old.");


    }
}