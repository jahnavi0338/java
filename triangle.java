import java.util.Scanner;
class trinum
  {
    public static void main(String args[])
    {
      int n;
      Scanner num=new Scanner(System.in);
      System.out.println("enter the number of rows in triangle");
      n=num.nextInt();
      int i,j;
      for(i=1;i<=n;i++)
        {
          for(j=1;j<=i;j++)
            {
              System.out.print(j);
            }
          System.out.print("\n");
        }
    }
  }