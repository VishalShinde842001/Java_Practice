public class Lecuture_26_07_2023_toStringMethod {
    public static void main(String[] args) {
        Student s=new Student(1,"Vishal");
        System.out.println(s);

    }
}
class Student{
    int id;
    String Name;
    public Student(int id,String Name){
        this.id=id;
        this.Name=Name;
    }
    @Override
    public String toString(){
        return "Student [id="+id+",Name="+Name+"]";
    }
}
