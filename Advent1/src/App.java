import java.io.*;
import java.util.*;

public class App
{
    public static void main(String[] args) throws Exception
    {
        String input = "";
        
        //Read the file and add all numbers within it to the input string
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\dev\\advent-code-2020\\Advent1\\src\\input.txt")))
        {
            String line;
            while((line = br.readLine()) != null)
            { input = input + " " + line; }
            input = input.substring(1);
        }
        catch(Exception e)
        { e.printStackTrace(); }
        
        //Create an array of integers from the input string
        String[] numbers = input.split(" ");
        int[] integers = new int[numbers.length];
        
        for(int i = 0; i < integers.length; i++)
        { integers[i] = Integer.parseInt(numbers[i]); }

        int first = -1;
        int second = -1;
        int third = -1;

        //Find the first 2 integers that sum to 2020
        find2020:
            for(int x = 0; x < integers.length; x++)
            {
                first = integers[x];

                for(int y = x+1; y < integers.length; y++)
                {
                    second = integers[y];
                    
                    for(int z = y+1; z < integers.length; z++)
                    {
                        third = integers[z];
                        if(first + second + third == 2020)
                        { break find2020; }
                    }
                }
            }

        //Multiply them and print out the result
        System.out.println(first * second * third);
    }
}
