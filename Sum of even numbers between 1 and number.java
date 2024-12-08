import java.util.Scanner;
//Salma Abdelaziz
class Main {
    public static void main(String[] args){

        Scanner Input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Input.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= number){
            if (i % 2 == 0){     //check if the number is even
                sum += i; // Add the even number to the sum
            }
            i++; // Increment the counter
        }
        System.out.println("The sum of even numbers between 1 and " + number + " is: " + sum);

    }
    }
