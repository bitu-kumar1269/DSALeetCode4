class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<List<Integer>, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each row
        for(int i=0; i<n; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<n; j++){
                row.add(grid[i][j]);
            }
            map.put(row, map.getOrDefault(row, 0) +1);
        }
        int count = 0;

        // Step 2: Compare each column against stored rows
        for(int j=0; j<n; j++){
            List<Integer> col = new ArrayList<>();
            for(int i=0; i<n; i++){
                col.add(grid[i][j]);
            }
            // Add the frequency of matching row pattern
            count += map.getOrDefault(col, 0);
        }
        return count;
    }
}