import java.io.File;
import java.util.Scanner;


public class tortoisePopulation extends Animal  {

    private long populationSize1;
    private long populationSize2;
    private long populationSize3;
    private long populationSize4;
    private long populationSize5;
    private long populationSize6;
    private long populationSize7;
    private long populationSize8;
    private long populationSize9;


    public tortoisePopulation(long populationSize1, long populationSize2, long populationSize3, long populationSize4, long populationSize5, long populationSize6, long populationSize7, long populationSize8, long populationSize9) {
        this.populationSize1 = populationSize1;
        this.populationSize2 = populationSize2;
        this.populationSize3 = populationSize3;
        this.populationSize4 = populationSize4;
        this.populationSize5 = populationSize5;
        this.populationSize6 = populationSize6;
        this.populationSize7 = populationSize7;
        this.populationSize8 = populationSize8;
        this.populationSize9 = populationSize9;
    }

    public long getPopulationSize1() {
        return populationSize1;
    }

    public void setPopulationSize1(long populationSize1) {
        this.populationSize1 = populationSize1;
    }

    public long getPopulationSize2() {
        return populationSize2;
    }

    public void setPopulationSize2(long populationSize2) {
        this.populationSize2 = populationSize2;
    }

    public long getPopulationSize3() {
        return populationSize3;
    }

    public void setPopulationSize3(long populationSize3) {
        this.populationSize3 = populationSize3;
    }

    public long getPopulationSize4() {
        return populationSize4;
    }

    public void setPopulationSize4(long populationSize4) {
        this.populationSize4 = populationSize4;
    }

    public long getPopulationSize5() {
        return populationSize5;
    }

    public void setPopulationSize5(long populationSize5) {
        this.populationSize5 = populationSize5;
    }

    public long getPopulationSize6() {
        return populationSize6;
    }

    public void setPopulationSize6(long populationSize6) {
        this.populationSize6 = populationSize6;
    }

    public long getPopulationSize7() {
        return populationSize7;
    }

    public void setPopulationSize7(long populationSize7) {
        this.populationSize7 = populationSize7;
    }

    public long getPopulationSize8() {
        return populationSize8;
    }

    public void setPopulationSize8(long populationSize8) {
        this.populationSize8 = populationSize8;
    }

    public long getPopulationSize9() {
        return populationSize9;
    }

    public void setPopulationSize9(long populationSize9) {
        this.populationSize9 = populationSize9;
    }

    public static void readData() throws Exception {
        File dataFile = new File("src/tortoisePopulationDATA");
        Scanner dataScanner = new Scanner(dataFile);
        dataScanner.useDelimiter(":");

        String titleLine = dataScanner.nextLine();
        Scanner titleScanner = new Scanner(titleLine);
        titleScanner.useDelimiter(":|\n");
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
            dataScanner.useDelimiter(":|\n");
            //Colorado Desert:13,530:3,319:3,984:2,007:1,348:1,375:2,383:1,316:1,403
            String area = dataScanner.next();
            String populationSize1 = dataScanner.next();
            long populationsize1Aslong = Long.parseLong(populationSize1);
            String populationSize2 = dataScanner.next();
            long populationsize2Aslong = Long.parseLong(populationSize2);
            String populationSize3 = dataScanner.next();
            long populationsize3Aslong = Long.parseLong(populationSize3);
            String populationSize4 = dataScanner.next();
            long populationsize4Aslong = Long.parseLong(populationSize4);
            String populationSize5 = dataScanner.next();
            long populationsize5Aslong = Long.parseLong(populationSize5);
            String populationSize6 = dataScanner.next();
            long populationsize6Aslong = Long.parseLong(populationSize6);
            String populationSize7 = dataScanner.next();
            long populationsize7Aslong = Long.parseLong(populationSize7);
            String populationSize8 = dataScanner.next();
            long populationsize8Aslong = Long.parseLong(populationSize8);
            String populationSize9 = dataScanner.next();
            long populationsize9Aslong = Long.parseLong(populationSize9);
            System.out.println(area+" "+populationsize1Aslong+" "+ populationsize2Aslong+" " +populationsize3Aslong+" " +populationsize4Aslong+" " +populationsize5Aslong+" " +populationsize6Aslong+" " +populationsize7Aslong+" " +populationsize8Aslong+" " +populationsize9Aslong);



        }
    }


}
