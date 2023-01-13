package Project1;

import java.util.Scanner;

public class Cal {
  public static void main(String[] args) {
    int num1 = 0;
    int num2 = 0;
    String op = "";

    System.out.println("피연산자(정수)를 입력하세요.");
    Scanner sc1 = new Scanner(System.in);
    while (!sc1.hasNextInt()) {
      System.out.println("다시 입력해주세요.");
      sc1 = new Scanner(System.in);
    }
    num1 = sc1.nextInt();


    System.out.println("연산자를 입력해주세요.(+,-,*,/)");
    Scanner sc2 = new Scanner(System.in);
    do {
      op = sc2.nextLine();
      System.out.println("다시 입력해주세요.");
    } while (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/"));

    System.out.println("피연산자(정수)를 입력하세요.");
    Scanner sc3 = new Scanner(System.in);
    while (!sc3.hasNextInt()) {
      System.out.println("다시 입력해주세요.");
      sc3 = new Scanner(System.in);
    }
    num2 = sc3.nextInt();

    switch (op) {
      case "+":
        Add ad = new Add(num1, num2);
        System.out.println("덧셈 결과는 " + ad.calculate() + " 입니다.");
        break;
      case "-":
        Sub sb = new Sub(num1, num2);
        System.out.println("뺄셈 결과는 " + sb.calculate() + " 입니다.");
        break;
      case "*":
        Mul ml = new Mul(num1, num2);
        System.out.println("곱셈 결과는 " + ml.calculate() + " 입니다.");
        break;
      case "/":
        Div dv = new Div(num1, num2);
        System.out.println("나눗셈 결과는 " + dv.calculate() + " 입니다.");
        break;
    }


  }
}

class Add {
  private int num1 = 0;
  private int num2 = 0;

  Add(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  int calculate() {
    return num1 + num2;
  }

}

class Sub {

  private int num1 = 0;
  private int num2 = 0;

  Sub(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  int calculate() {
    return num1 - num2;
  }

}

class Mul {

  private int num1 = 0;
  private int num2 = 0;

  Mul(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  int calculate() {
    return num1 * num2;
  }

}

class Div {

  int result = 0;
  private int num1 = 0;
  private int num2 = 0;

  Div(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  int calculate() {
    try {
      return num1 / num2;
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    }
    return num1 / num2;
  }

}