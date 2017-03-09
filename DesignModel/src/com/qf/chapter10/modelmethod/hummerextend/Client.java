package com.qf.chapter10.modelmethod.hummerextend;

import java.util.Scanner;

/**
 * Created by ios on 16/10/21.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("------H1悍马车------");
        System.out.println("H1型号车是否需要喇叭响? 0-不需要,1-需要");
        Scanner scanner = new Scanner(System.in);
        int     type    = scanner.nextInt();

        HummerH1Model h1 = new HummerH1Model();
        if (type == 0) {
            h1.setAlarm(false);
        }
        h1.run();

        System.out.println("------H2悍马车------");
        HummerH2Model h2 = new HummerH2Model();
        h2.run();
    }
}
