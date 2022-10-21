
/**
 * Write a description of class date here.
 *
 * @David Garcia
 * @ 9/28/22
 */
import java.util.Scanner;
public class date
{
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.print("enter the day of the week");
        String day = s.nextLine();
        
        
        System.out.print("enter the month of the week");
        String month = s.nextLine();
        
        System.out.print("enter the year of the week");
        String year = s.nextLine();
        
        System.out.print("enter the day of month");
        String dayOfMonth = s.nextLine();
        
        System.out.println("American format: " + day + ", " + month + " " + dayOfMonth + ", " + year);
        System.out.println("European format: " + day + " " + dayOfMonth + " " + month + ", " + year);

        //System.out.println(day);
    } // end of main
} //end of class