import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String title;
    private Integer pages;
    private Integer year;
    public Book(String t,Integer p,Integer y){
        this.title = t;
        this.pages = p;
        this.year = y;
    }
//    public static String toStringFormat(String format){
//      switch(format){
//          case "name":
//              return "Title: "+this.t;
//          case "everything":
//              return "";
//          default:
//              return "";
//      }
//    }
    public static void print(String format,ArrayList<Book> b){
        if(format.equals("everything")){
            for(Book bookV:b){
                System.out.println("Title: "+bookV.title);
                System.out.println("Pages: "+bookV.pages);
                System.out.println("Publication year: "+bookV.year);
                System.out.println("*****************");
            }
        }
        else{
            for(Book bookV:b){
                System.out.println("Title: "+bookV.title);
                System.out.println("*****************");

            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){

            System.out.println("Enter title :");
            String titleU = scanner.nextLine();
            if(titleU.isEmpty()){
                break;
            }
            System.out.println("Enter pages :");
            Integer pagesU = Integer.valueOf(scanner.nextLine());
            System.out.println("Enter Publication year :");
            Integer yearU = Integer.valueOf(scanner.nextLine());
            Book book = new Book(titleU,pagesU,yearU);
            books.add(book);
        }
        System.out.println("What information to be printed?");
        String userResponse = scanner.nextLine();
//        Book.toStringFormat(userResponse);
            Book.print(userResponse,books);
    }
}
