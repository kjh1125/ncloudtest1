import java.util.TreeSet;

class Student1 implements Comparable<Student1> {
    public String id;
    public int score;

    public Student1(String id, int score){
        this.id = id;
        this.score = score;
    }

    @Override
    public int compareTo(Student1 o) {
        if(score > o.score){
            return 0;
        }
        else if(score < o.score){
            return -1;
        }
        return 1;
    }

}

public class test10 {
    public static void main(String[] args) {
        TreeSet<Student1> treeSet = new TreeSet<Student1>();
        treeSet.add(new Student1("blue",96));
        treeSet.add(new Student1("hong",86));
        treeSet.add(new Student1("white",92));

        Student1 student1 = treeSet.last();
        System.out.println("최고 점수: " + student1.score);
        System.out.println("최고 점수를 받은 아이디: "+ student1.id);
    }
}