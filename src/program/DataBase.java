package program;

public class DataBase extends MySQLHelper{
    private static DataBase INSTANCE;

    private DataBase(){
        initDB();
    }

    public static synchronized DataBase getInstance(){
        if (INSTANCE == null){
            INSTANCE = new DataBase();
        }
        return INSTANCE;
    }
}