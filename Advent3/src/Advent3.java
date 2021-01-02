import java.io.*;
import java.util.*;

public class Advent3
{
    public static void main(String[] args) throws Exception
    {
        long treeCount = 1;
        
        //Call a function to count the trees and multiply the results
        treeCount *= calcSlope(1, 1);
        treeCount *= calcSlope(3, 1);
        treeCount *= calcSlope(5, 1);
        treeCount *= calcSlope(7, 1);
        treeCount *= calcSlope(1, 2);

        //Print the result
        //System.out.println(calcSlope(1, 1));
        //System.out.println(calcSlope(3, 1));
        //System.out.println(calcSlope(5, 1));
        //System.out.println(calcSlope(7, 1));
        //System.out.println(calcSlope(1, 2));
        System.out.println(treeCount);
    }

    public static long calcSlope(int rightX, int downY)
    {
        //Create a variable to store the total trees crossed
        long treeCalc = 0;

        System.out.println("New Loop: X = " + rightX + ", Y = " + downY);

        //Read the file and calcuate the number of trees crashed into
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\dev\\advent-code-2020\\Advent3\\src\\input.txt")))
        {
            String line;
            int modDistX = 0;
            int modDistY = 0;

            while((line = br.readLine()) != null)
            {
                //Check if the next line is a valid y location
                if(modDistY % downY == 0)
                {   
                    //Find if a tree appears in the line x location
                    char pos = line.charAt(modDistX);
                    if(pos == '#'){ treeCalc++; }

                    System.out.println(modDistX + " " + modDistY + " " + pos);

                    //Go to the next location
                    modDistX = (modDistX + rightX) % line.length();
                }

                //Increment to the next line modulus
                modDistY++;
            }
        }
        catch(Exception e)
        { e.printStackTrace(); }

        //Return the number of trees crossed
        return treeCalc;
    }
}
