class Solution 
{
    public static void transpose(int[][] matrix)
    {
        /*
        00 01 02 03
        10 11 12 13
        20 21 22 23
        30 31 32 33
        */
        for(int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<i; j++)
            {
                //swapping diagonally
                int temp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
    }
    public static void swapColumns(int[][] matrix)
    {
        int first=0, last=matrix[0].length-1;
        while(first<last)
        {
            for(int i=0; i<matrix.length; i++)
            {
                //swapping vertically first and last columns each time.
                int temp=matrix[i][last];
                matrix[i][last]=matrix[i][first];
                matrix[i][first]=temp;
            }
            first++;
            last--;
        }
    }
    public void rotate(int[][] matrix) 
    {
         transpose(matrix);
        swapColumns(matrix);
    }
}
