package homeTask3;

import java.util.Arrays;

public class Main {
    public static void changeArrayElements(Object[] array, int i, int j) {
        Object tempElement = array[i];
        array[i] = array[j];
        array[j] = tempElement;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 5, 6, 7};
        System.out.println(Arrays.toString(array));
        changeArrayElements(array, 2, 3);
        System.out.println(Arrays.toString(array));

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());



        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());



        Box<Orange> orangeBox3 = new Box<>();
        orangeBox3.addFruit(new Orange());
        orangeBox3.addFruit(new Orange());
        orangeBox3.addFruit(new Orange());
        orangeBox3.addFruit(new Orange());

        System.out.println(appleBox.compare(appleBox2));// сравнение 2-х коробок на одинаковость содержимого

        System.out.println(orangeBox3.compare(appleBox));

        System.out.println("вес коробки 1 - " + appleBox.getBoxWeight());
        System.out.println("вес коробки 2 - " + appleBox2.getBoxWeight());
        appleBox.transferFruits(appleBox2);

        System.out.println("вес коробки 1 после пересыпания - " + appleBox.getBoxWeight());
        
        System.out.println(appleBox);
        System.out.println(appleBox2);
    }
}