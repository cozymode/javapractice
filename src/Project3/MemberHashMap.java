package Project3;
//- 나의 전화번호 정보 관리 프로그램을 만들어보자
//
//Phone을 클래스로 작성하여 하나의 전화번호 정보를 표현한다
//하나의 전화 정보는 이름, 주소, 전화번호로 구성된다
//동일한 이름을 가진 사람이 입력되지 않도록 프로그램에서 걸러야 한다
//이 프로그램의 메뉴는 등록,삭제,찾기,전체보기,종료의 총 5가지
//
//- 등록의 경우 전체 정보를 등록함
//- 삭제의 경우 해당 정보로 조회했을 때 존재하는 경우에만 삭제한다 없으면 등록되지 않은 사람입니다. 메시지 보여주기
//- 찾기 - 이름으로 전화번호와 주소정보 조회
//- 전체보기
//- 프로그램 종료

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class PhoneMain {
  public static void main(String[] args) {
    MemberHashMap memberHashMap = new MemberHashMap();

    Member1 m1 = new Member1("허수지", "강동구", "01021053990");
    Member1 m2 = new Member1("홍길동", "강남구", "01021053991");
    Member1 m3 = new Member1("홍길순", "강서구", "01021053992");

    //등록
    memberHashMap.addMember(m1);
    memberHashMap.addMember(m2);
    memberHashMap.addMember(m3);

    //삭제
    System.out.println("삭제 할 이름을 입력해주세요.");
    Scanner sc = new Scanner(System.in);
    String name = "";
    name = sc.nextLine();
    memberHashMap.removeMember(name);

    //찾기
    System.out.println("검색 할 이름을 입력해주세요.");
    sc = new Scanner(System.in);
    name = sc.nextLine();
    Member1 mem = memberHashMap.selectMember(name);
    System.out.println(name + "의 주소는 " + mem.addr);
    System.out.println(name + "의 번호는" + mem.phone);

    //전체보기
    memberHashMap.selectAll();


  }
}

class Member1 {

  String name = "";
  String addr = "";
  String phone = "";

  Member1(String name, String addr, String phone) {
    this.name = name;
    this.addr = addr;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public String getAddr() {
    return addr;
  }

  public String getPhone() {
    return phone;
  }
}

public class MemberHashMap {
  private HashMap<String, Member1> hashMap;

  public MemberHashMap() {
    hashMap = new HashMap<String, Member1>();
  }

  //등록
  public void addMember(Member1 member) {

    hashMap.put(member.getName(), member);

  }

  //삭제
  public boolean removeMember(String name) {
    if (hashMap.containsKey(name)) {
      hashMap.remove(name);
      return true;
    } else {
      System.out.println(name + "회원의 정보가 존재하지 않습니다.");
      return false;
    }
  }

  //찾기
  public Member1 selectMember(String name) {
    Member1 mem = hashMap.get(name);
    return mem;
  }

  //모두 검색

  public void selectAll() {
    Iterator<String> ir = hashMap.keySet().iterator();
    while (ir.hasNext()) {
      String key = ir.next();
      Member1 member = hashMap.get(key);
      System.out.println(member);
    }
    System.out.println();
  }

}
