//https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int zero=0,one=0,two=0;
        
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }
            else if(arr[i]==1)
            {
                one++;
            }
            else if(arr[i]==2)
            {
                two++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(zero>0)
            {
                arr[i]=0;
                zero--;
            }
            else if(one>0 )
            {
                arr[i]=1;
                one--;
            }
            else if(two>0)
            {
                arr[i]=2;
                two--;
            }
        }
        
    }
}
