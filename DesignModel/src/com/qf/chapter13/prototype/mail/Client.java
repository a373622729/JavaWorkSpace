package com.qf.chapter13.prototype.mail;

import java.util.Random;

/**
 * Created by ios on 16/10/27.
 */

/**
 * 这样串行的发送邮件,如果邮件数量庞大,就会很慢.那么吧sendMail改为多线程就能解决问题吗?
 * 不行,比如产生一封邮件放到线程1,那还没有发出去,就线程2启动了,直接把mail对象里面的主题内容都改了,线程不安全了
 * 这里采用一种新型模式来解决问题:
 * 通过对象的复制功能来解决这个问题
 */
public class Client {
    //发送账单的数量,从数据库中获得
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        //模拟发送邮件
        int i = 0;
        //把模板定义出来,这个是从数据库中获得
        Mail mail = new Mail(new AdvTemplate());

        mail.setTail("xxx银行版权所有");
        while (i < MAX_COUNT) {
            mail.setAppellation(getRandString(5) + "先生(女士)");
            mail.setRecevier(getRandString(5) + "@" + getRandString(8) + ".com");
            sendMail(mail);
            i++;
        }
    }

    public static void sendMail(Mail mail) {
        System.out.println("标题:" + mail.getSubject() + "\t收件人:" + mail.getRecevier() + "\t...发送成功");
    }

    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
