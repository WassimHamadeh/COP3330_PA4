import java.io.IOException;
import java.io.File;

public class Application
{
    public static void main (String[] args) throws IOException
    {
        DuplicateCounter dupCount = new DuplicateCounter();
        File dataFile = new File("problem2.txt");
        File outputFile = new File("unique_words_counts.txt");
        dupCount.count(dataFile);
        dupCount.write(outputFile);
    }
}
