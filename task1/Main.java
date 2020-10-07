package ratialania.task1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 Integers:");
        int FirstNum = scanner.nextInt();
        int SecNum = scanner.nextInt();
        if(FirstNum > SecNum){
            int save = SecNum;
            SecNum = FirstNum;
            FirstNum = save;
        }
        int evens = 0, odds = 0, evenSum = 0, oddSum = 0, randomSum = 0;
        for (int i = 0; i < 40; i++){
            int random = (int)(Math.random() * (SecNum - FirstNum + 1) + FirstNum);
            if (random % 2 == 1) {
                odds+=1;
            }else{
                evens+=1;
            }
            if (random %2 ==1){
                oddSum+=random;
            }
            else{
                evenSum+=random;
            }

            randomSum += random;
        }
        System.out.println("We Have " + odds + "Odd Numbers");
        System.out.println("We Have " + evens + "Even Numbers");
        System.out.println("The sum of Even Numbers Is: " + evenSum);
        System.out.println("he sum of Even Numbers Is: " + oddSum);
        System.out.println("Total Sum is: " + randomSum);

        int minimum = Math.min(oddSum, evenSum);
        int maximum = Math.max(oddSum, evenSum);

        for (int i = 1; i <= 5; i++) {
            System.out.println( (int)(Math.random() * (maximum - minimum + 1) + minimum));
        }


        C c = new C();
        c.AssignABC();
        c.LastNumOfA();
        c.FirstNumOfB();
        c.SumOfNumsC();
        c.printMult();
        c.Mult();
        c.Sum();
        A a = new A();
        a.InsertX();
        a.PrintXPlus12();
        a.XEvenOrOdd();
        B b = new B();
        b.InsertY();
        b.XYSum();

    }

}

class C  {
    int a,b,c;
    public C (){

    }

    public void AssignABC(){
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    }
    public int LastNumOfA(){
        return a%10;
    }
    public int FirstNumOfB(){
        int num = this.b;
        while(num > 10)
            num /= 10;

        return num;
    }
    public int SumOfNumsC() {
        int n = this.c;
        int i = 0;
        while (n>0){
            int ln = n%10;
            n /= 10;
            i=i+ln;


        }
        return i;

    }
    public int Mult(){
        return this.LastNumOfA()*this.FirstNumOfB();
    }

    public void printMult(){
        System.out.println(this.Mult());
    }

    public void Sum(){
        System.out.println(this.FirstNumOfB()+this.Mult());
    }
}
class A{
    int x;
    public A(){
        System.out.println("Hello");

    }
    public void InsertX(){
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
    }
    public void PrintXPlus12(){
        System.out.println(x+12);
    }
    public String XEvenOrOdd(){
        if (x%2==0){
            return "X is Even";
        }
        else {
            return "X is Odd";
        }
    }


}
class B extends A {
    int y;
    public void InsertY(){
        Scanner scanner = new Scanner(System.in);
        y = scanner.nextInt();
    }
    public int XYSum(){
        return this.x + this.y;
    }
}




