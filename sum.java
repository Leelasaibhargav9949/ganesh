import java.util.Scanner;
class sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first number: ");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        int result=a+b;
        System.out.println(result);
    }
}