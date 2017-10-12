package leetcode.p2.p23.e238;

/**
 * Created by kunmiao.yang on 2017/5/10.
 */
public class PAES {
    public int[] productExceptSelf(int[] nums) {
        int zeroIndex = -1, proAll = 1;
        for(int i = 0; i<nums.length; i++) {
            if(0 == nums[i]) {
                if(-1<zeroIndex) return new int[nums.length];
                else zeroIndex = i;
            } else proAll*=nums[i];
        }
        if(-1<zeroIndex) {
            int[] ret = new int[nums.length];
            ret[zeroIndex] = proAll;
            return ret;
        }
        for(int i = 0; i<nums.length; nums[i]=proAll/nums[i++]);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,3};
        long startTime=System.currentTimeMillis();
        int[] pro = new PAES().productExceptSelf(nums);
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.print("Indices: [");
        for(int i = 0; i<nums.length; i++) System.out.print(pro[i] + ", ");
        System.out.println("]");
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
