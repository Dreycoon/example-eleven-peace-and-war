import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parse {

    ArrayList<String> parse(File file) {
        ArrayList<String> foundWords = new ArrayList<>();
        String regex = "^[Сс]трада(.*)";
        Pattern pattern = Pattern.compile(regex);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    foundWords.add(matcher.group());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return foundWords;
    }
}
