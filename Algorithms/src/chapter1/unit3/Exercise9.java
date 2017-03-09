package chapter1.unit3;

import java.util.Scanner;

/**
 * Created by ios on 17/3/9.
 *
 * 习题3.9
 * 给定输入:
 * 1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )
 *
 * 输出:
 * ( ( 1 + 2 ) * ( 3 - 4 ) * ( 5 - 6 ) ) )
 */
public class Exercise9 {

    public static boolean isOperation(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*");
    }

    public static boolean isOperation(char ch) {
        return ch == '+' || ch == '*' || ch == '-';
    }

    public static void main(String[] args) {
        Stack<String> s1 = new Stack<String>();
        Stack<String> s2 = new Stack<String>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String str = scanner.next();

            if (isOperation(str)) {
                s2.push(str);
            } else if (str.equals(")")) {
                String val = ") " + s1.pop() + " " + s2.pop() + " " + s1.pop() + " (";
                s1.push(val);
            } else {
                s1.push(str);
            }
        }
        String res = s1.pop();
//        for (int i = res.length() - 1; i > 0; i--) {
//            System.out.print(res.charAt(i));
//        }
        StringBuilder sb     = new StringBuilder(res);
        String        result = sb.reverse().toString();
        System.out.println(result);
        result = result.replaceAll(" ","");

        char[] strs = result.toCharArray();
        result = "";
        Stack<Character> s3 = new Stack<Character>();
        for (char ch : strs) {
            if (isOperation(ch)) {
                s3.push(ch);
            } else if (ch == ')') {
                result += s3.pop();
            } else if (ch == '(') {
                ;
            }else {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
