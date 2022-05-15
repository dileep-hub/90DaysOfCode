public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {

            int[] arr  = new int[A.length+1];
            int[] res = new int[2];

            for(int ele : A) {
                arr[ele]++;
            }

            for(int i=1; i<arr.length; i++) {
                if(arr[i] > 1) {
                    res[0] = i;
                } else if(arr[i] == 0) {
                    res[1] = i;
                }
            }

        return res;



    }
}
