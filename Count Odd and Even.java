//https://www.geeksforgeeks.org/problems/count-odd-even/1
class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int [] res=new int[2];
        int odd=0,even=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        res[0]=odd;
        res[1]=even;
        return res;
    }
}
