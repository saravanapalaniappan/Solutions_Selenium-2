

/*

Q2(a):

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
    
