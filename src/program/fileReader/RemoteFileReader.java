package program.fileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class RemoteFileReader {
    private static final String path = "http://localhost/test.txt";
    private URL url;
    private BufferedReader reader;
    private InputStreamReader inputStreamReader;

    public void init(){
        try{
            url = new URL(path);
            inputStreamReader = new InputStreamReader(url.openStream());
            reader = new BufferedReader(inputStreamReader);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void close(){
        try{
            reader.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public String readFile(){
        String fileValue = null;
        String inputLine;

        try{
            while ((inputLine = reader.readLine()) != null)
                fileValue = inputLine;
            close();
        }catch(IOException e){
            close();
            System.out.println(e.getMessage());
        }
        return fileValue;
    }
}
