import java.util.Arrays;

public class DiagonalMatrix
{

    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    public static void main(String[] args)
    {

        int[][] matrix1 = new int [4][4];

        /* for (int [] rows : matrix)
        {   for (String column : matrix)
            {
                matrix
            }

        }
        */


        for (int i = 0; i < 4; i++)
        {
            matrix1[i][i] = 1;
        }

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print( matrix1[i][j]);
            }
            System.out.println();
        }


    }

}
