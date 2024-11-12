import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {

        HashMap<String,String> n = new HashMap();
        n.put("water","물");
        n.put("water1","물1");
        n.put("water2","물2");

        Set<String> keys = n.keySet();

        Iterator<String> it = keys.iterator();

        while(it.hasNext()){
            String k = it.next();
            String v = n.get(k);
            System.out.println(k);
            System.out.println(v);

        }

    }
}