import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tortoisePopulation extends Animal {

    public tortoisePopulation(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    private String area;


    public static void readData() throws Exception {
        File dataFile = new File("src/tortoisePopulationDATA");
        Scanner dataScanner = new Scanner(dataFile);
        dataScanner.useDelimiter("\t");
        while (dataScanner.hasNext()) {
            String area = dataScanner.next();



        }
    }


}
