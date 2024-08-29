import java.util.Scanner;

public class part_1_Variable {
    public static void main(String[] args) {
//        int chicken = 9000;
//        double bacon = 0.1;
//        String tractor = "Zetor";
//        System.out.println("Chicken:");
//        System.out.println(chicken);
//        System.out.println("Bacon (kg):");
//        System.out.println(bacon);
//        System.out.println("Tractor:");
//        System.out.println(tractor);
//        System.out.println("");
//        System.out.println("And finally, a summary:");
//        System.out.println(chicken);
//        System.out.println(bacon);
//        System.out.println(tractor);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String text = scanner.nextLine();
        System.out.println("Give a integer:");
        int ans =  Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double dou = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave values : ");
        System.out.println(text);
        System.out.println(ans);
        System.out.println(dou);
        System.out.println(bool);
//        System.out.println("You wrote "+ans);

    }
}
