package br.dazzi;

import java.util.HashSet;
import java.util.Set;

/**
 * Cinstraints
 * 1 <= size of 10ˆ5
 *
 */
public class Solution {

    public Boolean asciiValidation(char[] sentence){
        for (char letter : sentence) {
            if (!(letter >= 97 && letter <= 122)) return false;
        }
        return true;
    }

    public Boolean heapSizeValidation(char[] sentence){
        return (sentence.length >= 1 && sentence.length <= Math.pow(10,5));
    }

    /**
     * shortest Substring has the following parameter:
     * s: a string
     */
    public int shortestSubstring(String a){
        char[] sentence = a.toCharArray();
        Set<Character> db = new HashSet<>();

        if(this.heapSizeValidation(sentence) && this.asciiValidation(sentence)){
            for (char c : sentence) {
                db.add(c);
            }
        }

        return db.size();
    }
}
