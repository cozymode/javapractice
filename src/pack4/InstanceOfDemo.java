package pack4;

public class InstanceOfDemo {
  public static void main(String[] args) {


    Student s = new Student();
    Person p = new Person();

    System.out.println(s instanceof Person); //true
    System.out.println(s instanceof Student); //true
    System.out.println(p instanceof Student); //false
    System.out.println(s instanceof Object);  //true


  }
}
