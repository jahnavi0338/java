
import java.util.Scanner;
class quadratic
  {
    public static void main(String args[])
    {
      Scanner coef=new Scanner(System.in);
      System.out.println("enter coeffeint of x^2");
      double a=coef.nextDouble();
      System.out.println("enter coeffeint of x");
      double b=coef.nextDouble();
      System.out.println("enter coeffeint of constant");
      double c=coef.nextDouble();
      double det=(b*b)-(4.0*a*c);
      if(det>0)
      {
        System.out.println("roots are real and distanct");
        double r1 = (-b + Math.pow(det, 0.5)) / (2.0 * a);
        double r2 = (-b - Math.pow(det, 0.5)) / (2.0 * a);
        System.out.println(r1);  
        System.out.println(r2);  
      }
      else if(det==0)
      {
        System.out.println("roots are equal");
        double r1=-b/(2.0*a);
        System.out.println("roots are equal"+r1);
      }
      else
      {
        System.out.println("roots are imaginary");
      }
      
    }
  }