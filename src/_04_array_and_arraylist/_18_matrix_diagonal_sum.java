package _04_array_and_arraylist;

public class _18_matrix_diagonal_sum
{
    /*Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.*/
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        int sum=0;
        for (int i = 0; i < mat.length; i++) {
            sum+=mat[i][i];
            sum+=mat[i][mat.length-1-i];
        }
        if (mat.length%2!=0)
        {
            sum-=mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}
