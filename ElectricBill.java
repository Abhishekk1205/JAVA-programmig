import java.util.*;
class ElectricBill
{public static void main(String args[])
{Scanner sc= new Scanner(System.in);
 System.out.println("Input units of electricity");
int units=sc.nextInt(); 
double bp=0;
if(units<100)
{bp=units*1.20;}
else if(units<300)
{bp=100*1.20+(units-100)*2;}
else if(units>300)
{bp=100*1.20+200*2+(units-300)*3;}
System.out.println("Bill to pay : " + bp);
}
}