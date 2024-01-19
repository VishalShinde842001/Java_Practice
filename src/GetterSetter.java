class vishal{
    private int age=20;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
public class GetterSetter {
    public static void main(String[] args) {
        vishal v=new vishal();
        v.setAge(34);
        System.out.println(v.getAge());
    }
}
