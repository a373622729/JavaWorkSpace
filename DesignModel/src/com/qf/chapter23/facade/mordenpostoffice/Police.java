package com.qf.chapter23.facade.mordenpostoffice;

/**
 * Created by ios on 16/11/14.
 */
public class Police {
    //检查信件,检查完毕后,警察在信封上盖个戳:此信无病毒
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess + "信件已经检查过了...");
    }
}
