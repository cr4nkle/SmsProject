package program;

import smsc.Smsc;

public class Main {

    public static void main(String args[]) {
        DataRepository db = DataRepository.getInstance();
        System.out.println("Машин на заправке " + db.getCarCount());
        Smsc sms = new Smsc("Project_INK2", "");
        sms.send_sms("99999999999", "Количество авто:", 0, "", "", 5, "INK_SMS", "");
    }

}
