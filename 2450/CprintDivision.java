

/*
Q2(b):

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
    
