import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        System.out.println("Enter your birth month [1-12]: ");
        if(console.hasNextInt())
        {
            birthMonth = console.nextInt();
            console.nextLine(); //CLEARS MR. BUFF
            if(birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("You said your birth month is " + birthMonth);
            }
            else {
                System.out.println("Not sure what month " + birthMonth + " 1is! Run the code again");
            }
        }
        else
        {
          trash = console.nextLine();
            System.out.println("You said your birth month was " + trash);
            System.out.println("RUN PROGRAM AGAIN");
        }

    }
}