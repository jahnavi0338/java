import java.util.Scanner;
class table {
  public static void main(String args[]){
    Scanner ob=new Scanner (System.in);
    System.out.println("Enter any integer: ");
    int a=ob.nextInt();
    int i,j;
    for(i=1;i<=10;i++)
      {
        j=a*i;
        System.out.println(a+" * "+i+"= "+j);
      }
  }
}

