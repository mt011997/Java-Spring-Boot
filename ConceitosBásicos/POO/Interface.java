package POO;

interface MyInterface{
  public void sayMyName(String name);
}

interface MySecondInterface{
  public void notSayMyName(String name);
}

public class Interface implements MyInterface, MySecondInterface{
  public void sayMyName(String name) {
    System.out.println(name);
  }
  
  public void notSayMyName(String name){
    System.out.println(name);
  }
}
