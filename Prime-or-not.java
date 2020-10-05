import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        if(number==1||number==2||number==3){
            System.out.println("A prime number");
        }
else if(number%2==0||number%3==0){
    System.out.println("not a prime number");
	}
else{
    System.out.println("A prime number");
    }
}
}