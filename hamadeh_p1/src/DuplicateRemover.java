import java.io.*;
import java.util.Scanner;
import java.util.HashSet;

public class DuplicateRemover
{
    private HashSet<String> uniqueWords = new HashSet<>();

    public void remove(File dataFile) throws IOException
    {
        FileInputStream getWord = new FileInputStream(dataFile);
        Scanner s = new Scanner(getWord);

        while (s.hasNext())
        {
            uniqueWords.add(s.next());
        }

        s.close();
    }

    public void write(File outputFile) throws IOException
    {
        FileOutputStream printWord = new FileOutputStream(outputFile);
        PrintWriter print = new PrintWriter(printWord);

        print.println(uniqueWords);
        print.flush();
        printWord.close();

        System.out.println("Check 'unique_words.txt'");
    }
}
