package com;

public class AccessModifiers {
    public static void main(String[] args) {
        Check c=new Check();
        c.m1();
        c.m2();
        c.m3();
        c.m();
        AccessModifiers a=new AccessModifiers();
        a.m();
       // c.m4(); this method will not accessed from outside of class because it is private method

    }
    //This is private method so it can accessible only inside a class
    //Priavte method cant  be accessible outside the class
    private void m(){
        System.out.println("Priavte method of main xlass");
    }
}
class Check {
    public void m1(){
        System.out.println("Public method of Check class..");
    }
    protected  void m2(){
        System.out.println("Protected method of check class");
    }
     void m3(){
        System.out.println("Dafault method of check class");
    }
    private void m4(){
        System.out.println("Private method of check class");
    }
    public void m(){
        //In this way we can access priavate method to outside of class
        m4();
    }

        }
