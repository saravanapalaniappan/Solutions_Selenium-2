
/*

Q 3(b):

*/




public class CsearchArray{
    
   int[] intArray = new int[]{ 10,9,8,7,6,5,4,3,2,1 }; 
   
   int SearchV;
   
   public void SearchArray(int SearchVal){
       
       
       this.SearchV = SearchVal;
       
       int i;
      
       for (i=0;i< intArray.length;i++)
       {
           
           if(intArray[i]==SearchV)
           
           {
             System.out.println("The value "+SearchV+ "  found stored at the key  " +i);
               
           }
         
           
       }
    }
   
}
    
    class PrintMdivision{
    
    public static void main(String[] args) {
        
        CsearchArray objSearch = new CsearchArray();
        objSearch.SearchArray(10);
        
        //System.out.println(intArray.length);
        
    }
    }
    
