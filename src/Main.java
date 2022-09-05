import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter =new FileWriter("abc.txt");
        fileWriter.write("1\tA a\t|эй\n" +
                            "2\tB b\t|би\n" +
                            "3\tC c\t|си\n" +
                            "4\tD d\t|ди\n" +
                            "5\tE e\t|и\n" +
                            "6\tF f\t|эф\n" +
                            "7\tG g\t|джи\n" +
                            "8\tH h\t|эйч\n" +
                            "9\tI i\t|ай\n" +
                            "10\tJ j\t|джей\n" +
                            "11\tK k\t|кей\n" +
                            "12\tL l\t|эл\n" +
                            "13\tM m\t|эм\n" +
                            "14\tN n\t|эн\n" +
                            "15\tO o\t|оу\n" +
                            "16\tP p\t|пи\n" +
                            "17\tQ q\t|кью\n" +
                            "18\tR r\t|а:, ар\n" +
                            "19\tS s\t|эс\n" +
                            "20\tT t\t|ти\n" +
                            "21\tU u\t|ю\n" +
                            "22\tV v\t|ви\n" +
                            "23\tW w\t|дабл-ю\n" +
                            "24\tX x\t|экс\n" +
                            "25\tY y\t|уай\n" +
                            "26\tZ z\t|зед, зи");
        //efesf
        fileWriter.close();
        FileReader fileReader =new FileReader("abc.txt");
        Scanner scanner =new Scanner(fileReader);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        fileReader.close();
    }
}