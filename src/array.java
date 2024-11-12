import java.util.ArrayList;
import java.util.Iterator;


class XY{
    private int x,y;

    public XY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){ // 해당 부분 Override해서 수정해주지 않으면 주소값이 나옴.
        return x+" "+y;
    }

}

public class array {
    public static void main(String[] args) {
        //컬렉션: 가변 개수의 객체들의 저장소
        //제네릭기법으로 구현.
        ArrayList<XY> li = new ArrayList<XY>();
        li.add(new XY(55,56));
        li.add(new XY(52,12));
        li.add(new XY(511,123));

        System.out.println("객체수:"+li.size());

        for(int i=0;i<li.size();i++){
            XY xy=li.get(i);
            System.out.println(xy);
        }

        //iterator : 컬렉션 순차검색
        Iterator it = li.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}