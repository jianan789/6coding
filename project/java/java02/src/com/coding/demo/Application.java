package com.coding.demo;

public class Application {

    //静态变量
    public static String SPRING_ONE = "spring_one";
    //静态final变量
    public final static String SPRING_TWO = "spring_two";

    public static void main(String [] args){
        System.out.println("demo 02");
        Say app = new Say(2000);
        app.sayHello();
//        System.out.println(app.type);
        //先调用setter函数
        app.setType(1000000001);
        //通过getter获取参数
        System.out.println(app.getType());
        //静态方法
        Say.sayBye();
//        sayBye();
        //private 不可以访问
//        app.sayHi();
        System.out.println(Application.SPRING_ONE);
        Application.SPRING_ONE = "spring_one_plus";
        System.out.println(Application.SPRING_ONE);
        System.out.println(Application.SPRING_TWO);
//        Application.SPRING_TWO = "spring_one_plus";
//        System.out.println(Application.SPRING_TWO);
        //局部变量
        int tmp = 12;
        System.out.println("局部变量tmp >" + tmp);
        app.setbTestBool(false);
        //判断
        if (tmp == 100){ // > < == >= <=
            System.out.println("100");
        }else{
            System.out.println("not 100");
        }
        //索引从0
//        for(int i=0; i< tmp; i++){
//            System.out.println("i : " + i);
//        }
//
        //while
//        while(tmp < 100){
//            System.out.println("i : " + tmp);
//            tmp = tmp + 1;
//        }
       //无论while真假都会执行do语句块
//        do{
//            System.out.println("do tmp : " + tmp);
//            tmp = tmp + 1;
//        }while(tmp < 100);

        // break continue
//        for(int i=0; i< tmp; i++){
//            System.out.println("i : " + i);
//            if (i == 5){
//                break;
//            }
//        }
//
        switch (tmp){
            case 12:
                System.out.println("switch tmp 12 : " + tmp);
                break;
            case 13:
                System.out.println("switch tmp 13 : " + tmp);
                break;
            default:
                System.out.println("switch tmp other : " + tmp);
                break;
        }

        int [] argArr  = new int[]{};

        String abc = "abc";
        String cba = "abc";

        System.out.println(" abc == cba : " + (abc == cba));
        String newStr = new String("abc");
        System.out.println(" abc == newStr : " + (abc == newStr));
        if(abc.equals(newStr)){
            System.out.println(" abc equals newStr : " + (abc == newStr));
        }

    }


}
