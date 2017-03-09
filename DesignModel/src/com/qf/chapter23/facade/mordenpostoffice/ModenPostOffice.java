package com.qf.chapter23.facade.mordenpostoffice;

/**
 * Created by ios on 16/11/14.
 */

/**
 * 增加一个邮局类, 只要提供信的内容和地址就自动写好,然后发送出去
 *
 * Police类,检查信件,
 * 高层模块没有改动,但是信件却已经被检查过了,这亨氏我们设计所需要的模式,
 * 不改变子系统对外暴露的接口.方法,只改变内部的处理逻辑
 */

public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();

    private Police police = new Police();

    //写信,封装,投递一体化
    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);

        //警察检查信件
        police.checkLetter(letterProcess);

        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
