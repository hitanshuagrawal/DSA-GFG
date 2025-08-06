import java.util.Collections;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
     ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        int leader = arr[n-1];
        leaders.add(leader);
        for(int i=n-2; i>=0; i--){
            if(arr[i]>=leader){
                leader = arr[i];
                leaders.add(leader);
            }
        }
        Collections.reverse(leaders);
        return leaders;
        }
    }
