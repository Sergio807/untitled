package lesson1;

public class Road implements Overcamble {
    private int length;

    public Road(int length) {
        this.length = length;
    }
    public void overcome(Competitable competitable) {
        competitable.run(length);
    }
}
