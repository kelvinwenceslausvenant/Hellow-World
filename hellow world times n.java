import java.util.Scanner;
public class Helloworld
{
public static void main(String[] args)
{
int n;
Scanner s = new Scanner(System.in);
System.out.print("Enter the value of n: ");
n = s.nextInt();
for(int i=0; i<n; i++)
System.out.println("Hello, World");
}
}