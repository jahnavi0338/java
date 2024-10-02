import java.util.Scanner;
class number
{
public static void main(String arg[])
{
Scanner num = new Scanner(System.in);
System.out.println("enter the number");
int a=num.nextInt();
if(a>0)
{
System.out.println(a+"is positive");
}
else if(a<0)
{
System.out.println(a+"is negitive");
}
else
{
System.out.println(a+"is neither positive nor negitive");
}
}
}