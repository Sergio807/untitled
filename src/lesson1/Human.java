package lesson1;

public class Human implements Competitable{
    private int runLength;
    private int jumpHeigth;

    public Human(int runLength, int jumpHeigth) {
        this.runLength = runLength;
        this.jumpHeigth = jumpHeigth;
    }

    @Override
    public void jump(int heigth) {
        if (heigth > jumpHeigth){
            System.out.println("Человек не смог");
        }else {
            System.out.println("У человека получилось");
        }

    }

    @Override
    public void run(int length) {
        if (length > runLength){
            System.out.println("Человек не смог");
        }else {
            System.out.println("У человека получилось");
        }

    }
}
