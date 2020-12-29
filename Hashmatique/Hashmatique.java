/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingdojo;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author pccorner
 */
public class Hashmatique {

    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("title1", "lyrics1");
        trackList.put("title2", "lyrics2");
        trackList.put("title3", "lyrics3");
        trackList.put("title4", "lyrics4");

        String song = trackList.get("title3");
        System.out.println(song);

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key + " " + trackList.get(key));
        }
    }
}
