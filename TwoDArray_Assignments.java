public class TwoDArray_Assignments
{
    public TwoDArray_Assignments()
    {
        int arr[][] = {{12, 13 , 5 }, { 6, 2, 13 ,11}  , {1,2 } };
        printCol( arr , 2 );
    }
    
    public void printRow(int[][] arr, int row)
    {
        for(int i = 0; i < arr[row].length; i ++)
        System.out.print(arr[row][i] + "\t");
    }
    
    public void printCol(int[][] arr, int col)
    {
        for(int i = 0; i < arr.length; i++)
        {
            try {
            System.out.println(arr[i][col]);
            }
            catch (java.lang.ArrayIndexOutOfBoundsException err)
            {
                System.out.println("caught index error at col = " + i);
            }
        }
    }
}
