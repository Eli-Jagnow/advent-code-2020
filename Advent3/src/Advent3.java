import java.io.*;
import java.util.*;

public class Advent3
{
    public static void main(String[] args) throws Exception
    {
        int treeCount = 0;
        
        //Call a function to count the number of trees
        treeCount = calcSlope(3, 1);

        //Print the result
        System.out.println(treeCount);
    }

    public static int calcSlope(int rightX, int downY)
    {
        int treeCalc = 0;

        //Read the file and calcuate the number of trees crashed into
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\dev\\advent-code-2020\\Advent3\\src\\input.txt")))
        {
            String line;
            int modDistX = 0;
            int modDistY = 0;

            while((line = br.readLine()) != null)
            {
                //Check if the next line is a valid y location
                if(modDistY == 0)
                {
                    //Find if a tree appears in the line x location
                    char pos = line.charAt(modDistX);
                    if(pos == '#'){ treeCalc++; }

                    //Go to the next location
                    modDistX = (modDistX + rightX) % line.length();
                }

                //Increment to the next line modulus
                modDistY = (modDistY + 1) % downY;
            }
        }
        catch(Exception e)
        { e.printStackTrace(); }

        return treeCalc;
    }
}
