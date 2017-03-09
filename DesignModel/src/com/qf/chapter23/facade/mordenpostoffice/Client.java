package com.qf.chapter23.facade.mordenpostoffice;

/**
 * Created by ios on 16/11/14.
 */
public class Client {
    public static void main(String[] args) {
        ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
        String address = "Hell Road No.1";
        String context = "Hello, world";
        hellRoadPostOffice.sendLetter(context, address);
    }
}
