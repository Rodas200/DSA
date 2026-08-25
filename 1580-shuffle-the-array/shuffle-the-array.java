class Solution {
    public int[] shuffle(int[] nums, int n) {

    int[]res = new int[nums.length];
      res[0] = nums[0];
      for(int i = 1; i < nums.length; i++){

        if( i % 2 == 0){
            res[i] = nums[i/2];
        }else{
            res[i]=nums[n];
            n++;
        }
      }
            return res;
        }
}

        



