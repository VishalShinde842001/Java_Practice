//Overloading
//1)method name must be same
//2)No of input parameters or data type of parameter or order of paramter must be different
//3)Therre is no role of return type
//Oreloading==static polymorphism==static binding==early binding
//Overriding==dynamic polymorphism==dynamic binding==late binding
public class Lecture_28_07_2023_Method_Overloading {
    public static void main(String[] args) {
        Add a=new Add();
        System.out.println(a.add(1,2));
        System.out.println(a.add((Integer) 1,(Integer) 3));
        System.out.println(a.add(12f,12f));
        System.out.println(a.add(2345,44333.5));

    }
}
class Add{
    public Integer add(Integer a,Integer b){
        System.out.println("Integer Integer");
        return a+b;
    }
    public int  add(int a,int b){
        return a+b;
    }
    public float add(float a,int b){
        System.out.println("float int");
        return a+b;
    }
    public float add(float a,float b){
        System.out.println("float float");
        return a+b;
    }
    public double add(double a,double b){
        System.out.println("double double");
        return a+b;
    }
    public String add(String a,String b){
        System.out.println("String String");
        return a+b;
    }
}