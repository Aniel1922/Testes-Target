import java.util.Scanner;

public class Letra {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = s.nextLine();

        int cont = 0;
       // palavra = palavra.toLowerCase();

        for(int i = 0; i < palavra.length(); i++) {
            if(palavra.charAt(i)== 'a') {
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("A letra 'a' aparece " + cont + " vezes");
        }else{
            System.out.println("A letra 'a' não foi encontrada na palavra digitada.");
        }
    }
}
