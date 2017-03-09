package com.qf.chapter23.facade.writeletter;

/**
 * Created by ios on 16/11/14.
 */

/**
 * 这4个步骤,还要知道他们的顺序,一旦出错,信就不可能有寄出去,它根本没有完成一个类所具有的单一职责
 */

public class Client {
    public static void main(String[] args) {
        ILetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("I'd like to ...");
        letterProcess.fillEnvelope("ShannXi province,Xi'an");
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
