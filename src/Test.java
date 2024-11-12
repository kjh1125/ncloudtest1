import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("one");
        li.add("two");
        li.add("three");

        Iterator<String> it = li.iterator();

        while(it.hasNext()){
            String word = it.next();
            if(word.compareTo("three")==0) {
                it.remove();
            }
        }
    }
}