/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aydin._recursion;

/**
 *
 * @author ilknu
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Main started...");
        //sayHello(5);
        int result = findFact(5);
        System.out.println("5! is " + result);
        System.out.println("Main ended...");
    }  

    public static int findFact(int n){        
        int result ;
        if (n <=1 ){ // base case
            result = 1;
        }
        else {       
            result = n * findFact(n-1);  // recursive call          
        }
        return result;
    }
        public static void sayHello(int count){        
        if (count == 1){ // base case
            System.out.println(count + " Hello");
        }
        else {       
            System.out.println(count + " Hello");
            sayHello(count-1); // recursive case: because this is a self call)
        }
    }
}
