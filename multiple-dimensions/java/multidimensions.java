public class multidimensions{
    public static void main(String[] args){
        int[][] nums = new int[6][5];
        
        nums[0][0] = 10;
        nums[0][1] = 12;
        nums[0][2] = 43;
        nums[0][3] = 11;
        nums[0][4] = 22;
        
        nums[1][0] = 20;
        nums[1][1] = 45;
        nums[1][2] = 56;
        nums[1][3] = 1;
        nums[1][4] = 33;
        
        nums[2][0] = 30;
        nums[2][1] = 67;
        nums[2][2] = 32;
        nums[2][3] = 14;
        nums[2][4] = 44;
        
        nums[3][0] = 40;
        nums[3][1] = 12;
        nums[3][2] = 87;
        nums[3][3] = 14;
        nums[3][4] = 55;
        
        nums[4][0] = 50;
        nums[4][1] = 86;
        nums[4][2] = 66;
        nums[4][3] = 13;
        nums[4][4] = 66;
        
        nums[5][0] = 60;
        nums[5][1] = 53;
        nums[5][2] = 44;
        nums[5][3] = 12;
        nums[5][4] = 11;
        
        int rows = 6;
        int columns = 5;
        int i, j;
        
        for (i = 0; i < rows; i++){
            for (j = 0; j < columns; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
