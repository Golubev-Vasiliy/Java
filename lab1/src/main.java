import java.util.*;
import java.nio.file.Paths;
import java.io.*;

public class main {

    public static void main(String[] args) throws IOException {
        Scanner text = new Scanner(Paths.get("test.txt"), "UTF-8");
        String s = text.nextLine(); //считывание из файла
        System.out.println(s);  // вывод из файла
        System.out.print("Количество символов в строке:");
        System.out.println(s.length());
        s = s.replace("b", "a");
        System.out.println(s); 
        System.out.println(s.toUpperCase());
        System.out.print("Первые три символа строки: "); 
        System.out.println(s.substring(0, 3));
    }
    
}
