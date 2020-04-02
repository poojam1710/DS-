public class QuickSort {
    
 int Partition(int a[], int lower ,int higher)
 {
     int pivot =a[higher];
     int i=lower-1;
     int temp,j;

     for( j=lower;j<higher;j++)
     {
         if(a[j]<=pivot)
         {
             i=i+1;
             temp=a[i];
             a[i]=a[j];
             a[j]=temp;


         }
     }
     // swap the pivot to last i+1 to set pivot at right position
     temp=a[i+1];
     a[higher]=temp;
     a[i+1]=pivot;

     return i+1;
 }


 void Sort(int a[],int lower,int higher)
 {
     if(lower<higher) {

         int pi = Partition(a, lower, higher);
         Sort(a, lower, pi - 1);
         Sort(a, pi + 1, higher);
     }

 }

 void Print(int a[])
 {
     for(int i=0;i<a.length;i++)
     {
         System.out.print(a[i]+"  ");
     }
 }


public static void main(String args[])
{
    QuickSort obj1=new QuickSort();
    int a[]={5,3,2,1,4};
    obj1.Sort(a,0,4);
    System.out.println("sorted array");
    obj1.Print(a);
}

}
