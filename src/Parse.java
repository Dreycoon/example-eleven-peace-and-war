import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parse {

    public ArrayList<String> parse(File file) {

        ArrayList<String> lines = new ArrayList<>();

        try (Scanner scanner = new Scanner(file).useDelimiter("[^а-яА-я]+")) {
            String line = scanner.nextLine();
            while (scanner.hasNext()) {
                lines.addAll(Arrays.asList(line.split("[^а-яА-я]+")));
                line = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
