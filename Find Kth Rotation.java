//https://www.geeksforgeeks.org/problems/rotation4723/1

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int small=arr.get(0);
        int count=0;
        for(int i=1;i<arr.size();i++)
        {
            if(arr.get(i)<small)
            {
                small=arr.get(i);
                count=i;
            }
        }
        return count;
    }
}
