package program;

import smsc.Smsc;

public class Main {

    public static void main(String args[]) {
        DataRepository dr = DataRepository.getInstance();
        System.out.println("Машин на заправке " + dr.readFile());
        Smsc sms = new Smsc("Project_INK2", "tynNeh-kudxy0-tesxog");
       // sms.send_sms("99999999999", "Количество авто:", 0, "", "", 5, "INK_SMS", "");
    }

}
