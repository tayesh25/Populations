import java.io.File;
import java.util.Scanner;
// pee pee

public class tortoisePopulation extends Animal {
    private long populationSize1;
    private long populationSize2;
    private long populationSize3;
    private long populationSize4;
    private long populationSize5;
    private long populationSize6;
    private long populationSize7;
    private long populationSize8;
    private long populationSize9;



    tortoisePopulation(long populationSize) {
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
        dataScanner.useDelimiter(":");

        String titleLine = dataScanner.nextLine();
        Scanner titleScanner = new Scanner(titleLine);
        titleScanner.useDelimiter(":");
        //Tortoise Conservation Area Acr Area (km2):2004:2005:2007:2008:2009:2010:2011:2012:2013:2014
        // read years
        String titleData1 = titleScanner.next();
        long year1 = titleScanner.nextLong();
        long year2 = titleScanner.nextLong();
        long year3 = titleScanner.nextLong();
        long year4 = titleScanner.nextLong();
        long year5 = titleScanner.nextLong();
        long year6 = titleScanner.nextLong();
        long year7 = titleScanner.nextLong();
        long year8 = titleScanner.nextLong();
        long year9 = titleScanner.nextLong();

        while (dataScanner.hasNext()) {
            //Colorado Desert:13,530:3,319:3,984:2,007:1,348:1,375:2,383:1,316:1,403
            String area = dataScanner.next();
            long pop1 = dataScanner.nextLong();
            tortoisePopulation tortoisePopulation1 = new tortoisePopulation();
           // System.out.println(tortoisePopulation1);
        }
    }


}
