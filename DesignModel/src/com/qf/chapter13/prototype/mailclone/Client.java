package com.qf.chapter13.prototype.mailclone;

import java.util.Random;

/**
 * Created by ios on 16/10/27.
 */

/**
 * 这里sendMail即使是多线程的也米有关系,因为mail.clone()吧对象复制了一份,再修改原来的数据
 *
 * 这种不通过new关键字来产生一个对象,而是通过对象复制来完成的模式,就叫做  原型模式
 */
public class Client {
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        int i = 0;

        Mail mail = new Mail(new AdvTemplate());

        mail.setTail("xx银行版权所有");

        while (i < MAX_COUNT) {
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5) + "先生(女士)");
            cloneMail.setRecevier(getRandString(5) + "@" + getRandString(8) + ".com");
            sendMail(cloneMail);
            i++;
        }
    }

    public static void sendMail(Mail mail) {
        System.out.println("主题:" + mail.getSubject() + "\t收件人:" + mail.getRecevier() + "\t...发送成功");
    }

    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
