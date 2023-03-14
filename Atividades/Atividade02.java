package Atividades;
import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String textoInvertido, texto;
        Integer i;
        
        System.out.print("Insira algo: ");
        texto = scan.nextLine();
        textoInvertido="";
        
        for (i = texto.length()-1; i >= 0; i--) {
            textoInvertido = textoInvertido + texto.charAt(i);
        }
        
        System.out.println("↓");
        System.out.print("Inversão: " + textoInvertido);
    }
}
