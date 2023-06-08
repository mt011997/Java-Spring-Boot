package POO;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Project projectClass = new Project("Matheus");
    Subclass subClass = new Subclass("Cleitin", 22);
    SubAbstract subAbstractClass = new SubAbstract();
    Interface interfaceClass = new Interface();

    System.out.println(projectClass.getName());
    projectClass.setName("Cleiton");
    System.out.println(projectClass.getName());
    System.out.println(projectClass.returnHelloWorld());

    System.out.println(subClass.getAge());
    System.out.println(subClass.returnHelloWorld());

    subAbstractClass.helloWorld();
    subAbstractClass.olaMundo();

    interfaceClass.sayMyName("Matheus");
    interfaceClass.notSayMyName("Cleiton");

    Scanner scanner = new Scanner(System.in);

    System.out.println("Seu nome: ");
    String userInput = scanner.nextLine();

    System.out.println("O usuário é: " + userInput);
  }
}
