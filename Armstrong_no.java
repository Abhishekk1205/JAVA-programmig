import java.util.Scanner;
class Armstrong_no
{
public static void main(String[] arg)
{Scanner sc= new Scanner(System.in);
int b=0,a,d=0,c=0,n=0;
System.out.println("Input no. to find Armstrong");
n=sc.nextInt();
b=n;
    while(b>0)
{c=b%10;
    a=c*c*c;
    d+=a;
    b/=10;
}
if(n==d)
System.out.println(n+" is Armstrong numbers");
else
System.out.println(n+" is not Armstrong numbers");
a=b=c=0;
}
}