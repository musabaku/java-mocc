import java.util.ArrayList;
import java.util.HashMap;

public class HashMapLearn {
    private HashMap<String,ArrayList<String>> hm;
    public HashMapLearn(){
        this.hm = new HashMap<>();
    }
    public void add(String unit , String item){
    this.hm.putIfAbsent(unit, new ArrayList<>());
    this.hm.get(unit).add(item);
    }
    public ArrayList<String> contents(String storageUnit){
      ArrayList<String> list =  hm.get(storageUnit);
      if(list.isEmpty()|| list ==null){
          return new ArrayList<>();
      }
      return list;
    }
    public void remove(String storageUnit, String item){
        ArrayList<String> list = this.hm.get(storageUnit);
        list.remove(item);
    }
    public static void main(String[] args) {
        HashMapLearn facility = new HashMapLearn();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

//        HashMap<String, ArrayList<String>> hm = new HashMap<>();

//        ArrayList<String> list = new ArrayList<>();
//        list.add("bcd");
//        list.add("bcd");
//        list.add("bcd");
//        hm.put("a",list);
//        hm.put("b",list);
//        System.out.println(hm.get("a"));
//        System.out.println(hm.get("b"));


//        HashMap<String,String> hm = new HashMap<>();
//        hm.put("Musab","MAK");
//        hm.put("Nusab","NAK");
//        hm.put("Zusab","ZAK");
//        hm.put("Xusab","XAK");
//        System.out.println(hm.get("Musab"));


    }
}
