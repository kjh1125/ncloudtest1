import java.util.Iterator;
import java.util.TreeSet;

class Pro implements Comparable<Pro>{

    private String a;
    private int b;

    Pro(String a, int b){
        this.a = a;
        this.b = b;
    }
    void show(){
        System.out.println(a+" "+b);
    }

    @Override
    public int compareTo(Pro o) {
        if(b > o.b){  //b 후자 값을 기준으로 오름차 순. // String 비교 시 compareTo > 0
            return 1;
        }
        else if(b < o.b){
            return -1;
        }
        return 0;
    }
}

public class Treeset2 {
    public static void main(String[] args) {

        TreeSet<Pro> t = new TreeSet<Pro>();

        t.add(new Pro("cc",30));
        t.add(new Pro("aa",60));
        t.add(new Pro("bb",20));

        Iterator<Pro> it = t.iterator();

        while(it.hasNext()){
            it.next().show();
        }

    }
}