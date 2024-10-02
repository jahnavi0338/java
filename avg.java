import java.util.Scanner;
class avg {
  public static void main(String args[]){
    Scanner ob=new Scanner (System.in);
    System.out.println("Enter first number: ");
    int a=ob.nextInt();
    System.out.println("Enter second number: ");
    int b=ob.nextInt();
    System.out.println("Enter third number: ");
    int c=ob.nextInt();
    System.out.println("Enter fourth number: ");
    int d=ob.nextInt();
    System.out.println("Enter fifth number: ");
    int e=ob.nextInt();
    int sum=a+b+c+d+e;
    System.out.println("the sum of given numbers = "+sum);
    int avg=sum/5;
    System.out.println("the average of given numbers = "+avg);
  }
}