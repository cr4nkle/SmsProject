package program;

public class DataRepository extends MySQLHelper{
    private static DataRepository INSTANCE;

    private DataRepository(){
        initDB();
    }

    public static synchronized DataRepository getInstance(){
        if (INSTANCE == null){
            INSTANCE = new DataRepository();
        }
        return INSTANCE;
    }
}