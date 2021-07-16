package lesson1;

import java.awt.*;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Competitable[] competitors = {new Cat(1, 2), new Human(3, 4),
                new Robot(5, 6)};
/*я запутался с ветками*/
        Overcamble[] overcomables = {new Road(1), new Wall(2)};
        for (Competitable competitable : competitors) {
            for (Overcamble overcamble : overcomables) {
                overcamble.overcome(competitable);

            }


        }

    }
}