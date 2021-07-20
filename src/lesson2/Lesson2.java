package lesson2;

public class Lesson2 {
    public static int arraySum(String[][] twoDimensionalArray) throws MyArraySizeException, MyArrayDataException {
        if (twoDimensionalArray.length != 4){
            throw new MyArraySizeException("Длина массива != 4");
        }

        for (String[] array: twoDimensionalArray){
            if(array.length != 4){
                throw new MyArraySizeException("Высота массива != 4");

            }
        }
        
        int sum = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(twoDimensionalArray[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("Здесь не число:" + i + "," + j);
                }

                
            }
            
        }
        return sum;

    }
    public static void main(String[] args)  {

        String[][] successArray = {{"1", "5", "7", "9"},
                {"1", "5", "7", "9"},
                {"1", "5", "7", "9"},
                {"1", "5", "7", "9"}};
        try {
            System.out.println(arraySum(successArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        String[][] invalidDataArray = {{"1", "5", "7", "9"},
                {"1", "5", "7b", "9"},
                {"1", "5", "7", "9"},
                {"1", "5", "7", "9"}};
        try {
            System.out.println(arraySum(invalidDataArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }
}
