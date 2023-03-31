import java.util.Scanner;
class product{
int pcode,price;
String pname;
product(int pcode,String pname,int price){
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
}
public class products{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter product code:");
int pcode=sc.nextInt();
System.out.print("Enter product name:");
String pname=sc.next();
System.out.print("Enter price:");
int price=sc.nextInt();
product[]ps=new product[3];
ps[0]=new product(pcode,pname,price);
ps[1]=new product(101,"Colgate",40);
ps[2]=new product(102,"Note",50);
int minprice=ps[0].price;
System.out.println("\nPcode\tPname\tprice");
for(product p:ps){
System.out.println(p.pcode+"\t"+p.pname+"\t"+p.price);
if(minprice>p.price)
{
minprice=p.price;
}
}
System.out.println("\nLowest cost product");
for(product p:ps)
{
if(minprice==p.price)
{
System.out.println("-----------------------------");
System.out.println("Product code\t"+p.pcode);
System.out.println("Product name\t"+p.pname);
System.out.println("Product price\t"+p.price);
System.out.println("-----------------------------");
}
}
}
}
