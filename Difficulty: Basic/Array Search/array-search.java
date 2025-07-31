class Solution {
    public int search(int arr[], int x) {
        // code here
        int n = arr.length;
        int s=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==x){
            s=i;
            break;
            }
        }
        return s;
    }
}
