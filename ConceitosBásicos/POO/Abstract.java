package POO;

public abstract class Abstract {
  public void helloWorld(){
    System.out.println("Hello World!");
  }

  public abstract void olaMundo();
}

class SubAbstract extends Abstract{

  public void olaMundo() {
    System.out.println("Olá mundo");
  }
  
}
