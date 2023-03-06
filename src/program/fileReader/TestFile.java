package program.fileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFile {
    public String readFile(){
        System.out.print("Введите имя файла, из которого будет взята строка: ");
        String fileString = "C:\\Users\\cr4nk\\OneDrive\\Рабочий стол\\test.txt";
        String tempStr = null;
        try {
            BufferedReader fileStr = new BufferedReader(new FileReader(fileString));
            Throwable var1 = null;
            try {
                tempStr = fileStr.readLine();
                System.out.println("Строка взята успешно!");
            } catch (Throwable var2) {
                var1 = var2;
                throw var2;
            } finally {
                if (var1 != null) {
                    try {
                        fileStr.close();
                    } catch (Throwable var3) {
                        var1.addSuppressed(var3);
                    }
                }
                else {
                    fileStr.close();
                }
            }
        } catch (IOException var4) {
            System.out.println("Имя файла не найдено!");
        }
        return tempStr;
    }

    public String writeFile(){

        return null;
    }
}
