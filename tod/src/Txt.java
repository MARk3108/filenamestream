import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Txt {
    public static void main(String[] args) throws IOException {
        ArrayList<String> mass=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Укажите путь к файлу");
        String str=scanner.nextLine();
        File dir=new File("C:\\dir","check.txt");
        while (!dir.exists()){
            System.out.println("Попробуй еще");
            str=scanner.nextLine();
            dir=new File(str);
        }
        FileInputStream newtxt=new FileInputStream(dir);
        Scanner s=new Scanner(newtxt).useDelimiter("\\n");
        String str1=null;
        while (s.hasNext()){
            str1=s.next();
        }
        System.out.println(str1);
    }
}
