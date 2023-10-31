public class Animal extends Object {
    private long populationSize1;

    private long populationSize2;

    private int year1;

    private int year2;

    public Animal(long populationSize1, long populationSize2, int year1, int year2) {
        this.populationSize1 = populationSize1;
        this.populationSize2 = populationSize2;
        this.year1 = year1;
        this.year2 = year2;
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

    public int getYear1() {
        return year1;
    }

    public void setYear1(int year1) {
        this.year1 = year1;
    }

    public int getYear2() {
        return year2;
    }

    public void setYear2(int year2) {
        this.year2 = year2;
    }


}







