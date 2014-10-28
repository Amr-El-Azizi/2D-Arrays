public class TwoDArray_Assignments
{
    public TwoDArray_Assignments()
    {
        int arr[][] = {{1,2}, { 3,4}  , {5,6} };
        print(invertValues(arr));
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
    
    public void print(int[][] arr)
    {
        for(int row = 0; row < arr.length; row ++)
        {
            for(int col = 0; col < arr[row].length; col ++)
            System.out.print(arr[row][col] + "\t");
            System.out.print("\n");
        }
    }
    
    public int sum(int[][] arr)
    {
        int sum = 0;
        for(int row = 0; row < arr.length; row ++)
        {
            for(int col = 0; col < arr[row].length; col ++)
            sum += arr[row][col];
        }
        return sum;
    }
    
    public double mean( int[][] arr)
    {
        double sum = 0;
        double elements = 0;
        for(int row = 0; row < arr.length; row ++)
        {
            for(int col = 0; col < arr[row].length; col ++)
            {
                sum += arr[row][col];
                elements ++;
            }
        }
        return sum/elements;
    }
    
    public int maxVal_inRow(int[][] arr, int row)
    {
        int temp = arr[row][0];
        if(arr.length < row)
        {
            if(arr[row].length > 0)
            temp = arr[row][0];
            else
            return 0;
        }
        else
        return -1;
        for(int i = 0; i < arr[row].length; i ++)
        {
            if(arr[row][i] > temp)
            temp = arr[row][i];
        }
        return temp;
    }
    
    public int maxVal(int[][] arr, int col)
    {
        int temp = arr[0][col];
        for(int row = 0; row < arr.length; row ++)
        {
            if(arr[row].length < col && arr[row][col] > temp)
            temp = arr[row][col];
        }
        return temp;
    }
    
    public int[][] changeValues(int[][] table, int val)
    {
        for(int row = 0; row < table.length; row ++)
        {
            for(int col = 0; col < table[row].length; col ++)
            table[row][col] = val;
        }
        return table;
    }
    
    int[] twoD_to1D(int[][] arr)
    {
        int count = 0;
        for(int row = 0; row < arr.length; row ++)
        {
            for(int col = 0; col < arr[row].length; col ++)
            count ++;
        }
        int[] nums = new int[count];
        int i = 0;
        for(int row = 0; row < arr.length; row ++)
        {
            for(int col = 0; col < arr[row].length; col ++)
            {
                nums[i] = arr[row][col];
                i++;
            }
        }
        return nums;
    }
    
    public int[][] invertValues(int[][] matr)
    {
        int ml = matr.length;
        int[][] arr = new int[ml][matr[0].length];
        for(int row = 0; row < ml; row ++)
        {
            for(int col = 0; col < matr[row].length; col ++)
            arr[row][col] = matr[ml-row-1][matr[row].length-col-1];
        }
        return arr;
    }
}
