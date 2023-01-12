import java.util.Scanner;
class Reverse_of_String
{public static void main(String[] arg)
{Scanner sc=new Scanner(System.in);
    int l=0;
    String s="",p="";
System.out.print("Enter a string : ");
s=sc.nextLine();
l=s.length();
for(int i=0;i<l;i++)
{char c=s.charAt(i);
p=c+p;}
System.out.print("Reverse string = "+p);
}}