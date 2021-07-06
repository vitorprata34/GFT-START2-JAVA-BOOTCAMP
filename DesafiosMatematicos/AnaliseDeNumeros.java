package DesafiosMatematicos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnaliseDeNumeros {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("");
        int a = leitor.nextInt();
        System.out.println("");
        int b = leitor.nextInt();
        System.out.println("");
        int c = leitor.nextInt();
        System.out.println("");
        int d = leitor.nextInt();
        System.out.println("");
        int  e = leitor.nextInt() ;
        
        List<Integer> numeros = new ArrayList<>();
        numeros.add(a);
        numeros.add(b);
        numeros.add(c);
        numeros.add(d);
        numeros.add(e);
        
        System.out.println(numeros.stream().filter(x->x%2==0).count() + " valor(es) par(es)");
        System.out.println(numeros.stream().filter(x->x%2!=0).count()+ " valor(es) impar(es)");
        System.out.println(numeros.stream().filter(x->x>0).count() + " valor(es) positivo(s)");
        System.out.println(numeros.stream().filter(x->x<0).count() + " valor(es) negativo(s)");
        leitor.close();
    }   
}
