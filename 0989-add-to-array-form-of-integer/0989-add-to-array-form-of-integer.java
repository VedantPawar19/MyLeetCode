class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry = 0;
        ArrayList<Integer> ansList = new ArrayList<>();

        int index = num.length - 1;

        while (index >= 0 || k > 0 || carry > 0) {
            int x = index >= 0 ? num[index] : 0;
            int y = k % 10;
            int sum = x + y + carry;

            ansList.add(sum % 10);
            carry = sum / 10;

            if (index >= 0) {
                index--;
            }

            k /= 10;
        }
        
        Collections.reverse(ansList);

        return ansList;
    }
}