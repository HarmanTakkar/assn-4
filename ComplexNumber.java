class Complex
{
int real=2,img=5;
public void Display()
{
this.real=real;
this.img=img;
System.out.println(this.real + "+"+ this.img +"i");
}
}
public class ComplexNumber
{
public static void main(String args[])
{
Complex obj=new Complex();
obj.Display();
}
}
