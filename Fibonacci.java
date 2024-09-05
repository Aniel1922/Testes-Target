import java.util.Scanner;

public class Fibonacci{
    public static boolean pertenceFibonacci(int num) {

        int a = 0, b = 1;
               
        while (b < num) {
            int guarda = b;
            b = a + b;
            a = guarda;
        }
        return b == num;
    }   
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = s.nextInt(); 
        
        if (pertenceFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
        
    }
}