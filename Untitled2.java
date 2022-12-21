import java.util.*;
class GFG
{
	public static void main(String[] args)
	{
        int arr[] = {2, 4, 6};
        int n = arr.length;
        System.out.println(minOperations(arr,n));
    }

    static int minOperations(int arr[], int n) 
    {        
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) 
        {
            if (mp.containsKey(arr[i])) 
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        } 
		int maxFreq = Integer.MIN_VALUE; 
        maxFreq = Collections.max(mp.entrySet(),Comparator.comparingInt(Map.Entry::getKey)).getValue();         
        return (n - maxFreq);
    } 
}