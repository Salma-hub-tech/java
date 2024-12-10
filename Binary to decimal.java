import java.util.Scanner;
//Salma Abdelaziz
class Main {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = Input.nextInt();
        int decimal = 0; int power = 0;
        while(binary!=0){
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary/= 10;
        }
        System.out.println("The decimal equivalent is: " + decimal);

        }
    }
