package chapter1.unit3;

import java.util.Scanner;

/**
 * Created by ios on 17/3/9.
 * 匹配括号
 */
public class Parentheses {
    public static boolean isLeft(char str) {
        return str == '(' || str == '[' || str == '{';
    }

    public static boolean isMatched(char outer, char inner) {
         return (outer == ')' && inner == '(') ||
                (outer == '}' && inner == '{') ||
                (outer == ']' && inner == '[') ;

    }
    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String item = scanner.next();

            char[] items = item.toCharArray();
            for (char item1 : items) {
                if (isLeft(item1)) {
                    s.push(item1);
                } else if (isMatched(item1, s.peek())) {
                    s.pop();
                }
            }
        }
        if (s.isEmpty()) System.out.println("True");
        else System.out.println("False");
    }
}
