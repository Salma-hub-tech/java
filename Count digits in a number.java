import java.util.Scanner;
//Salma Abdelaziz
class Main {
    public static void main(String[] args){

        Scanner Input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Input.nextInt();

        int count = 0;

        if (number == 0) {
            count = 1;
        }  else { while (number != 0) {
            number /= 10;
            count++; // Increment the counter
             }
        } // Print the number of digits
         System.out.println("Number of digits: " + count);
    }
    }
