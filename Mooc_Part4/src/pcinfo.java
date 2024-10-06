import java.util.ArrayList;
import java.util.Scanner;

public class pcinfo {
private ArrayList<pc> List;
    public pcinfo(){
        this.List = new ArrayList<>();
    }
    public void printList() {
        for (pc list : List) {
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        pcinfo pcinfoObject = new pcinfo();
        Scanner scanner = new Scanner(System.in);
        while (true){

            System.out.println("Enter first name");
            String fname = scanner.nextLine();
            if(fname.isEmpty()){
                break;
            }
            System.out.println("Enter last name");
            String lname = scanner.nextLine();

            pc pcobject = new pc(fname,lname);
            pcinfoObject.List.add(pcobject);
        }
        pcinfoObject.printList();
    }
}
