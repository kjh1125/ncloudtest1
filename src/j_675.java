import java.util.TreeSet;

class Person1 implements Comparable<Person1> {
    public String name;
    public int age;

    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person1 o) {
        if(age == o.age){
            return 0;
        }
        else if(age < o.age){
            return -1;
        }
        return 1;
    }

}

public class j_675 {
    public static void main(String[] args) {
        TreeSet<Person1> treeSet = new TreeSet<Person1>();

        treeSet.add(new Person1("홍길동",45));
        treeSet.add(new Person1("감자바",25));
        treeSet.add(new Person1("박지원",31));

        for(Person1 person : treeSet){
            System.out.println(person.name + " " + person.age);
        }


    }
}