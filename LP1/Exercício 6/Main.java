import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<String> lista = new ArrayList<String>();

    System.out.println("Informe 5 nomes:");
    for(int i = 0; i < 5; ++i){
      lista.add(sc.nextLine());
    }

    System.out.println("------------------------");
    System.out.println("Nomes na ordem inversa:");
    for (int i = 4; i >= 0; --i){
      System.out.println(lista.get(i));
    }

    sc.close();
  }
}