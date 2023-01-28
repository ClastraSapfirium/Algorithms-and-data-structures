package HW;
public class HW {
    public static void sort(int clock[])
    {
        int q = clock.length;

        for (int i = q / 2 - 1; i >= 0; i--)
            Math(clock, q, i);
   
        for (int i=q-1; i>=0; i--)
        {
            int temp = clock[0];
            clock[0] = clock[i];
            clock[i] = temp;

            Math(clock, i, 0);
        }
    }
    public static void Math(int arr[], int j, int n)
    {
        int high = n;
        int turn = 2*n + 1;
        int corect = 2*n + 2;

        if (turn < j && arr[turn] > arr[high])
            high = turn;

        if (corect < j && arr[corect] > arr[high])
            high = corect;

        if (high != n)
        {
            int s = arr[n];
            arr[n] = arr[high];
            arr[high] = s;

            Math(arr, j, high);
        }
    }
    public static void printArray(int arr[])
    {
        int df = arr.length;
        for (int i=0; i<df; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        int [] Arr = new int[] {7,5,4,9,7,3,2};
        sort(Arr);
        printArray(Arr);
    }
}