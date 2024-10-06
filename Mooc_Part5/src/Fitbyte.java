public class Fitbyte {
    private int age;
    private double restingHeartRate;
    private double maxHeartRate;
    public Fitbyte(int age,double restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
        this.maxHeartRate = 206.3 - (0.711 * age);
    }

    public double targetHeartRate(double percentageOfMaximum){
    return ((maxHeartRate - restingHeartRate)*percentageOfMaximum)+restingHeartRate;
    }

    public static void main(String[] args) {
        Fitbyte assistant = new Fitbyte(30, 60);

        double percentage = 0.5;

        while (percentage < 1.0) {
            double target = assistant.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage = percentage + 0.1;
        }

    }
}

