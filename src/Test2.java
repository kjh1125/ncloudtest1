import java.util.*;


public class Test2 {
    public static void main(String[] args) {
        HashMap<String,String> n = new HashMap();
        n.put("1","one");
        n.put("2","two");
        n.put("3","three");

        Set<String> keys = n.keySet();

        Iterator<String> it = keys.iterator();

        while(it.hasNext()){
            String k = it.next();
            String v = n.get(k);
            System.out.println("키:"+k+" 값:"+v);
        }
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("키를 입력하시오");
            String answer = s.next();
            if(n.containsKey(answer)==true){
                System.out.println("해당 키의 값은:"+n.get(answer));
            }
            else{
                System.out.println("해당 키는 존재하지 않음.");
                continue;
            }
        }
    }
}