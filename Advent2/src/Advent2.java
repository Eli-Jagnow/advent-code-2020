import java.io.*;
import java.util.*;

public class Advent2
{
    public static void main(String[] args) throws Exception
    {
        int validPass = 0;
        
        //Read the file and calcuate the number of valid passwords
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\dev\\advent-code-2020\\Advent2\\src\\input.txt")))
        {
            String line;

            while((line = br.readLine()) != null)
            {
                //Seperate the line into its parameters
                String[] params = line.split("[-: ]");
                int min = Integer.parseInt(params[0]);
                int max = Integer.parseInt(params[1]);
                char key = params[2].charAt(0);
                String pass = params[4];

                /*
                ** LEFTOVERS FROM PART ONE **

                //Find the number of times the key appears
                int keyCount = 0;
                int index = pass.indexOf(key, 0);
                while(index != -1)
                {
                    keyCount++;
                    index = pass.indexOf(key, index + 1);
                }

                //Calculate if the pass is valid
                if(min <= keyCount && keyCount <= max)
                { validPass++; }
                */
            }
        }
        catch(Exception e)
        { e.printStackTrace(); }

        //Print the number of valid passes
        System.out.println(validPass);
    }
}
