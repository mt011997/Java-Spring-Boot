package Métodos;

public class Main {
  
  static String showHelloWorld(){
    return "Hello World!";
  }

  static int sumNumbers(int n1, int n2){
    return n1 + n2;
  }
  public static void main(String[] args) {
    System.out.println(showHelloWorld());
    System.out.println(sumNumbers(20, 30));
  }  
}
