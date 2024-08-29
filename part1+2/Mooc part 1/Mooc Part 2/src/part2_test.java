import java.util.Scanner;

public class part2_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int totalNumber = 0;
        int avg = 0;
        int odd = 0;
        int even = 0;
        while(true){

            System.out.println("Enter number :");
            int n = Integer.valueOf(scanner.nextLine());
            if(n<0){
                if(n==-1){
                    break;
                }
                System.out.println("try again only positive numbers");
                continue;
            }
            if(n%2==0){
                even++;
            }else {
                odd++;
            }
            totalNumber++;
            sum = sum+n;
            avg = sum/totalNumber;
        }
        System.out.println("Sum is : " + sum);
        System.out.println("totalNumber is : "+totalNumber);
        System.out.println("avg is : "+avg);
        System.out.println("even is : "+even);
        System.out.println("odd is : "+odd);

    }


}
