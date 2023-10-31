import java.io.File;
import java.util.Scanner;

public class tortoisePopulation extends Animal {


    private String area;
    private int percentChange;


    tortoisePopulation(String area, long populationSize, int percentChange) {
        this.area = area;
        super.populationSize = populationSize;
        this.percentChange = percentChange;
    }



    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }










    public String toString() {
        return
                "Area:'" + area + '\'' +

                        ", PopulationSize: " + populationSize +
                        ", PercentChange: " + percentChange +
                        ' ';
    }
    public static void readData() throws Exception {
        File dataFile = new File("src/tortoisePopulationDATA");
        Scanner dataScanner = new Scanner(dataFile);
        dataScanner.useDelimiter("\t");
        while (dataScanner.hasNext()) {
            String area = dataScanner.next();



        }
    }


}
