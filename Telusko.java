//Program made by Ritesh Garg
public class Telusko {
    public static void main(String[] args) {
        // for loop for printing rows
        for (int i = 0; i < 5; i++) 
        {
            // for loop for printing columns
            for (int j = 0; j < 40; j++) 
            {
                // Condition for printing space between alphabets
                if (j == 5 || j == 11 || j == 17 || j == 23 || j == 29 || j == 34)
                    System.out.print("   ");

                // Condition for printing stars in each row
                else {

                    // Printing Row-1
                    if (i == 0) 
                    {
                        if (j != 13 && j != 14 && j != 15 && j != 16 && j != 19 && j != 20 && j != 21 && j != 31 && j != 32)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }

                    // Printing Row-2
                    else if (i == 1) 
                    {
                        if (j == 2 || j == 6 || j == 12 || j == 18 || j == 22 || j == 24 || j == 30 || j == 32|| j == 35 || j == 39)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }

                    // Printing Row-3
                    else if (i == 2) 
                    {
                        if (j == 2 || j == 6 || j == 7 || j == 8 || j == 12 || j == 18 || j == 22 || j == 24 || j == 25 || j == 26 || j == 27 || j == 28 || j == 30 || j == 31 || j == 35 || j == 39)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }

                   // Printing Row-4
                    else if (i == 3) 
                    {
                        if (j == 2 || j == 6 || j == 12 || j == 18 || j == 22 || j == 28 || j == 30 || j == 32 || j == 35 || j == 39)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }

                    // Printing Row-5
                    if (i == 4 ) 
                    {
                        if (j != 0 && j != 1 && j != 3 && j != 4 && j != 31 && j != 32)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
            }
            // Moving to next row
            System.out.println(); 
        }
    }
}
