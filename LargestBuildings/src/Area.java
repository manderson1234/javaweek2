public class Area extends Building{

    double floorArea;

    public Area(String name, String country, String place, double floorArea) {
        super(name, country, place);
        this.floorArea = floorArea;
    }

    public double getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(double floorArea) {
        this.floorArea = floorArea;
    }

    @Override
    public String toString() {
        return "Building [country=" + country + ", name=" + name + ", place=" + place + " floorArea=" + floorArea ;
    }

    

    

    
}
