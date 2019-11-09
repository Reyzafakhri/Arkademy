import java.util.Scanner;

public class lima
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int matrix[][] = new int[4][4];
        matrix[1][1] = 1;
        matrix[1][2] = 2;
		matrix[1][3] = 3;
        matrix[2][1] = 4;
        matrix[2][2] = 5;
		matrix[2][3] = 6;
		matrix[3][1] = 7;
		matrix[3][2] = 8;
		matrix[3][3] = 9;
		int i,j;
		int hasil = (1+5+9)+(3+5+7);
		 
    
        // baca matrix A
        for (i = 1; i < matrix.length; i++){
            for (j = 1; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }       
            System.out.println();
        }
		System.out.println("Hasil Penjumlahan Matrik Diagonal = " +hasil );
		
		
    }
}