import java.io.File;
import java.util.Scanner;

public class humanPopulation extends Animal {
    private String country;

    private long populationSize;

    private int percentChange;

    public humanPopulation(String country, long populationSize, int percentChange) {
        this.country = country;
        this.populationSize = populationSize;
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
        File dataFile = new File("src/humanpopulationDATA");
        Scanner dataScanner = new Scanner(dataFile);
        dataScanner.useDelimiter("\t");
        while (dataScanner.hasNext()) {

            Long populationsize = dataScanner.nextLong();
            String country = dataScanner.next();
            Integer populationchange = dataScanner.nextInt();



        }
    }
}
