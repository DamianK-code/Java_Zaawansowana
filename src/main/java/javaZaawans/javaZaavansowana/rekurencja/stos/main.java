package javaZaawans.javaZaavansowana.rekurencja.stos;

import java.util.ArrayDeque;
import java.util.Deque;

public class main {

    public static void main(String[] args) {

        System.out.println(balancedParens("((()))"));
        System.out.println(balancedParens("(()))("));
    }

    public static boolean balancedParens(String input){
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : input.toCharArray()) {
            if (c == '('){
                stack.push(c);
            } else if (c==')' && (stack.isEmpty() || stack.pop() != '(')) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
