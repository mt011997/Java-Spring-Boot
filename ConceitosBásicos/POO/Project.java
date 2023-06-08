package POO;

public class Project {

  private String name;

  public Project(String name) {
    this.name = name;
  }

  String returnHelloWorld() {
    return "Hello  World!";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

class Subclass extends Project {

  private int age;

  public Subclass(String name, int age) {
    super(name);
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  String returnHelloWorld() {
    return "Hello World subclass!";
  }
}
