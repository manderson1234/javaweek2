public class Volume extends Building {

    Integer year;
    double volume;

    
    public Volume(String name, String country, String place, Integer year, double volume) {
        super(name, country, place);
        this.year = year;
        this.volume = volume;
    }


    public Integer getYear() {
        return year;
    }


    public void setYear(Integer year) {
        this.year = year;
    }


    public double getVolume() {
        return volume;
    }


    public void setVolume(double volume) {
        this.volume = volume;
    }


    @Override
    public String toString() {
        return "Building [country=" + country + ", name=" + name + ", place=" + place + "Volume=" + volume + ", year=" + year ;
    }

    

    

    
}
