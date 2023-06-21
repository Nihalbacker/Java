import java.util.Scanner;
public class Mat{
public static void main(String[] args)
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.print("Enter 1st matrix column limit:");
int m=sc.nextInt();
System.out.print("Enter 2nd matrix row limit:");
int n=sc.nextInt();
{
int[][]mat1=new int[m][n];
int[][]mat2=new int[m][n];
int[][]mat3=new int[m][n];
System.out.print("Enter 1st matrix elements:\n");
for(i=0;i<m;i++){
  for(j=0;j<n;j++){
   mat1[i][j]=sc.nextInt();
}
}
System.out.print("Enter 2nd matrix elements:\n");
for(i=0;i<m;i++){
  for(j=0;j<n;j++){
   mat2[i][j]=sc.nextInt();
}
}
for(i=0;i<m;i++){
  for(j=0;j<n;j++){
   mat3[i][j]=mat1[i][j]+mat2[i][j];
}
}
System.out.print("The result matrix:\n");
for(i=0;i<m;i++){
  for(j=0;j<n;j++){
   System.out.print(mat3[i][j]+"\t");
}
   System.out.println();
}
}
}
}
