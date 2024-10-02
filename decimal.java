import java.util.Scanner;
class dec
  {
    public static void main(String args[])
    {
      Scanner num=new Scanner(System.in);
      float a,b;
      System.out.println("enter float value");
      a=num.nextFloat();
      System.out.println("enter another float value");
      b=num.nextFloat();
      int x=(int) (a*1000);
      int y=(int) (b*1000);
      if(x==y)
      {
        System.out.println("both are same");
      }
      else
      {
        System.out.println("both are different");
      }
      
    }
  }