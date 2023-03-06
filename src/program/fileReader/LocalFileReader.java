package program.fileReader;

import java.io.*;
import java.net.URL;

public abstract class LocalFileReader {
    private static final String path = "C:\\Users\\cr4nk\\OneDrive\\Рабочий стол\\test.txt";;
    private BufferedReader reader;
    private FileReader fileReader;

    public void init(){
        try{
            fileReader = new FileReader(path);
            reader = new BufferedReader(fileReader);
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

//    public String readFile(){
//
//        String fileString = "C:\\Users\\cr4nk\\OneDrive\\Рабочий стол\\test.txt";
//        String tempStr = null;
//        try {
//            BufferedReader fileStr = new BufferedReader(new FileReader(fileString));
//            Throwable var1 = null;
//            try {
//                tempStr = fileStr.readLine();
//                System.out.println("Строка взята успешно!");
//            } catch (Throwable var2) {
//                var1 = var2;
//                throw var2;
//            } finally {
//                if (var1 != null) {
//                    try {
//                        fileStr.close();
//                    } catch (Throwable var3) {
//                        var1.addSuppressed(var3);
//                    }
//                }
//                else {
//                    fileStr.close();
//                }
//            }
//        } catch (IOException var4) {
//            System.out.println("Имя файла не найдено!");
//        }
//        return tempStr;
//    }

    public String writeFile(){

        return null;
    }
}
