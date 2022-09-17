import java.util.ArrayList;
import java.util.List;

public class SubsetsOfArray {
    public static void powerSet(int[] nums, int index , List<List<Integer>> ans, List<Integer> output){
        if(index == nums.length){
            ans.add(output);
            System.out.println("ans is : "+ans.toString());
            return;
        }
        System.out.println(nums[index]);
        output.add(nums[index]);
        System.out.println("size"+output.size());
        powerSet(nums,index+1,ans,output);
        output.remove(index);
        output.remove(output.size()-1);
        System.out.println(output.size()-1+","+index);
        System.out.println(output.toString());
        powerSet(nums,index+1,ans,output);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> res = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        powerSet(nums,0,ans,res);
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3};
        System.out.println(subsets(arr));
    }
}
