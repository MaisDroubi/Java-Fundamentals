/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingdojo;

/**
 *
 * @author pccorner
 */
public class StringManipulatorTest {
   public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ", "     World    ");
        System.out.println(str); // HelloWorld 
        StringManipulator manipulator2 = new StringManipulator();
        char letter = 'o';
        Integer a = manipulator2.getIndexOrNull("Coding", letter);
        Integer b = manipulator2.getIndexOrNull("Hello World", letter);
        Integer c = manipulator2.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null

        StringManipulator manipulator3 = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer a2 = manipulator3.getIndexOrNull(word, subString);
        Integer b2 = manipulator3.getIndexOrNull(word, notSubString);
        System.out.println(a2); // 2
        System.out.println(b2); // null
        StringManipulator manipulator4 = new StringManipulator();
        String word2 = manipulator4.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2); // eworld

    }
}
