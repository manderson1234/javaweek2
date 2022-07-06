public class Footprint extends Building{
    
    double footPrint;

    public Footprint(String name, String country, String place, double footPrint) {
        super(name, country, place);
        this.footPrint = footPrint;
    }

    public double getFootPrint() {
        return footPrint;
    }

    public void setFootPrint(double footPrint) {
        this.footPrint = footPrint;
    }

    @Override
    public String toString() {
        return "Building [country=" + country + ", name=" + name + ", place=" + place + " footPrint=" + footPrint;
    }

    

}
