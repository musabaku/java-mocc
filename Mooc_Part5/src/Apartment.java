import static java.lang.Math.abs;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment apartment){
        if(this.squares>apartment.squares){
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment apartment){
        return abs((this.squares*this.pricePerSquare) -(apartment.squares*apartment.pricePerSquare));

    }
    public boolean moreExpensiveThan(Apartment apartment){
        if(this.squares*this.pricePerSquare>apartment.squares*apartment.pricePerSquare){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));       // false
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true


        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400

        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true


    }
}
