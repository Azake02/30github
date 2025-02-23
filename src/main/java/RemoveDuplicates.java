public class RemoveDuplicates {
        public int removeElement(int[] nums, int val) {
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            }
            return i;
        }
        public static void main(String[] args){
            RemoveDuplicates rm = new RemoveDuplicates();
            System.out.println(rm.removeElement(new int[]{1,2,3,4,5}, 5));
        }
    }

