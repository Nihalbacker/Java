import java.util.Scanner;
class demo
{
void multiply(int a,int b)
{
System.out.println("Result is:"+(a*b));
}
void multiply(int a,int b,int c)
{
System.out.println("Result is:"+(a*b*c));
}
public static void main(String[] args)
{
demo obj=new demo();
obj.multiply(8,5);
obj.multiply(4,6,2);
}
}
