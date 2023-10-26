import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tortoisePopulation extends Animal {

    private String area;


    public static void readData() throws Exception {
        File dataFile = new File("src/tortoisePopulationDATA");
        Scanner dataScanner = new Scanner(dataFile);
        dataScanner.useDelimiter("\t");
        while (dataScanner.hasNext()) {
            String area = dataScanner.next();

            Long populationSize = dataScanner.nextLong();
            Integer populationChange = dataScanner.nextInt();


        }
    }


}
