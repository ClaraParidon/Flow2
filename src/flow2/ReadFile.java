package flow2;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 * @author Clara
 * @author Kirstine
 */
public class ReadFile
{
    public String path;
    
    public ReadFile(String file_path)
    {
        path = file_path;
    }
    
    public String[] OpenFile() throws IOException
    {
        FileReader file = new FileReader(path);
        BufferedReader textReader = new BufferedReader(file);
        
        int numberOfLines = 3;
        String[] textData = new String[numberOfLines];
        
        int i;
        
        for (i=0; i < numberOfLines; i++)
        {
            textData[i] = textReader.readLine();
        }
        
        textReader.close();
        return textData;
    }
    int readLines() throws IOException
    {
        FileReader file_to_read = new FileReader(path);
        BufferedReader bf = new BufferedReader(file_to_read);
        
        String aLine;
        int numberOfLines = 0;
        
        while((aLine = bf.readLine()) !=null)
        {
            numberOfLines++;
        }
        
        bf.close();
        return numberOfLines;
    }
}
