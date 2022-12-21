class subse {
    // To find sum of all subsequences
    static int findSum(int arr[], int n)
    {
        // Sum all array elements
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
 
        // Result is sum * 2^(n-1)
        return sum * (1 << (n - 1));
    }
 
    // Driver program to test findSum()
    public static void main(String[] args)
    {
        int arr[] = { 1, 2 };
        int n = arr.length;
        System.out.print(findSum(arr, n));
    }
}