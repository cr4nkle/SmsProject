package program;

public class Main {

    public static void main(String args[]) {
        DataBase db = DataBase.getInstance();
        System.out.println("Машин на заправке " + db.getCarCount());
    }

}
