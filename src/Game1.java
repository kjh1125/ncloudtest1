import java.util.*;
class Person{
    private String name;
    private int id;

    Person(String n, int i){
        name=n;
        id=i;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj){
        Person p=(Person) obj;
        if(p.getId()==this.id && p.getName().equals(this.name)){
            return true;
        }
        return false;
    }
}
class Game{

    ArrayList<Person> a= new ArrayList<>(5);
    Scanner s=new Scanner(System.in);

    Game(){ //초기화
        a.add(new Person("도현",123));  //[0]
        a.add(new Person("하형",456));  //[1]
        a.add(new Person("왕휘",789));  //[2]
        a.add(new Person("다훈",112));  //[3]
        //태선 123[4]
    }
    void in(){
        while (true){
            System.out.println("이름, id입력");
            String name=s.next();  //도현

            if(name.equals("stop")){
                break;
            }
            int id=s.nextInt(); //123
            Person pp=new Person(name,id); //Person클래스 객체 생성

            if(a.contains(pp)){  //리스트에 있는 객체인지 아닌지 여부
                System.out.println(pp.getName()+"은 이미 리스트에 있다");
            }
            else{
                a.add(pp);
            }
        }
    }

    void out(){
        while (true){
            Random r= new Random();
            int n=r.nextInt(a.size());
            //0~4사이의 난수 발생시켜서 n에 저장

            Person p=a.get(n); //get(index)
            String str=p.getName();

            System.out.println("인덱스 "+ n);
            System.out.println(str+"의 id는?"); //왕휘의 id는?
            int id=p.getId();  //789

            Scanner s= new Scanner(System.in);

            int id2=s.nextInt();

            if(id2==-1){
                break;
            }
            if(id2==id){
                System.out.println("정답");
            }
            else System.out.println("정답아님");
        }
    }
    void end(){
        System.out.println("종료");
        System.exit(0); //프로그램 종료(현재 실행하고 있는 프로세스를 강제 종료시킴)
    }
}
public class Game1 {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        Game g = new Game();
        while (true){
            System.out.println("1,2,3");
            int select = s.nextInt();

            switch (select){
                case 1:
                    g.in();
                    break;
                case 2:
                    g.out();
                    break;
                case 3:
                    g.end();
                    break;
            }
        }
    }
}