import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {

        TreeSet<Integer> grade = new TreeSet<>();

        grade.add(30);
        grade.add(100);
        grade.add(50);

        Integer i;
        i=grade.first();
        System.out.println(i);

        i=grade.last();
        System.out.println(i);

        i=grade.lower(80);
        System.out.println(i);

        i=grade.higher(80);
        System.out.println(i);

    }
}