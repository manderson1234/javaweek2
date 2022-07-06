import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Movie> movie = new ArrayList<Movie>();

        movie.add(new Movie(1, "Marcel the shell with shoes one", "Dean Flescher Camp", 100));
        movie.add(new Movie(2, "Fire of Love", "Miranda July", 100));
        movie.add(new Movie(3, "Playground", "Laura Wandel", 100));
        movie.add(new Movie(4, "Writing with fire", "Rintu Thomas", 100));
        movie.add(new Movie(5, "The Janes", "Tia Lessin", 100));

        Scanner in = new Scanner(System.in);

        System.out.print("Input a rank!");
        int rankNum = in.nextInt();

        Movie m = movie.get(rankNum - 1);

        System.out.println("Movie > > > " + m.toString());

        
    }
}
