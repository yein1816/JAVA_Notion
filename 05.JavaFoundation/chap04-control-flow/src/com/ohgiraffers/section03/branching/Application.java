package com.ohgiraffers.section03.branching;

public class Application {
    public static void main(String[] args) {

        A_break a = new A_break();
//        a.simpleBreakStatement();
//        a.testJumpBreak();

        B_continue b = new B_continue();
//        b.simpleContinueStatement();
        b.textJumpContinue();
    }
}
