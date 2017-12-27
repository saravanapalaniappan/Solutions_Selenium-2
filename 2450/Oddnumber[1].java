

/*

Problem number 2a:
Emp id: 1243
Program to print odd numbers with alternative negative sign (1,-3,5,-7 etc)

Desc: This will print the expected functionality based on the "limit" integer variable 
is set. Here nubmer 20 is hard coded by instantiatin the obj in main method.

*/



public class Oddnumber{
    
    int limit;
    
    int i ;
    
    public void printodd(int l) 
    
    {
    
        this.limit = l;
        String flag="d";
       
        for(i=1;i<= limit;i ++)
    
    {
    
       if( i % 2 != 0)
       
        if (!flag.equals("p"))
        {
           System.out.println(" "+i);
           flag = "p";
           
        }
           
         else
         
         {
         
          System.out.println("-" + i);
          
          flag = "d";
           
         }
               }
    }
}
    
    class printOdnum{
    
    public static void main(String[] args) {
        
        Oddnumber obj = new Oddnumber();
        
        obj.printodd(20);
        
    }
    }
    
