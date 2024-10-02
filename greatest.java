import java.util.Scanner;
class greater
  {
    public static void main(String args[])
    {
      Scanner num=new Scanner(System.in);
      System.out.println("enter the first number");
      int a=num.nextInt();
      System.out.println("enter the second number");
      int b=num.nextInt();
      System.out.println("enter the third number");
      int c=num.nextInt();
      if(a>c && a>b)
      {
        System.out.println("a is big");
      }
      else if(b>c && b>a)
      {
        System.out.println("b is big");
      }
      else
      {
        System.out.println("c is big");
      }
    }
  }