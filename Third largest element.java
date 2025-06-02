//https://www.geeksforgeeks.org/problems/third-largest-element/1
class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        int first=-1;
        int second=-1;
        int third=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second )
            {
                third=second;
                second=arr[i];
                
            }
            else if(arr[i]>third )
            {
                third=arr[i];
            }
        }
        return third;
    }
}
