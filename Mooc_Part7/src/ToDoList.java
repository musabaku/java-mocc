import java.util.ArrayList;
import java.util.Scanner;

class UI{
    Scanner scanner;
    ToDoList todo;
    public UI(Scanner scanner,ToDoList todo){
        this.scanner = scanner;
        this.todo= todo;
    }
    public void start(){
        while(true){
            System.out.println("Which command would you like to choose among add/list/remove");
            String user= scanner.nextLine();
            if(user.equals("stop")){
                break;
            } else if (user.equals("add")) {

                System.out.println("Enter task to be added :");
                String userAdd= scanner.nextLine();
                todo.add(userAdd);
            } else if (user.equals("list")) {
                todo.print();
            } else if (user.equals("remove")) {
                System.out.println("Enter task number to be removed :");
                String userRemove= scanner.nextLine();

                todo.remove(Integer.valueOf(userRemove));
            }
        }
    }
    public static void main(String[] args) {
        UI ui = new UI(new Scanner(System.in),new ToDoList());
        ui.start();
    }
}
public class ToDoList {
    ArrayList<String> list;
    public ToDoList(){
        this.list = new ArrayList<>();
    }
    public void add(String task){
        this.list.add(task);
    }
    public void print(){
        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.size());
            System.out.println((i+1)+") "+list.get(i));
        }
    }
    public void remove(int number){
        this.list.remove(number-1);
    }


}
