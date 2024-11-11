import java.util.HashMap;

public class abbr {
    HashMap<String,String> hm;
    public abbr(){
        this.hm = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation){
        hm.put(
                abbreviation,explanation
        );
    }
    public boolean hasAbbreviation(String abbreviation){
        if(hm.containsKey(abbreviation)){
            return true;
        }
        return false;
    }
    public String findExplanationFor(String abbreviation){
        return hm.get(abbreviation);
    }

    public static void main(String[] args) {
        abbr abbreviations = new abbr();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();

    }



}
