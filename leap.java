import java.util.Scanner;
class leap
      {
        public static void main(String args[])
        {
          Scanner a=new Scanner(System.in);
          System.out.println("enter year");
          int year=a.nextInt();
          if(year%4==0 && (year%100!=0 || year%400==0))
          {
            System.out.println(year+"is leap year");
          }
          else
          {
            System.out.println(year+"is non leap year");
          }
        }
      }