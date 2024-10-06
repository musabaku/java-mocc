import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class files {
    public static void main(String[] args) {

      try(Scanner scanner = new Scanner(Paths.get("data.txt"))) {
          Scanner scanner1 = new Scanner(System.in);
          String user = scanner1.nextLine();
          while (scanner.hasNextLine()){
              System.out.println("1");
              String nextL = scanner.nextLine();
              if(nextL.equals(user)){
              System.out.println("2");
                  System.out.println(user+" is on the file");
                  break;
              }
              else if(user=="g"){
                  System.out.println(user+" not found");

              }


          }
      }
      catch (Exception e){
          System.out.println(e.getMessage());
      }

    }
}
