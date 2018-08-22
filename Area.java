import java.util.Scanner;
class Rectangle
{
int length,breadth,area;
Scanner sc=new Scanner(System.in);
public void CalculateArea()
{
System.out.print("Length=");
length=sc.nextInt();
System.out.print("Breadth=");
breadth=sc.nextInt();
area=length*breadth;
System.out.println("Area of Reactangle is " + area);
}
}
public class Area{
public static void main(String[] args) {
Rectangle obj=new Rectangle();
obj.CalculateArea();
}
}
