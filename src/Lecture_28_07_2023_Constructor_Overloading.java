//Constructor Overloading


public class Lecture_28_07_2023_Constructor_Overloading {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();



    }
}
class A  {
    A(){
        System.out.println("Dafault constrctor of class A");
    }
}
class B extends A{
    static {
        System.out.println("This is static block of class A");
    }
    {
        System.out.println("This is instance block of class A");
    }
  public  B(){
        super();
        System.out.println("This is deafualt constructor of class B");
    }

}
