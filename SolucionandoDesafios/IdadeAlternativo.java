package SolucionandoDesafios;

import java.io.IOException;
import java.util.Scanner;

public class IdadeAlternativo {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int n;
        double soma =0;
        double cont = 0;
        do
        {
            n = leitor.nextInt();
            if(n >=1)
            {
        	soma+=n;
        	cont++;
            }
        }while (n >= 1); 
       double media = soma / cont;
       System.out.println(String.format("%.2f", media));
       leitor.close();
    }
    
}
