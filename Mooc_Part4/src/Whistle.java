public class Whistle {
    private double P;
    private double R;
    public Whistle(double P,double R){
        this.P = P;
        this.R = R;
    }
    public Whistle(){
//        this.sound = null;
    }
    public void sound(){
        System.out.println(this.P);
    }
    public void calculate(){
        P = (this.P * this.R * 1);
    }

//    public void decrement(){
//        this.value -= 1;
//    }

    public static void main(String[] args) {
        Whistle musab = new Whistle(120000.0, 1.01);

        musab.sound();
//        musab.calculate();
        musab.sound();
        int years = 0;

        while (years <= 20) {
            musab.calculate();
            years = years + 1;
        }
        musab.sound();



    }
}
