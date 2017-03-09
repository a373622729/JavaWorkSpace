package com.qf.chapter23.facade.mordenpostoffice;

/**
 * Created by ios on 16/11/14.
 */
public interface ILetterProcess {
    void writeContext(String context);
    void fillEnvelope(String address);
    void letterIntoEnvelope();
    void sendLetter();
}
