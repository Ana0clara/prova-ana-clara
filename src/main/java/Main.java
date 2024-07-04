import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
   
    
   Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite seu nome "); 
    String nome = sc.next();
    System.out.println("Digite seu sobrenome"); 
    String sobrenome = sc.next();
    System.out.println("Digite sua idade: "); 
    Double idade = sc.nextDouble();
    System.out.println("digite sua altura: ");
    Double altura = sc.nextDouble();
    
    Double peso = sc.nextDouble();

   

    System.out.printf("Olá %d , fizemos uma breve analise das informações passadas e temos as seguintes informações a repassar:", nome + sobrenome);

    System.out.printf("O seu peso ideal é: %2.f kg %n", peso);
  

    
    
    System.out.println("Obrigado por usar nosso aplicativo! ");
    
    sc.close();
  }
}