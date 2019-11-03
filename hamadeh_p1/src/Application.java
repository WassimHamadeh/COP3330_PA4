import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

public class Application
{
    public static void main (String[] args) throws IOException
    {
        DuplicateRemover dupRemove = new DuplicateRemover();
        File dataFile = new File("problem1.txt");
        File outputFile = new File("unique_words.txt");
        dupRemove.remove(dataFile);
        dupRemove.write(outputFile);
    }
}
