    import java.util.Scanner;
    class Multiplication extends Thread{
    public void run()
    {
    try {
    for(int i=0;i<=10;i++)
    {
    System.out.println(i+"x5:"+(i*5));
    Thread.sleep(500);
    }
    }
    catch(InterruptedException e)
    {
    System.out.println("Multiplication thread interrupted ");
    }
    }
    }
    class Prime extends Thread
    {
    int limit,count,flag,i,j;
    Prime(int limit)//constructor
    {
    this.limit=limit;
    }
    public void run()
    {
    try
    {
    int j=2;
    while(count<limit)
    {
    flag=1;
    for(i=2;i<=(j-1);i++){
    if(j%i==0)
    {
    flag=0;
    break;
    }
    }
    if(flag==1)
    {
    System.out.println("prime numers are:"+j);
    count++;
    }
    j++;
    Thread.sleep(500);
    }
    }
    catch(InterruptedException e)
    {
    System.out.println("prime Thread Interrupted ");
    }
    }
    }
    class Threads
    {
    public static void main(String [] args)
    {
    Multiplication mul=new Multiplication();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the limit :");
    int l =sc.nextInt();
    Prime p = new Prime(l);
    mul.start();
    p.start();
    }
    }

