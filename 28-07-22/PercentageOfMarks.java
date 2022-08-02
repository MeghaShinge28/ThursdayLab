 public class Percentage
{
    public static void main(String[] args) 
    {
        A a = new A(77, 80, 68);
        System.out.println("\nPercentage of 1st Student:\n" + a.getPercentage());
        B b = new B(94, 65, 84, 96);
        System.out.println("Percentage of 2nd Student:\n" + b.getPercentage());
    }
}
abstract class  Marks 
{
    public abstract float getPercentage();
}
class A extends Marks
{
    int marks1, marks2, marks3;
    A(int sub1, int sub2, int sub3)
   {
        this.marks1 = sub1;
        this.marks2 = sub2;
        this.marks3 = sub3;
    }
    public float getPercentage()
    {
        float total = ((marks1 + marks2 + marks3)/(float)300)*100;
        return total;
    }
}
class B extends Marks
{
    int marks1, marks2, marks3, marks4;
    B(int sub1, int sub2, int sub3, int sub4)
    {
        this.marks1 = sub1;
        this.marks2 = sub2;
        this.marks3 = sub3;
        this.marks4 = sub4;
    }
    public float getPercentage()
    {
        float total = ((marks1 + marks2 + marks3 + marks4)/(float)400)*100;
        return total;
    }
}