class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
            
        for(int i = 0; i < sentences.length; i++){
            int countI = 1;
            for(int j = 0; j < sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' '){
                    countI++;
                }
            }
            maxCount = Math.max(maxCount, countI);
        }
        
        return maxCount;
    }
}