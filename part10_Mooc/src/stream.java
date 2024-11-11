import java.util.ArrayList;
import java.util.Scanner;

public class stream {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(1==1){
            System.out.println("Enter numbers: ");
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            int ans = Integer.valueOf(input);
            list.add(ans);

        }
      double Pavg =  list.stream().mapToInt(x -> Integer.valueOf(x)).filter(x->x>0).average().getAsDouble();
        double Navg =  list.stream().mapToInt(x -> Integer.valueOf(x)).filter(x->x<0).average().getAsDouble();
        System.out.println("enter p/n :");
        String input = scanner.nextLine();
        if(input.equals("p")){
        System.out.println("Your positive average is "+Pavg);
        }
        else if(input.equals("n")){
            System.out.println("Your positive average is "+Navg);

        }
    }
}
