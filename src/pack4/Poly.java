package pack4;

public class Poly {
  public static void main(String[] args) {
    Student s = new Student();
    Person p = null;

    p = s;
    //조상 타입을 자손 타입으로 올리는거 , 형변환이 됐다고 자손만 가지고 있는거 사용 x
    //Person이 가지고 있는 특징 만
    System.out.println(p.name);
    //System.out.println(p.number); 사용불가
    p.whoAmI();
  }
}
