//A java program that dispalys all multiple of 2,3 and 7 within the range of 71
//amd 150.s
package javaapplication9;

public class JavaApplication9 {

  
    public static void main(String[] args) {
        System.out.println("\n divided by 2");
        for(int i=71;i<150; i++){
            if(i%2==0)
                System.out.print(i+",");
            }
        System.out.println("\n divided by 3");
        for(int i=71;i<150; i++){
            if(i%3==0)
                System.out.print(i+",");
        }
        System.out.println("\n divided by 7");
        for(int i=71;i<150; i++){
            if(i%7==0)
                System.out.print(i+",");
        }
        
        System.out.println("\n divided by 2,3 and 7:");
        for(int i=71;i<150; i++){
            if(i%2==0 && i%3==0 && i%7==0)
                System.out.print(i+",");
        }
        System.out.println("\n");
    }
}