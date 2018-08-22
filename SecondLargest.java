import java.util.Scanner;
class SecondLargest{
public static void main(String[] args) {
int arr[] = new int[10];
int largest = arr[0];
int secondLargest = arr[0];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array :" );
for (int i=0;i<10;i++) 
{
arr[i]=sc.nextInt();
}
System.out.println("The given array is:" );
for (int i=0;i<10;i++) 
{
System.out.print(arr[i]+"\t");
}
for (int i=0;i<10;i++) 
{
if (arr[i] > largest) 
{
secondLargest = largest;
largest = arr[i];
} 
else if (arr[i] > secondLargest) 
{
secondLargest = arr[i];
}
}
System.out.println("\nSecond largest number is:" + secondLargest);
}
}