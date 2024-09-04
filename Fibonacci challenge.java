package fibonacci;

import java.util.ArrayList;

/**
 *
 * @author Tasbeeh Naser
 */
public class Fibonacci {

 public static int lastNumber(ArrayList<Integer> a) {
        int lastOne = a.get(a.size() - 1) + a.get(a.size() - 2);
        return lastOne;
    }
   
    public static void main(String[] args) {
     ArrayList<Integer>   Fibonacci=new ArrayList<Integer>(); 
     Fibonacci.add(0);
     Fibonacci.add(1);
     while(Fibonacci.get(Fibonacci.size()-1) != 55){
         Fibonacci.add(lastNumber(Fibonacci));
     }
        System.out.println(Fibonacci);
     
    }
    
}
