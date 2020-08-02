/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet;

class boxx
  {
  double height;
  double width;
  double depth;
  
  void volume()
{
double vol = height*width*depth;
System.out.println("volume"+vol);

}
}
 public class Twoseperateobject {
    public static void main(String[] arg)
    {
        boxx a=new boxx();
        boxx b=new boxx();
        a.height=10;
        a.width=20;
        a.depth=30;
        b.height=100;
        b.width=200;
        b.depth=300;
        a.volume();
        b.volume();
    }
}
        
        
        
        
    
    

