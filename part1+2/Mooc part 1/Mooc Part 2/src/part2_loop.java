import java.util.Scanner;

public class part2_loop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        while(true){
//            System.out.println("Shall we carry on?");
//            String userInput = scanner.nextLine();
//            if(userInput.equals("no")){
//                break;
//            }
//        }
//        System.out.println("Done");

//        while(true){
//            System.out.println("Enter a number");
//            int user = Integer.valueOf(scanner.nextLine());
//            if(user <0){
//                System.out.println("Unsuitable number");
//                continue;
//            } else if(user ==0){
//                break;
//            } else if(user>0){
//                user = user * user;
//            }
//            System.out.println(user);
//        }
//        int num =  0;

//        while(true){
//            System.out.println("Enter a number");
//            int user = Integer.valueOf(scanner.nextLine());
//            if(user > 0 ){
//            num++;
//            } else if(user ==0){
//                break;
//            }
////            System.out.println(num);
//        }
//        System.out.println("Enter a number");
//        int n = Integer.valueOf(scanner.nextLine());
//            int sum = 0;
//            for(int i =1;i<=n;i++){
//            sum = sum+i;
//                System.out.println(sum);
//        }
//        System.out.println(sum);

        System.out.println("Enter a number");
        int n = Integer.valueOf(scanner.nextLine());
        int sum =1;
        for (int i = 2; i <= n; i++) {
            sum= sum*i;

        }
        System.out.println(sum);
//        sum = n;
//        System.out.println(func(n));

    }
//    public static int factorial(int i){
//
//    }

    public static int sum(int i){

        if (i <= 0) {
            return i; // Base case to stop recursion
        }
        System.out.println(i);
          return i +  sum(i-1); // Recursive call with a modified argument
    }

}
