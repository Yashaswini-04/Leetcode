class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k!=0&&k<nums.length){
            List<Integer> l=new ArrayList<>();
        int i=nums.length-k,n=0;
        for(i=nums.length-k;n<nums.length;i=(i+1)%nums.length){
            l.add(nums[i]);
            n++;
        }
        for(i=0;i<l.size();i++){
            nums[i]=l.get(i);
        }
        }
    }
}