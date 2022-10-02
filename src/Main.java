import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String line;
        try (BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\Александра\\Desktop\\егоров.csv"));
             BufferedWriter write = new BufferedWriter(new FileWriter("C:\\Users\\Александра\\Desktop\\егоров.txt")))
            {

            String pattern = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
            Pattern r = Pattern.compile(pattern);
            while ((line = read.readLine()) != null) {
                pattern = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
                r = Pattern.compile(pattern);
                Matcher m = r.matcher(line);
                if (m.find()) {
                    write.write(line + "\n");
                }
            }
            }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
