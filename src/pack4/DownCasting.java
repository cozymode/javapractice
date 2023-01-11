package pack4;

public class DownCasting {
  public static void main(String[] args) {
    Person p = new Person();
    Student s = (Student) p;
    ;
    System.out.println(s.name+s.number);
    s.whoAmI();
    s.work();
    Student s1 = new Student();

  }


}
