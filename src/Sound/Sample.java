package Sound;

import org.jfugue.player.Player;



/**
 * A little example showing how to play a tune in Java.
 *
 * Inputs are not sanitized or checked, this is just to show how simple it is.
 *
 * @author Peter
 */
public class Sample {
    public static void main(String[] args) {
        System.out.println("About to play some music!");
        Player player = new Player();
        try {
//            player.play("A4 G4# F4 E4 D5 C5 B4 A4 A4 G4# F4, E4 F4 G4# A4 B4 D5 C5 B4 A4 G4# A4");
            Thread.sleep(500);
            player.play("E4 A4 B4 C5 A4 E4 A4 B4 C5 A4 E4 A4 B4 C5 , B4 A4 C5, B4 A4 E5 E5 E5 D5 E5 F5 F5 F5 E5 D5 F5 E5 E5 D5 C5 B4 E5 B4 C5 A4 E5 D5 E5 F5 F5 F5 E5 D5 F5 E5 E4 A4 B4 C5 , B4 A4 C5, B4 A4 E5 E5 E5 D5 E5 F5 F5 F5 E5 D5 F5 E5 E5 D5 C5 B4 E5 B4 C5 A4 E5 A5 B5 C6 A5 E5 A5 B5 C6 A5 E5 A5 B5 C6 , B5 A5 C6, B5 A5 E6 E6 E6 D6 E6 F6 F6 F6 E6 D6 F6 E6 E6 D6 C6 B5 E6 B5 C6 A5 A5 G5# F5 E5 D6 C6 B5 A5");

//                player.play(" E4 A4 B4 C5 A4, E4 A4 B4 C5 A4 E4 A4 B4 C5, B4 A4 C5, B4 A4, E5 E5 E5 D5 E5 F5 F5, F5 E5 D5 F5 E5 E5 D5 C5 B4 E5, C5 B4 C5 B4 A4");
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}