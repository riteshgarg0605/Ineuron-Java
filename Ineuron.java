//Program made by Ritesh Garg
public class ineuron {
    public static void main(String[] args) {        
        // for loop for printing rows
        for (int i = 0; i < 5; i++) 
        {
            // for loop for printing columns
            for (int j = 0; j < 44; j++) 
            {
               // Condition for printing space between alphabets
                if (j == 5 || j == 13 || j == 19 || j == 25 || j == 30 || j == 36)
                    System.out.print("   ");

                // Condition for printing stars in each row
                else {

                   // Printing Row-1
                    if (i == 0) 
                    {
                        if (j != 8 && j != 9 && j != 10 && j != 11 && j != 19 && j != 21 && j != 22 && j != 23 && j != 39 && j != 40 && j != 41 && j != 42)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }

                    // Printing Row-2
                    else if (i == 1) 
                    {
                        if (j == 2 || j == 6 || j == 8 || j == 12 || j == 14 || j == 20 || j == 24 || j == 26 || j == 29 || j == 31 || j == 35
                            || j == 37 || j == 39 || j == 43)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }

                    // Printing Row-3
                    else if (i == 2) 
                    {
                        if (j == 2 || j == 6 || j == 9 || j == 12 || j == 14 || j == 15 || j == 16 || j == 20 || j == 24 || j == 26 || j == 27 
                            || j == 28 || j == 29 || j == 31 || j == 35 || j == 37 || j == 40 || j == 43)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }

                    // Printing Row-4
                    else if (i == 3) 
                    {
                        if (j == 2 || j == 6 || j == 10 || j == 12 || j == 14 || j == 20 || j == 24 || j == 26 || j == 28 || j == 31 || j == 35 
                            || j == 37 || j == 41 || j == 43)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }

                    // Printing Row-5
                    if (i == 4) 
                    {
                        if (j != 7 && j !=8 && j !=9 && j !=10 && j !=27 && j !=28 && j !=38 && j !=39 && j !=40 && j !=41)
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
