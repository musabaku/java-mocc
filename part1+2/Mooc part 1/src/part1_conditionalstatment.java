import java.util.Scanner;

public class part1_conditionalstatment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("enter num");
//        int ans = Integer.valueOf(scanner.nextLine());
//        if(ans>120){
//            System.out.println("Speeding ticket!");
//        }
        System.out.println("Enter a number between 1 and 100");
        int num = Integer.valueOf(scanner.nextLine());
        if(num<1 || num>100){
            System.out.println("I told enter between 1 and 100 press run button again!!!");
            return;
        }
        if(num % 3 ==0 && num % 5 ==0){
            System.out.println("FizzBuzz");

        } else if (num % 5 ==0) {
            System.out.println("Buzz");
        }
        else if(num % 3 ==0){
            System.out.println("Fizz");

        }
        else{
            System.out.println(num);
        }
    }
}
