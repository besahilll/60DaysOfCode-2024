.//find the kth smallest element in the given array.
Time Complexity: O(nlogn)
Space Complexity: O(logn)
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        return arr[k-1];
    } 
}