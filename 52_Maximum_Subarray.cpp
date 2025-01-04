class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int max=INT_MIN;
        int prt1=0;
        int prt2=0;
        int sum=0;

        while(prt1<nums.size() && prt2<nums.size()){
            sum+=nums[prt2];
            if(sum>max)max=sum;
            if(sum<0){
                sum-nums[prt1];
                prt1=prt2;
                prt2++;
                sum=0;
            }else{
                prt2++;
            }
        }
        return max;
        
    }
};

