class Cpu{
int price=34000;
class Processor{
int noOfCores=4;
String manufacturer="Intel Corp";
void display(){
System.out.println("No Of Cores:"+noOfCores);
System.out.println("Manufacturer:"+manufacturer);
}
}
void display(){
Processor p=new Processor();
p.display();
System.out.println("price:"+price);
}
static class Ram{
int memory=8;
String manufacturer="Corsair";
void display(){
System.out.println("Memory:"+memory);
System.out.println("Manufacturer:"+manufacturer);
}
}
}
public class Cpus{
public static void main(String [] args){
Cpu c1=new Cpu();
c1.display();
Cpu.Ram r1=new Cpu.Ram();
r1.display();
}
}
