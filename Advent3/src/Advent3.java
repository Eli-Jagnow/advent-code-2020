import java.io.*;
import java.util.*;

public class Advent3
{
    public static void main(String[] args) throws Exception
    {
        int treeCount = 0;
        
        //Read the file and calcuate the number of trees crashed into
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\dev\\advent-code-2020\\Advent3\\src\\input.txt")))
        {
            String line;
            int modDist = 0;

            while((line = br.readLine()) != null)
            {
                //Find if a tree appears in the next line location
                char pos = line.charAt(modDist);
                if(pos == '#'){ treeCount++; }

                //Go to the next location
                modDist = (modDist + 3) % line.length();
            }
        }
        catch(Exception e)
        { e.printStackTrace(); }

        //Print the result
        System.out.println(treeCount);
    }
}
