class Solution {
    public int getSecondLargest(int[] arr) {
        if (arr.length < 2) return -1;
        int largest2=Integer.MIN_VALUE;
        int largest=arr[0];
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i] ){
                largest=arr[i];
            }
      
        }
        
          for(int n=0; n<arr.length; n++){
            if(largest2<arr[n]&& arr[n]<largest)
            largest2=arr[n];
            
        }
        if(largest2==Integer.MIN_VALUE){
            return -1;
        }
        else{
            return largest2;
        }
    }
}