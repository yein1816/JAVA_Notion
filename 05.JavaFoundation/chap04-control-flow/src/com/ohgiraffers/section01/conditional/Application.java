package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {
        A_if a_if = new A_if();
//        a_if.simpleIfStatment();
//        a_if.netedIfStatment();

        B_ifElseIf b = new B_ifElseIf();
//        b.simpleIfElseIfStatment();
//        b.nestedIfElseIfStatement();

        C_switch c = new C_switch();
//        c.simpleSwitchStatement();
        c.switchVendingMachine();
    }
}
