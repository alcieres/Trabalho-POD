package ex0101;
 
import java.util.Scanner;

public class Ex0101 {
     
    public static int maior(int a, int b){
        return a > b ? a : b;
    }   
    
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      System.out.println("Digite o primeiro numero:");
      int a = in.nextInt();
      System.out.println("Digite o segundo numero:");
      int b = in.nextInt();
        System.out.println("O maior número é: " + maior(a, b));
    }
         
}
/* O fabricio esteve aqui =D  */
/* O Alcieres editou o arquivo */

