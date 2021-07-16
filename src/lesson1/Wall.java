package lesson1;

public class Wall implements Overcamble {
    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    public void overcome(Competitable competitable){
        competitable.jump(heigth);
    }
}
