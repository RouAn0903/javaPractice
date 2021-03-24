package com.inter;

abstract class Animal {
   public String name;
   public int legs;

   public Animal(String name, int legs){
       this.name=name;
       this.legs=legs;
   }
    public void eat(){

    };
   public void printAnimal(){
       System.out.println("name: "+name+"\t"+"legs: "+legs);
   }
}
