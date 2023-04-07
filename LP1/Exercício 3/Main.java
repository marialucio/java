import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("Informe sua idade:");
    int idade = sc.nextInt();

    if (idade >= 16)
      System.out.println("Você já possui idade para votar!!");
    else
      System.out.println("Você não possui idade para votar.");

    sc.close();    
  }
}