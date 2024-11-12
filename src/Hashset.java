import java.util.HashSet;
import java.util.Iterator;

class Num{
    int n;

    Num(int n){
        this.n = n;
    }

    @Override
    public String toString(){ // int에 " "를 추가함으로써 String 화
        return n + " ";
    }

    @Override
    public int hashCode(){
        return n; // 기준을 정해서 그룹핑
    }

    @Override
    public boolean equals(Object obj){
        Num num =(Num)obj;
        if(num.n == n){
            return true;
        }
        else
            return false;
    }

}

public class Hashset {
    public static void main(String[] args) {

        HashSet<Num> h = new HashSet<Num>();
        h.add(new Num(10));
        h.add(new Num(20));
        h.add(new Num(30));
        h.add(new Num(10));

        Iterator<Num> it = h.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}