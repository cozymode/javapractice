public class MethodChain {
  public static void main(String[] args) {
    Person p = new Person();
//    p.setAge(21);
//    p.setName("민국");
//    p.sayHello();
    p.setAge(21).setName("민국").sayHello();
    //set의 리턴을 void가 아니라 객체 자신으로 해야됨
  }
}

class Person {

  private String name = ""; // null이 되지 않도록
  private int age;

  public String getName() {
    return name;
  }

  public Person setName(String name) {
    this.name = name;
    return this;
  }

  public int getAge() {
    return age;
  }

  public Person setAge(int age) {
    this.age = age;
    return this;
  }

  public void sayHello() {
    System.out.println("이름은 " + name + " 나이는 " + age);
  }

}
