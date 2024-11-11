import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        int n = list.size();

        int[] arr = {1,2};
        int n = arr.length;

    func1(0,list,arr);
    }
    public static void func1(int index, ArrayList<Integer> list, int[] arr){
        if(index >=arr.length){
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        func1(index+1,list,arr);
        list.remove(list.size()-1);
        func1(index+1,list,arr);

    }
}