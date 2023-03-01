import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        File file = new File("src/war.txt");
        Parse parser = new Parse();
        Pattern pattern = Pattern.compile("^[Сс]трада(.*)");



        ArrayList<String> foundWords = parser.parse(file);
        int count = 0;
        for (String line : foundWords) {
            if (pattern.matcher(line).matches()) {
                System.out.println(line);
                count++;
            }
        }
        System.out.println("Всего:" + count);

    }
}