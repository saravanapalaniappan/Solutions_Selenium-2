

/*

Program : 2b
Employee id: 1243

This prints the fraction as (1/1,1/2,1/3, etc) based on the vlaued passed to CprintDivision
class

*/


public class CprintDivision{
    
    int limit;
    
    int i ;
    
    public void prindivision(int l) 
    
    {
    
        this.limit = l;
        String flag="d";
       
        for(i=1;i<= limit;i ++)
    
    {
        
        System.out.println("1/"+i);
    
        }
    }
}
    
    class PrintMdivision{
    
    public static void main(String[] args) {
        
        CprintDivision obj = new CprintDivision();
        
        obj.prindivision(20);
        
    }
    }
    
