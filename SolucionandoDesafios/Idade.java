package SolucionandoDesafios;

import java.io.IOException;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int n=1;
        double soma =0;
        double cont = 0;
        while (n >= 1)
        {
            n = leitor.nextInt();
            if(n > 0)
            {
        	soma+=n;
        	cont++;
            }
        }
       double media = soma / cont;
       System.out.println(String.format("%.2f", media));
       leitor.close();
    }
    
}
