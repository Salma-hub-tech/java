import java.util.Scanner;
//Salma Abdelaziz
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();
        if(x>y){
            System.out.println("The largest number is " + x);
        } else if (y>x) {
            System.out.println("The largest number is " + y);
        }else {
            System.out.println("Both numbers are equal.");
        }
    }
}