public class Lecture_26_07_2023_Practice {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        Maruti m=new Maruti();
        m.start();
    }
}
class Car{
   void start(){
       System.out.println("Starting Car..");
   }

}
class Maruti extends  Car{
    void start(){
        System.out.println("Starting Maruti Car...");
    }
}

