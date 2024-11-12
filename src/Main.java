import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //컬렉션: 가변 개수의 객체들의 저장소
        //제네릭기법으로 구현.
        List<Integer> li = new ArrayList<>();
        li.add(55);
        li.add(545);
        li.add(555);

        li.add(2,100);

        System.out.println("객체수:"+li.size());

        Iterator it = li.iterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }
    }
}