import java.util.Scanner;
public class Duplicate_Array {
	public static void main(String[] args) {
		int[] arr = new int[100];
		int i,n = 5,j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for array");
		for(i = 0; i < n; i++ ){
			arr[i] = scan.nextInt();
		}
		
		for(i = 0;i < n;i++){
			for(j = i+1;j < n;j++){
			if(arr[i] == arr[j] )
			{
				arr[j] = 0;
			}
			}
		}
		
		System.out.println("Arrays without duplicate values ");
		for(i = 0; i < n; i++ ){
			System.out.print(" "+arr[i]);
			}
	}
}