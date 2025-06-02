//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        int n=arr.length;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    count++;
                }
            }
            if(count>1)
            {
                int flag=1;
                for(int k=0;k<res.size();k++)
                {
                    if(arr[i]==res.get(k))
                    {
                        flag=0;
                        break;
                    }
                }
                if(flag==1)
                {
                    res.add(arr[i]);
                }
            }
        }
        return res;
    }
}
