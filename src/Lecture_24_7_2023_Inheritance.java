import java.util.Scanner;

//Simple Inheritance or single Inheritance
/*class A{ }
//extend keyword represents ISA relation
class B extends A{}*/
//Lecture 24-7-2023
//Multiple inheritance can be achieved using interface
public class Lecture_24_7_2023_Inheritance {
    public static void main(String[] args) {
        SavingAccount s=new SavingAccount(1,"Vishal Shinde",10000);
        System.out.println(s.bal);
        s.deposit(3000);
        s.showBal();
        s.withDraw(2000);

        s.withDraw(10500);
        s.showBal();
        s.withDraw(501);
        s.showBal();
        System.out.println("Enter the number of years to find interest :");
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        System.out.println("Interest after "+n+" years ="+s.interest(n));
    }

}

class Account{
    int id;
    String Name;
    double bal;

    Account(int id,String Name,double bal){
        this.id=id;
        this.Name=Name;
        this.bal=bal;
    }

}
class SavingAccount extends Account{
    public SavingAccount(int id,String Name,double bal){
        super(id,Name,bal);
    }
    public void showBal(){
        System.out.println(bal);
    }
    public void withDraw(int amount){
        if(bal-amount>=500){
            bal=bal-amount;
        }else{

            if(bal-amount<500&&bal-amount>0){
                System.out.println("you cant withdraw money becuase account should have  500 rs balance");
            }else{
                System.out.println("Insufficient funds..");
            }
        }

    }
    public void deposit(int amount){
        bal=bal+amount;
    }
    public double interest(double n){
        return (bal*n*5)/100;
    }
}

