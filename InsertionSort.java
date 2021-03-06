public class ArraySorting {
    // Insertion sort it is best to use when almost array is short of sorted .
    // space complexity is fixed O(1)
    //  5 2 4 6 1 3

    void InsertionSort(int  a[])
    {
        int i,j;

        for( j=1;j<a.length;j++)
        {
           int  key =a[j];
            i=j-1;


            while(i>=0 && a[i]>key)
            {
                a[i+1]=a[i];
                i=i-1;
            }
           a[i+1]=key;

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
        ArraySorting obj1= new ArraySorting();

        int a[]={5,2,4,6,1,3};
        obj1.InsertionSort(a);
        obj1.Print(a);
    }

}
