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
}
