import java.util.Scanner;
class switch_case {
  public static void main(String args[]){
    String monthname;
    Scanner ob=new Scanner (System.in);
    System.out.println("Enter a number between 1 to 12 ");
    int month=ob.nextInt();
    switch (month){

      case 1: monthname = "january";
          break;

        case 2: monthname = "february";
          break;
          
        case 3: monthname = "march";
          break; 

        case 4: monthname = "april";
          break;  

        case 5: monthname = "may";
          break;

        case 6: monthname = "june";
          break;
          
        case 7: monthname = "july";
          break; 

        case 8: monthname = "august";
          break;  
                
        case 9: monthname = "september";
          break;

        case 10: monthname = "october";
          break;
          
        case 11: monthname = "november";
          break; 

        case 12: monthname = "december";
          break;  

        default: monthname ="invalid_month";
          break;
      }
      System.out.println(monthname);
    }
  }  