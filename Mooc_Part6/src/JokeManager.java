import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    ArrayList<String> list;

    public JokeManager() {
        this.list = new ArrayList<>();
    }

    public void addJoke(String joke) {
        list.add(joke);
    }

    public String drawJoke() {
        if (list.size() == 0) {

            return "List empty add jokes first";
        }

        Random rand = new Random();
        int randInt = rand.nextInt(list.size());
        return list.get(randInt);
    }

    public void printJokes() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
