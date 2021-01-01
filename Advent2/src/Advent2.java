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
                String[] params = line.split("[-: ]");
                int min = params[0];
                int max = params[1];
                char key = params[2];
                String pass = params[4];
            }
        }
        catch(Exception e)
        { e.printStackTrace(); }
    }
}
