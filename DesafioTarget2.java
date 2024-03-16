import java.util.Scanner;

public class InverteString {

    public static String inverteString(String string) {
        
        char[] caracteres = string.toCharArray();
        
        
        int comprimento = caracteres.length;
        
        
        for (int i = 0; i < comprimento / 2; i++) {
            
            char temp = caracteres[i];
            caracteres[i] = caracteres[comprimento - i - 1];
            caracteres[comprimento - i - 1] = temp;
        }
        
        
        String stringInvertida = new String(caracteres);
        
        return stringInvertida;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite uma string para inverter: ");
        String stringOriginal = scanner.nextLine();

        
        String stringInvertida = inverteString(stringOriginal);

       
        System.out.println("String original: " + stringOriginal);
        System.out.println("String invertida: " + stringInvertida);

        scanner.close();
    }
}
