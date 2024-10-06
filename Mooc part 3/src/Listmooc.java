import java.util.ArrayList;
import java.util.Scanner;

public class Listmooc {
    public static void main(StringMooc[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//        while(true){
//            System.out.println("Enter text :");
//            String text = scanner.nextLine();
//            if(text.equals(" ")){
//                break;
//            }
//            list.add(text);
//        }
//        System.out.println(list.get(2));
//        while (true){
//            int num = Integer.valueOf(scanner.nextLine());
//            list.add(num);
//            if(num==0){
//                break;
//            }
//        }
//        int res  = list.get(1)+ list.get(9);
//        System.out.println(res);
//    }
//        while (true){
//            System.out.println("enter number");
//            int text = Integer.valueOf(scanner.nextLine());
//            if(text == -1){
//                break;
//            }
//            list.add(text);
//        }
//        System.out.println("enter start range");
//        int start = Integer.valueOf(scanner.nextLine());
//        System.out.println("enter end range");
//        int end = Integer.valueOf(scanner.nextLine());
//
//        for (int i = start; i <= end; i++) {
//            System.out.println(list.get(i));
//        }
        while (true){
            System.out.println("enter number");
            int text = Integer.valueOf(scanner.nextLine());
            if(text == -1){
                break;
            }
            list.add(text);
        }
        int sum=0;
        for(Integer i:list){
            sum +=i;
        }
        System.out.println(sum);


    }
}
}
