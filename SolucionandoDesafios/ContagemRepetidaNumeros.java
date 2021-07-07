package SolucionandoDesafios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemRepetidaNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valores = sc.nextInt();
        
        Map<Integer, Integer> numeros = new HashMap<>();
        for(int i = 0; i< valores ; i++)
        {	
            var numero = sc.nextInt();
            if(numeros.containsKey(numero))
            {
            var quantidade = numeros.get(numero);
            numeros.put(numero, ++quantidade);
            }
            else
            {
            numeros.put(numero,1);
            }
        }
        numeros.entrySet().stream().sorted(Map.Entry.comparingByKey())
        .forEach(n -> System.out.println(n.getKey() + " aparece " + n.getValue()+" vez(es)"));
        sc.close();
        }
    
}
