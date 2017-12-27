
/*
Q3(c):
*/



public class FindPrimeC{
    
    int i;
    int j;
    int m;
    
    public void isPrime(int UserGiven)
    
    {
        this.m = UserGiven;
        for(i=2;i<=m;i++)
        {
            for(j=2;i<=i;j++)
            {
                if(j==i)
                {
                    System.out.println(i);
                }
                
                if(i%j==0)
                {
                    break;
                }
                
            }
            
        }
        
    }
    
}


class FindPrimeMain{
    
    public static void main(String[] args) {
        
        FindPrimeC objPrim = new FindPrimeC();
        
        objPrim.isPrime(50);
        
        //System.out.println("Good");
        }
   }
    
    
    
