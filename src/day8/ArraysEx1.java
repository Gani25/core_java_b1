package day8;

public class ArraysEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// In Java Arrays are objects
		
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 2;
		arr[2] = 7;
		arr[3] = 9;
		arr[4] = 3;
		
		System.out.println("Elements are: ");
		for(int i = 0; i< arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
