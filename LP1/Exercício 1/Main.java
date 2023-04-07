import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Informe a senha");
    int senha = sc.nextInt();
    
    if (senha == 1234)
       System.out.println("ACESSO PERMITIDO.");
    else
        System.out.println("ACESSO NEGADO.");

    sc.close();
  }
}