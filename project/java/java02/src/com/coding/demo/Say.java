package com.coding.demo;

public class Say {

    //私有类成员变量
    private int type;
    private boolean bTestBool = false;
    private  byte bOff = 1;
    private char cA = 'A';
    private  double dMoney = 2000.2001;
    private float fMoney = 200.2f;
    private  int length = Integer.MAX_VALUE;
    private long large = 1000000;
    private  short small = 32767;//Short.MAX_VALUE;



    public Say(){
        this.type = 100;
        System.out.println("实例化Say >" + type);
    }

    public Say(int type) {
        this.type = type;
        System.out.println("实例化2 Say >" + type);
    }

    /**
     * 公开
     */
    public void sayHello(){
        System.out.println("sayHello");
        this.sayHi();

    }

    /**
     * 静态公开
     */
    public static void sayBye(){
        System.out.println("sayBye");
    }

    /**
     * 私有函数
     */
    private void sayHi(){
        System.out.println("sayHi");
    }

    /**
     * 返回Type
     * @return
     */
    public int getType() {
        return this.type;
    }

    /**
     * 设置type
     * @param param
     */
    public void setType(int param) {
        this.type = param;
    }

    public boolean isbTestBool() {
        return bTestBool;
    }

    public void setbTestBool(boolean bTestBool) {
        this.bTestBool = bTestBool;
    }

    public byte getbOff() {
        return bOff;
    }

    public void setbOff(byte bOff) {
        this.bOff = bOff;
    }

    public char getcA() {
        return cA;
    }

    public void setcA(char cA) {
        this.cA = cA;
    }

    public double getdMoney() {
        return dMoney;
    }

    public void setdMoney(double dMoney) {
        this.dMoney = dMoney;
    }

    public float getfMoney() {
        return fMoney;
    }

    public void setfMoney(float fMoney) {
        this.fMoney = fMoney;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getLarge() {
        return large;
    }

    public void setLarge(long large) {
        this.large = large;
    }

    public short getSmall() {
        return small;
    }

    public void setSmall(short small) {
        this.small = small;
    }
}
