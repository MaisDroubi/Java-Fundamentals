package codingdojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Nancy");
        arr.add("Jinichi");
        arr.add("Fujibayash");
        arr.add(" Ishikawa");
        System.out.println(names(arr));
        ArrayList<Character> array = new ArrayList<Character>();
        Collections.addAll(array, 'a', 'b', 'c', 'd', 'e', 'f', 'k', 'm', 'v', 'y');
        letters(array);
        int[] arrRandom = rand();
        for (int i = 0; i < arrRandom.length; i++) {

            System.out.println(arrRandom[i] + " ");

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(randString());
        }

    }

    public static ArrayList<String> names(ArrayList<String> array) {
        ArrayList<String> newarray = new ArrayList<String>();
        Collections.shuffle(array);
        System.out.println(array);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).length() > 5) {
                newarray.add(array.get(i));

            }
        }
        return newarray;
    }

    public static void letters(ArrayList<Character> array) {
        Collections.shuffle(array);
        System.out.println(array.get(array.size() - 1));
        System.out.println(array.get(0));
        String vowel = "aouei";
        for (int i = 0; i < vowel.length(); i++) {
            if (array.get(0) == vowel.charAt(i)) {
                System.out.println("The vowel is " + array.get(0));
            }
        }

    }

    public static int[] rand() {
        int min = 55;
        int max = 100;
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return array;
    }

    public static String randString() {
        String abc = "abcdefghijklmnopqrs";
        Random random = new Random();
        int index;
        String str = "";
        for (int i = 0; i < 5; i++) {
            index = random.nextInt(abc.length());
            str += abc.charAt(index);
        }

        return str;
    }

}
