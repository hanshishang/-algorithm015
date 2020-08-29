class ClimbStairs {
    public int climbStairs(int n) {
        int first = 1;
        int second =2;
        int sum = 1;
        if( n < 4) {
            return n;
        }
        for( int i = 3; i<=n; i++ ){
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}