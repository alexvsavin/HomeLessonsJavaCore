package homeTask2;

public class Main {

    public static int arraySum(String[][] fourDimensionalArray) throws MyArraySizeException, MyArrayDataException {
        if (fourDimensionalArray.length != 4) {
            throw new MyArraySizeException("Высота массива != 4");
        }

        for (String[] array : fourDimensionalArray) {
            if (array.length != 4) {
                throw new MyArraySizeException("Ширина массива != 4");
            }
        }

        int sum = 0;
        for (int i = 0; i < fourDimensionalArray.length; i++) {
            for (int j = 0; j < fourDimensionalArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(fourDimensionalArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не число в элементе: [" + i  + "," + j +"]");
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String[][] luckyFirstArray =
                {       {"1", "2", "9", "4"},
                        {"1", "3", "5", "6"},
                        {"1", "5", "5", "8"},
                        {"1", "9", "8", "6"},
                        };

        Integer[][] array = new Integer[4][];
        array[0] = new Integer[4];
        array[0] = new Integer[5];
        array[0] = new Integer[4];

        try {
            System.out.println(arraySum(luckyFirstArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        String[][] wrongHeightArray =
                {       {"1", "2", "9", "4"},
                        {"1", "3", "5", "6"},
                        {"1", "5", "5", "8"},
                        {"1", "9", "8", "6"},
                        {"1", "3", "5", "6"}};


        try {
            System.out.println(arraySum(wrongHeightArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        String[][] invalidDataArray =
                {       {"5", "4", "3", "2"},
                        {"4", "3", "abc", "6"},
                        {"1", "2", "3", "4"},
                        {"1", "3", "5", "6"}};

        try {
            System.out.println(arraySum(invalidDataArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }
}