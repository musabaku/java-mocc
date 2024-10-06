import java.util.Scanner;

public class StringMooc {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

//       while(true) {
//           System.out.println("Enter text");
//           String text = reader.nextLine();
//           String[] arr = text.split(" ");
//
//           if(text.equals("")){
//               break;
//           }
//           if (arr != null) {
//               for (int i = 0; i < arr.length; i++) {
//                   System.out.println(arr[i]);
//               }
//           } else {
//
//               System.out.println(text);
//           }
//
//       }
//        while(true) {
//            System.out.println("Enter text");
//            String text = reader.nextLine();
//            String[] arr = text.split(" ");
//
//            if(text.equals("")){
//                break;
//            }
//            if (arr != null) {
//
//                for (int i = 0; i < arr.length; i++) {
//                    if(arr[i].contains("av")){
//                        System.out.println(arr[i]);
//
//                    }
//                }
//            }
////            else {
////
////                System.out.println(text);
////            }
//
//        }
int max = 0;
String ansr = "";
        while(true) {
            System.out.println("Enter text");
            String text = reader.nextLine();
            String[] arr = text.split(",");

            if(text.equals("")){
                break;
            }
            if (arr != null) {

//                for (int i = 0; i < arr.length; i++) {
                  int ans = Integer.valueOf(arr[1]);
                  if(ans>max){
                      max = ans;
                       ansr = arr[0];
                  }
//                }
            }
//            else {
//
//                System.out.println(text);
//            }

        }
        System.out.println(max + "budde ka naam : " + ansr);


    }
}
