import java.util.Scanner; 
class CelsiustoFahrenheit 
{ 
public static void main(String arg[]) 
{ 
double a,c; 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter Celsius temperature");
a=sc.nextDouble(); 
System.out.println(a+" C = "+celsius(a)+"F"); 
} 
static double celsius(double f) 
{ 
return ((f*9)/5)+32; 
} 
}