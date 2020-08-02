/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet;

import java.util.Scanner;

/**
 *
 * @author BHARATH sharan
 */
public class Arithematic {
       public static void main(String[] as){
        arithematicop ar=new arithematicop();
        ar.operations();
   
    }
    
    
}
class arithematicop 
{
    int add;
    int sub;
    double mul;
    double div;
    

  void operations ()
{
       System.out.println("enter two numbers and b");
       Scanner ab =new Scanner(System.in);
       int a=ab.nextInt();
       int b=ab.nextInt();
       int add=a+b;
       int sub=a-b;
       double mul=a*b;
       double div=a/b;
       System.out.println("addition of a"+a+"and b "+b+"is"+add);
       System.out.println("subtration of a"+a+"and b "+b+"is"+sub);
       System.out.println("multiplication of a"+a+"and b "+b+"is"+mul);
       System.out.println("division of a"+a+"and b "+b+"is"+div);
       
       
       
}
}

