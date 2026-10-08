class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int []ans = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        for(int i =0;i<n;i++){
            queue.add(i);
        }
        for(int card:deck){
            int index = queue.poll();
            ans[index] = card;
            if(!queue.isEmpty()){
                queue.add(queue.poll());

            }
        }

        return ans;
    }
}