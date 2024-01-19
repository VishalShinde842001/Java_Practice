 class Lecture_25_7_2023 {
    public static void main(String[] args) {
        //We can create object with child reference
        A a1=new A();a1.m1();
        A a2=new B();a2.m1();
        A a3=new C();a3.m1();

       // B b1=new A(); //Not Possible
        B b2=new B();
        b2.m1();
        B b3=new C();
        b3.m1();

    //     C c1=new A();
    //    C c2=new B();
        C c3=new C();
        c3.m1();
    }
   static class A{
        void m1(){
            System.out.println("Hi");
        }
    }
     static class B extends A{
        @Override
        void m1(){
            super.m1();
            System.out.println("Hello");
        }
    }
    static class C extends B{
        void m1(){
            System.out.println("Good afternoon" );
        }
    }
}
