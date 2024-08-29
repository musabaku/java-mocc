public class part2_method {
    public static void main(String[] args) {

        patternSquare(4);
        patternRectangle(17,3);
        patternLeftTriangle(4);
        patternRightTriangle(4);
        patternChristmasTree(10);
    }

    public static void patternSquare(int x){
        for (int j = 0; j < x; j++) {
            for (int i = 0; i < x; i++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }

    public static void patternRectangle(int w,int h){
        for (int j = 0; j < h; j++) {
            for (int i = 0; i < w; i++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }

    public static void patternLeftTriangle(int l){
        int k = 0;
        for (int j = 0; j < l; j++) {
            k++;

            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void patternRightTriangle(int l){
        int k = 0;
        int t = l;
        for (int j = 0; j < l; j++) {
            t--;
            k++;
            for (int p = 0; p < t; p++) {
                System.out.print(" ");
            }
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    public static void patternChristmasTree(int l){
        int k = -1;
        int t = l;
        for (int j = 0; j < l; j++) {
            t--;
            k+=2;
            for (int p = 0; p < t; p++) {
                System.out.print(" ");
            }
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        int y = (k/2) - 1;
        for (int m = 0; m < 2; m++) {
            for (int p = 0; p < y; p++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 3; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }






    }
}
