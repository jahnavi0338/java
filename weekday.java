import java.util.Scanner;
class week
  {
    public static void main(String arg[])
    {
      Scanner week=new Scanner(System.in);
      System.out.println("enter week day from(1-7)");
      int a=week.nextInt();
      if(a==1)
      {
        System.out.println("Sunday");
      }
      if(a==2)
      {
        System.out.println("monday");
      }
      if(a==3)
      {
        System.out.println("tueday");
      }
      if(a==4)
      {
        System.out.println("wednesday");
      }
      if(a==5)
      {
        System.out.println("thrusday");
      }if(a==6)
      {
        System.out.println("friday");
      }
      if(a==7)
      {
        System.out.println("Satday");
      }
      if(a>7)
      {
        System.out.println("invalid weekday");
      }
      
    }
  }