import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
//        System.out.println("Ada Lovelace");
//        System.out.println("Once upon a time");
//        System.out.println("there was");
//        System.out.println("a program");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter text below :");
//        String ans = scanner.nextLine();
//        System.out.println(ans);
//        System.out.println(ans);
//        System.out.println(ans);
//        String start = "October 2020";
//        String end = "June 2024";
//        System.out.println("My Btech start from "+start+" to "+end);
//        System.out.println("My Btech start from" + start + "to" + end);
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name ");
//        String input = scanner.nextLine();
//        System.out.println("Hi "+input);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String name = scanner.nextLine();
        System.out.println("What is their job?");
        String job = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+name+", "+"who was a "+job+".");
        System.out.println("On the way to work, "+name+" reflected on life.");
        System.out.println("Perhaps "+name+" will not be a "+job+" forever.\n");



    }
}