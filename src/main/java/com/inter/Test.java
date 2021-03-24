package com.inter;

public class Test {
    public static void main(String[] args){
        System.out.println("==== Animal => Cat ====");
        Animal an = new Cat();
        an.printAnimal();
        an.eat();
        System.out.println("==== Bird => Bird ====");
        Bird b1 = new Bird();
        b1.printAnimal();
        b1.eat();
        b1.fly();
        System.out.println("==== Bird b2 flyable b3=> b2 強制轉型====");
        Bird b2=new Bird();
        flyable b3;
        b3=b2;
        ((Bird)b3).printAnimal();
        b3.fly();
        ((Bird) b3).eat();
        System.out.println("==== flyable => Airplane ====");
        flyable air = new Airplane();
        air.fly();
    }
}
