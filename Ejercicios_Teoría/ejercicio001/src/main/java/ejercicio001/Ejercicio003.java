
package ejercicio001;

import java.util.ArrayList;

public class Ejercicio003 {
    public static void main(String[] args) {
        ArrayList<Integer> numerosA = new ArrayList();
        
        int x = 7;
        Integer y = 9;
        
        numerosA.add(x);  
        numerosA.add(y);
        numerosA.add(3);
        numerosA.add(10);
        numerosA.add(11);
        
        numerosA.remove(0);//remove índice
        numerosA.remove(y);//remove elemento
        
        System.out.println(numerosA);
    }
}
