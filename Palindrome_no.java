import java.util.Scanner;
class Palindrome_no
{
public static void main(String[] arg)
{Scanner sc= new Scanner(System.in);
int b=0,d=0,c=0,n=0;
System.out.println("Input no. to find Palindrome");
n=sc.nextInt();
b=n;
    while(b>0)
{c=b%10;
    d=d*10+c;
    b/=10;}
if(n==d)
System.out.println(n+" is Palindrome number");
else
System.out.println(n+" is not Palindrome number");
}}