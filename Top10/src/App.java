import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        ArrayList<Song> top10 = new ArrayList<Song>();

        
        top10.add(new Song(1, "Running up that hill","Bush","Fish People"));
        top10.add(new Song(2, "Afraid to Feel","LF System","Warner Recordss"));
        top10.add(new Song(3, "As it Was","Harry Styles","Columbia"));
        top10.add(new Song(4, "Break My Soul","Beyonce","Columbia"));
        top10.add(new Song(5, "Green Green Grass","George Ezra","Columbia"));
        top10.add(new Song(6, "Go","Cat Burns","RCA"));
        top10.add(new Song(7, "About Damn Time","Lizzo","Atlantic"));
        top10.add(new Song(8, "Massive","Drake","OVO"));
        top10.add(new Song(9, "IFTK","Tion Wyne & LA Roux","Atlantic"));
        top10.add(new Song(10, "Late Night Talking","Harry Stylees","Columbia"));

        System.out.println("Enter chart number: ");
        int num = in.nextInt();
        Song user = top10.get(num - 1);

        System.out.println(user.toString());

        in.close();
       


        
    }
}




