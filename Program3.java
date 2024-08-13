//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
class Program3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Length ");
        int length =  scan.nextInt();
        System.out.println("Width ");
        int width =  scan.nextInt();
        System.out.println("The area is " + width*length + ".");
        System.out.println("The perimeter is "+2*(width+length)+".");
    }
}



//Paste console output below:
/*
Length 
143
Width 
83
The area is 11869.
The perimeter is 452.

*/
