package lesson6;

import java.io.*;
import java.util.Random;

public class Main {
    private static final String kenobi = "GENERALKENOBIHELLOTHERE";
    private static final Random random = new Random();

    public static void main(String[] args) {
        createFile("23.txt",createString(75));
        createFile("46.txt",createString(75));
        glueFiles (new String[]{"23.txt","46.txt"},"69.txt");
    }

    public static void createFile(String fileName, String text){
        try{
            PrintWriter obi = new PrintWriter(fileName);
            obi.write(text);
            obi.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void glueFiles(String[] names, String distinationName){
        try{
            FileOutputStream fos = new FileOutputStream(distinationName);
            for (String name: names){
                FileInputStream fis = new FileInputStream(name);
                int i;
                do {
                    i = fis.read();
                    if(i != -1){
                        fos.write(i);
                    }
                }while (i != -1);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String createString(int len){
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++){
            sb.append(kenobi.charAt(random.nextInt(kenobi.length())));
        }
        return sb.toString();
    }

}
