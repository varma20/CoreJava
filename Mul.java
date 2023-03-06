import java.util.*;
public class Mul{
	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		int r1 = sin.nextInt();
		int c1 = sin.nextInt();
		int r2 = sin.nextInt();
		int c2 = sin.nextInt();
		if(r1 != c2){
			System.out.println("Matrix multiplication is not possible");
		}
		else{
			int a[][] = new int[r1][c1];
			System.out.println("Enter First Matrix values");
			for(int i = 0;i < r1 ;i++){
				for(int j = 0; j < c1 ; j++){
					a[i][j] = sin.nextInt();
				}
			}
			int b[][] = new int[r2][c2];
			System.out.println("Enter First Matrix values");
			for(int i = 0;i < r2 ;i++){
				for(int j = 0; j < c2 ; j++){
					b[i][j] = sin.nextInt();
				}
			}
			int c[][] = new int[r1][c2];
			for(int i=0;i<r1;i++){
				for(int j = 0;j<c2;j++){
					c[i][j] = 0;
					for(int k = 0; k<c1;k++){
						c[i][j] += a[i][k] * b[k][j]; 
					}
				}
			}
			System.out.println("Resultant matrix");
			for(int i = 0;i < r1 ;i++){
				for(int j = 0; j < c2 ; j++){
					System.out.print(c[i][j] + "\t");
				}
				System.out.println("");
			}
		}
	}
}