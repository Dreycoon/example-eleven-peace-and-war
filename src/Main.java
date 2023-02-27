import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                int mult = i * j;
//                System.out.print(mult + " ");
//
//            }
//            System.out.println();
//        }


        File file = new File("src/war.txt");
        Parse parser = new Parse();


        ArrayList<String> foundWords = parser.parse(file);
        System.out.println(foundWords);

    }
}