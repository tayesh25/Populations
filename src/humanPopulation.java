import java.io.File;
import java.util.Scanner;

public class humanPopulation extends Animal {
    private int percentChange;

     humanPopulation(String country, long populationSize, int percentChange) {
        this.country = country;
        super.populationSize = populationSize;
        this.percentChange = percentChange;
    }

    public void setGetCountry(String getCountry) {
        this.getCountry = getCountry;
    }

    public void setGetPopulationSize(long getPopulationSize) {
        this.getPopulationSize = getPopulationSize;
    }

    public void setGetPercentChange(int getPercentChange) {
        this.getPercentChange = getPercentChange;
    }

    public String getGetCountry() {

        return getCountry;
    }

    public String getCountry;

    public long getGetPopulationSize() {

        return getPopulationSize;
    }

    public long getPopulationSize;

    public int getGetPercentChange() {

        return getPercentChange;
    }

    public int getPercentChange;


    public String toString() {
        return
                "Country:'" + country + '\'' +

                        ", PopulationSize: " + populationSize +
                        ", PercentChange: " + percentChange +
                        ' ';
    }

    public static void readData() throws Exception {
        File dataFile = new File("src/tortoisePopulationDATA");
        Scanner dataScanner = new Scanner(dataFile);
        dataScanner.useDelimiter("\t");
        while (dataScanner.hasNext()) {
            //Afghanistan	// 2004 24,411,196	// 2012  32,716,214	+8,305,018	+34%
            String country = dataScanner.next();

            Long populationSize = dataScanner.nextLong();
            Integer populationChange = dataScanner.nextInt();



        }
    }
}
