import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        ArrayList<Volume> volume = new ArrayList<>();
        ArrayList<Area> area = new ArrayList<>();
        ArrayList<Footprint> footprint = new ArrayList<>();

        volume.add(new Volume(" Boing everett factory", " USA", " Everett Washinton", 1967, 13.3));

        area.add(new Area("New century global center" , "China", "Chengdu", 1760000));

        footprint.add(new Footprint("Avto main assembly building", "Russia", "Tolyatti", 887800));


        System.out.println(volume.toString());
        System.out.println(area.toString());
        System.out.println(footprint.toString());



       

        
    }
}
