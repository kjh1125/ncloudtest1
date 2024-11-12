import java.util.HashMap;
import java.util.Map;

class Container1<T, A>{
    public T a;
    public A b;

    public void set(T a, A b){
        this.a = a;
        this.b = b;
    }
    public T getKey(){
        return a;
    }
    public A getValue(){
        return b;
    }

}

public class test13_3 {
    public static void main(String[] args) {
        Container1<String,String> container1 = new Container1<String,String>();
        container1.set("홍길동","도적");
        String name1 = container1.getKey();
        String job = container1.getValue();

        Container1<String,Integer> container2 = new Container1<String,Integer>();
        container2.set("홍길동",35);
        String name2 = container2.getKey();
        int age = container2.getValue();

        System.out.println(name1 + job);
        System.out.println(name2 + age);
    }
}