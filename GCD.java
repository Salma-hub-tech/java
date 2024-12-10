import java.util.Scanner;
//Salma Abdelaziz
class Main {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = Input.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = Input.nextInt();
        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
        }
            System.out.println("The GCD is: " + number1);
        }
    }
