class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
            
        for(int i = 0; i < sentences.length; i++){
            String[] str = sentences[i].split(" ");
            int countI = str.length;
            
            maxCount = Math.max(maxCount, countI);
        }
        
        return maxCount;
    }
}