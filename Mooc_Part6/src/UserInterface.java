import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;
   public UserInterface(JokeManager jokeManager, Scanner scanner){
       this.jokeManager = jokeManager;
       this.scanner = scanner;
   }
   public void start(){
       readCommand();
   }
   public void readCommand(){
       while (true){
           System.out.println("Commands:");
           System.out.println(" 1 - add a joke");
           System.out.println(" 2 - draw a joke");
           System.out.println(" 3 - list jokes");
           System.out.println(" X - stop");

           String user = scanner.nextLine();
           if(user.equals("1")){
               System.out.println("Enter Joke: ");
               String userJoke = scanner.nextLine();
               this.jokeManager.addJoke(userJoke);
           } else if (user.equals("2")) {
               System.out.println("Drawing joke: ");
               System.out.println(this.jokeManager.drawJoke());
           } else if (user.equals("3")) {
               System.out.println("Listing all jokes: ");
               this.jokeManager.printJokes();
           } else if (user.equals("X")) {
               break;
           }
           else{
               System.out.println("Write proper command");
               continue;
           }
       }
   }

}
