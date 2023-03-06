package program;

import program.fileReader.*;

public class DataRepository extends LocalFileReader {
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