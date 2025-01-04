class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {        
        List<Integer> ans=new ArrayList<Integer>();
        
        int top=0; //row
        int right=matrix[0].length-1; //col
        int bottom=matrix.length-1; //row
        int left=0; //col

        while(top<=bottom && left<=right){
            for(int i=top; i<=right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}