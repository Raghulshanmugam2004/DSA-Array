//https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1

class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        // code here
        
        int [] res= new int [2];
        if(arr.length<2)
        {
            return new int []{-1};
        }
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<first )
            {
                second=first;
                first=arr[i];
            }
            else if(arr[i]>first && arr[i]<second)
            {
                second=arr[i];
            }
        }
        if(second == Integer.MAX_VALUE )
        {
            return new int [] {-1};
        }
        res[0]=first;
        res[1]=second;
        return res;
    }
}
