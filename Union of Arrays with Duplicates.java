//https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1
class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        int m=a.length;
        int n=b.length;
        int k=0;
        int[] res= new int[m+n];
        for(int i=0;i<m;i++)
        {
            int flag=1;
            for(int j=0;j<k;j++)
            {
                if(a[i]==res[j])
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                res[k++]=a[i];
                
            }
            
        }
        for(int i=0;i<n;i++)
        {
            int flag=1;
            for(int j=0;j<k;j++)
            {
                if(b[i]==res[j])
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                res[k++]=b[i];
            }
            
        }
        return k;
    }
}
