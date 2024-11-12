import java.util.*;


public class test9 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("blue",96);
        map.put("hong",86);
        map.put("white",92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        for(Map.Entry<String,Integer> m:map.entrySet()){
            int score = m.getValue();
            String nn = m.getKey();
            totalScore += score;

            if(maxScore < score){
                maxScore = score;
                name = nn;
            }

        }

        System.out.println("평균 점수: "+ (int)totalScore/3);
        System.out.println("최고 점수: "+ maxScore);
        System.out.println("최고 점수를 받은 아이디: "+ name);


    }
}