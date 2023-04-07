import java.util.Scanner;

class Exercicio2 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Informe o total de maçã compradas");
     int maças = sc.nextInt();

     if (maças >= 12){
       double preço = (maças*0.25);
       System.out.println("O preço a pagar será R$" + preço);
     }
     else{
       double preço = (maças*0.30);
       System.out.println("O preço a pagar será R$" + preço);
     }
       
     sc.close();
  }
}