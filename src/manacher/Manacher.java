package manacher;

import java.util.Vector;

/**
 * 马拉车算法，最长回文串
 */
public class Manacher {
    public String longestPalindrome(String s) {
        Vector<Character> vector = new Vector<Character>();
        vector.add('^');
        vector.add('#');
        for (int i=0; i<s.length(); i++) {
            vector.add(s.charAt(i));
            vector.add('#');
        }
        vector.add('$');
        int[] p = new int[vector.size()];
        int id = 0, mx = 0, maxCentor = 0, maxLen = 0;
        for (int i = 1; i < vector.size() - 1; i++) {
            p[i] = mx > i ? Math.min(p[2*id - i], mx - i) : 1;
            while (vector.get(i + p[i]) == vector.get(i - p[i])) {
                p[i] += 1;
            }
            if (i+p[i] > mx) {
                mx = i + p[i];
                id = i;
            }
            if (p[i] -1 > maxLen) {
                maxLen = p[i] - 1;
                maxCentor = i;
            }
        }
        int start = (maxCentor - maxLen)/2;
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        Manacher manacher = new Manacher();
        System.out.println(manacher.longestPalindrome("cbbd"));
    }
}
