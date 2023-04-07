import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("Informe um número");
    int numero = sc.nextInt();

    if ((numero % 2) == 0)
      System.out.println("Esse número é par!!");
    else
      System.out.println("Esse número é ímpar!!");

    sc.close();  

  }
}