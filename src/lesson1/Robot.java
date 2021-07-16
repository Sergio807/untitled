package lesson1;

public class Robot implements Competitable{
    private int runLength;
    private int jumpHeigth;

    public Robot(int runLength, int jumpHeigth) {
        this.runLength = runLength;
        this.jumpHeigth = jumpHeigth;
    }

    @Override
    public void jump(int heigth) {
        if (heigth > jumpHeigth){
            System.out.println("Робот не смог");
        }else {
            System.out.println("У робота получилось");
        }

    }

    @Override
    public void run(int length) {
        if (length > runLength){
            System.out.println("Робот не смог");
        }else {
            System.out.println("У робота получилось");
        }

    }
}
