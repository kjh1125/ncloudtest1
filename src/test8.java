import java.util.*;


class Student{
    int studentNum;
    String name;

    Student(int studentNum, String name){
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public int hashCode(){
        return studentNum;
    }
    @Override
    public boolean equals(Object obj){
        Student s =(Student)obj;
        if(s.studentNum == this.studentNum){
            return true;
        }
        else
            return false;
    }
}

public class test8 {
    public static void main(String[] args) {

        Set<Student> set = new HashSet<>();
        set.add(new Student(1,"홍길동"));
        set.add(new Student(2,"신용권"));
        set.add(new Student(1,"조민우"));

        System.out.println(set.size());
        for(Student s: set){
            System.out.println(s.studentNum+" "+s.name);
        }


    }
}