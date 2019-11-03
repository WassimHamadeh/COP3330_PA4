import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCounter
{
    private HashMap<String, Integer> wordCounter = new HashMap<>();

    public void count(File dataFile) throws IOException
    {
        try
        {
            FileInputStream getCount = new FileInputStream(dataFile);
            Scanner s = new Scanner(getCount);

            while (s.hasNext())
            {
                String counter = s.next();

                if (wordCounter.containsKey(counter))
                {
                    wordCounter.put(counter, wordCounter.get(counter) + 1);
                }

                else
                {
                    wordCounter.put(counter, 1);
                }
            }

            getCount.close();
        }

        catch (IOException ioe)
        {
            System.out.println("An exception has been found." + ioe.getMessage());
        }
    }

    public void write(File outputFile) throws IOException
    {
        FileOutputStream printCount = new FileOutputStream(outputFile);
        PrintWriter print = new PrintWriter(printCount);
        print.println(wordCounter);

        print.flush();
        print.close();
    }
}
