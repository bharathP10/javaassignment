import java util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet;

/**
 *
 * @author BHARATH sharan
 */
public class custin{
   public static void main(String[] arg){
       customers a=new customers(101,"bharath",30);
       System.out.println(a.getid());
       System.out.println(a.getname());
       System.out.println(a.getdiscount());
      a.setdiscount(30);
      System.out.println(a.getdiscount());
      System.out.println(a);
      
      invoice in =new invoice(102,a,2000);
      System.out.println(in.getid());
      System.out.println(in.getcustomer());
      
      customers b=new customers(101,"rani",30);
      in.setcustomer(b);
      System.out.println(in.getamount());
      in.setamount(2000);
      System.out.println(in.getcustomername());
      System.out.println(in.getamountafterdiscount());
   }              
   
}

class customers
{ int id;
 String name;
 int discount;
 
 customers(int i,String n,int d)
 { id = i;
   name =n;
   discount =d;
 }
 int getid()
 {
     return id;
 }
 String getname()
 {
     return name;
 }
  int getdiscount()
 {
     return discount;
 }
  void setdiscount(int d1)
  { discount =d1;
  }

  public String toString()
  {
      return "Name"+name+"           Id"+id;
    
  }

class invoice
  { 
      int id;
      customers o;
     double amount;
   invoice(int i,customers o1,double z)
     {
         id = i;
         o = o1;
         amount = z;
     }
     int getid()
     { 
         return id;
     }
     customers getcustomer()
             {
             return o;
     }
      void setcustomer(customers o2)
      {
          o = o2;
      }
      double getamount(){
          return amount;
      }
      void setamount(double z)
      {
          amount = z;
      }
      String getcustomername()
      { 
          return o.name;
      }
      double getamountafterdiscount()
      {
          return amount -(amount*o.discount)/100;
      }
  }
}