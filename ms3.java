
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ms3 {

    public static void main(String[] args) {

        String csvFile = "/Users/alex/eclipse-workspace/MS3-Interview/src/ms3Interview.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                //comma as separator
                String[] name = line.split(cvsSplitBy);

                System.out.println("Name [Last Name = " + name[1] + " , E-mail =" + name[2] + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
