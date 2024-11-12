import java.awt.*;

class Container<T>{
    public T a;

    public void set(T a){
        this.a = a;
    }
    public T get(){
        return this.a;
    }

}

public class test13_2 {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.get();

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);
        int value = container2.get();

        System.out.println(str + value);
    }
}