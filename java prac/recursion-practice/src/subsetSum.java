import java.util.ArrayList;

public class subsetSum {
    int[] arr = {1,3,4,5,2,1};
    int n = arr.length;
    int target = 3;
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        subsetSum ss = new subsetSum();
        ss.func1(0, list, 0);

//        func1(0,list,0);
    }
    public void func1(int index,ArrayList<Integer> list,int sum){
        if(index >= n){
            if(sum == target){
                System.out.println(list);
            }
            return;
//            outside return important cause this also handles cases where sum is not equal to target
        }
        list.add(arr[index]);
        sum += arr[index];
        func1(index+1,list,sum);
        list.remove(list.size()-1);
        sum -= arr[index];
        func1(index+1,list,sum);
    }
}
