package lesson1;

public class Cat implements Competitable{
    private int runLength;
    private int jumpHeigth;

    public Cat(int runLength, int jumpHeigth) {
        this.runLength = runLength;
        this.jumpHeigth = jumpHeigth;
    }

    @Override
    public void jump(int heigth) {
        if (heigth > jumpHeigth){
            System.out.println("Кот не смог");
        }else {
            System.out.println("У кота получилось");
        }

    }

    @Override
    public void run(int length) {
        if (length > runLength){
            System.out.println("Кот не смог");
        }else {
            System.out.println("У кота получилось");
        }

    }
}
