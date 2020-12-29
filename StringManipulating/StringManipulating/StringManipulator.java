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
public class StringManipulator {

    public static String trimAndConcat(String str1, String str2) {
        String str = str1.trim() + str2.trim();
        return str;
    }

    public static Integer getIndexOrNull(String str, char x) {
        if (str.indexOf(x) == -1) {
            return null;
        } else {
            return str.indexOf(x);
        }
    }

    public static Integer getIndexOrNull(String str1, String sub) {
        if (str1.indexOf(sub) == -1) {
            return null;
        }
        return str1.indexOf(sub);
    }

    public static String concatSubstring(String str1, int x, int y, String str2) {
        return str1.substring(x, y) + str2;
    }

}
