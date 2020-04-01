public class SelectionSort {
     // in selection sort we have to compare from start to the arr length and set the sorted array after its each iteration
    // 5 2 4 6 1 3

    void Selection(int a[])
    {
        int i,j ,temp;
        for(i=0;i<a.length-1;i++)
        {
            for (j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
    }

    void Print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] +" ");
        }
    }


    public static  void main (String args[])
    {
        SelectionSort obj1=new SelectionSort();

        int a[]={5,2,4,6,1,3};

        obj1.Selection(a);
        obj1.Print(a);
    }

}
