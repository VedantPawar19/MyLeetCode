class Solution {
    public boolean checkIfPangram(String sentence) {
        for (int i = 'a'; i <= 'z'; i++) {
            if(!IsFoundsearch(sentence, i)){
                return false;
            }
        }
        return true;
    }

    static boolean IsFoundsearch(String sentence, int i) {
        return sentence.indexOf(i) != -1;
    }
}