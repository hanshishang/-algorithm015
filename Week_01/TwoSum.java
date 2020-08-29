class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for ( int i = 0; i <= nums.length -1; i++ ) {
            int temp = target - nums[i];
            if( map.containsKey( temp ) ) {
                return new int []{ map.get( temp ), i };
            }
            map.put( nums[i], i );
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}