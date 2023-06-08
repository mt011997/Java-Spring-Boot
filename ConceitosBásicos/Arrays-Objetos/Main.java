import java.util.ArrayList;
import java.util.HashMap;

public class Main{
  public static void main(String[] args) {
    
    //Arrays
    ArrayList<String> myArray = new ArrayList<String>();
    myArray.add("Matheus");
    myArray.add("Teste");

    System.out.println(myArray);
    System.out.println(myArray.get(0));

    System.out.println(myArray.size() == 0 ? "Array vazio" : "Array não vazio");
    
    // if( myArray.size() == 0){
    //   System.out.println("Array vazio");
    // }else{
    //   System.out.println("Array não vazio");
    // }

    //Objetos
    HashMap<String, String> myObject = new HashMap<>();

    myObject.put("nome", "Matheus");
    myObject.put("idade", "25");

    System.out.println(myObject.get("idade"));
  }
}