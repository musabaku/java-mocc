import java.util.Arrays;

public class Sorting {



    public static int smallest(int[] array){
        int ans = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]<ans){
                ans = array[i];
            }
        }
        return ans;
    }
    public static int indexOfSmallest(int[] array){
        int ans=0;
        for (int i = 1; i < array.length; i++) {
            if(array[i]<array[ans]){
                ans = i;
            }
        }
        return ans;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        if(startIndex>table.length){
            return -1;
        }
        int ans = startIndex;
        for (int i = startIndex;i<table.length;i++){
            if(table[i]<table[ans]){
                ans = i;
            }
        }
        return ans;
    }
    public static void swap(int[] array, int index1, int index2) {
        if(array[index1]<array[index2]){
            return;
        }
        int temp=0;
        temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            System.out.println("**************");
            System.out.println(i + "th Sorting Starting");
            System.out.println(Arrays.toString(array));
            swap(array,i,indexOfSmallestFrom(array,i+1));
            System.out.println(i + "th Sorting Ended");
            System.out.println(Arrays.toString(array));
            System.out.println("**************");
        }
    }
    public static void main(String[] args) {
//        int[] arr = {11,4,10,22,2};
        int[] arr = {11,4,10,22,21,3,4,6,0};
//        System.out.println(Sorting.smallest(arr));
//        System.out.println(Sorting.indexOfSmallest(arr));
//        System.out.println(Sorting.indexOfSmallestFrom(arr,1));
//        swap(arr,1,3);
//        sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
