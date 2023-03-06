package program;

import program.fileReader.*;
import program.fileReader.TestFile;

public class DataRepository extends RemoteFileReader {
    private static DataRepository INSTANCE;

    private DataRepository(){
        init();
    }

    public static synchronized DataRepository getInstance(){
        if (INSTANCE == null){
            INSTANCE = new DataRepository();
        }
        return INSTANCE;
    }
}