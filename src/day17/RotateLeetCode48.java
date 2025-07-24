package day17;

public class RotateLeetCode48 {
	public static void display(int[][] matrix, int rowSize, int colSize) {
		System.out.println("Elements are: ");
		
		for(int i = 0; i<rowSize;i++) {
			for(int j = 0; j<colSize;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
			
		}
	}
	public static void reverseArr(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	public static void rotate(int[][] matrix) {
		
		int rowSize = matrix.length;
		int colSize = matrix[0].length;
		// Transpose
		for(int i = 0 ; i < rowSize;i++) {
			for(int j = 0; j < colSize; j++) {
				if(i > j) {
					
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}
			}
		}
		
		// Display
		System.out.println("After Transpose");
		display(matrix, matrix.length,	 matrix[0].length);
		
		// Call reverse for each row
		for(int i =0; i<matrix.length;i++) {
			reverseArr(matrix[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		display(matrix, matrix.length,	 matrix[0].length);
		rotate(matrix);
		display(matrix, matrix.length,	 matrix[0].length);
		
	}

}
