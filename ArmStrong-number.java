import java.util.Scanner;

class Armstrong{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int val = 0,armnum,temp;
        System.out.println("Enter a number to check if it is armstrong or not");
        int num = input.nextInt();
        temp = num;
        while(num > 0){
            armnum = num % 10;
            num = num/10;
            val = val+(armnum*armnum*armnum);
        }
        if(temp == val){
            System.out.println(val+" is a Armstrong number");
        }
        else{
            System.out.println(val+" is not a Armstrong number");
        }
    }
}
