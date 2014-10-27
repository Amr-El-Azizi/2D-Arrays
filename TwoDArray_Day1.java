public class TwoDArray_Day1
{
    public TwoDArray_Day1()
    {
        
         String[][] table =  {
                             {"a","b","c"},
                             {"d","e","f","g"},                        
                             {"g","h"},
                             {}
                             };
 
         int table2[][] = {
                          { 1, 4, 5},
                          {5,11,12},                        
                          {22, 45},
                          };
         
         print(table);
         
                            
       
    }
    
    void print( String [][] strs2d)
    {
        for(int i = 0; i < strs2d.length; i ++)
        {
            for(int x = 0; x < strs2d[i].length; x ++)
            {
                System.out.println(strs2d[i][x] + "\t");
            }
            System.out.println();
        }
    }
}
