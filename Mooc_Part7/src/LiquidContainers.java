import java.util.Scanner;

public class LiquidContainers {
    private int liquid;
    public void add(int val){
        if (this.liquid+val>100){
            val = 100-this.liquid;
        }
    this.liquid += val;
    }
    public void move(int val,LiquidContainers liq2){
        if(val>this.liquid){
            val = this.liquid;
        }
    liq2.add(val);
    this.remove(val);
    }
    public void remove(int val){
        if (val> this.liquid){
            val = this.liquid;
        }
        this.liquid -= val;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LiquidContainers liq1 = new LiquidContainers();
        LiquidContainers liq2 = new LiquidContainers();
        while (true) {
            System.out.println("**********************************");
            System.out.println("First Liquid :" + liq1.liquid + "/100");
            System.out.println("Second Liquid :" + liq2.liquid + "/100");
            System.out.println("Enter command add/move/remove");
            String user = scanner.nextLine();
            if(user.equals("end")){
                break;
            }
            String[] arr = user.split(" ");
            if (arr[0].equals("add")) {
                liq1.add(Integer.valueOf(arr[1]));
            } else if (arr[0].equals("move")) {
                liq1.move(Integer.valueOf(arr[1]), liq2);
            } else if (arr[0].equals("remove")) {
                liq2.remove(Integer.valueOf(arr[1]));
            }
            System.out.println("First Liquid :" + liq1.liquid + "/100");
            System.out.println("Second Liquid :" + liq2.liquid + "/100");
        }
    }
}
