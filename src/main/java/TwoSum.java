class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j]==target){
                    sum[0]=i;
                    sum[1]=j;
                    return sum;
                }
            }
        }
        return new int[]{};

    }
    public static void main(String[] args){
        int[] result = TwoSum.twoSum(new int[]{1, 3, 5}, 8);  // Вызов через имя класса

        if (result.length == 2) {
            System.out.println("Индексы: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("Пара не найдена.");
        }

    }
}



