//https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        int n=arr.length;
        int[] res=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if (arr[i]>=0)
            {
                res[j++]=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                res[j++]=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=res[i];
        }
    }
}
