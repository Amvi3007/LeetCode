class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<students.length;i++){
            q.add(students[i]);
        }
        for(int i =sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        int count = 0;
        while(!st.isEmpty()  && count < q.size()){
            if(st.peek() == q.peek()){
                st.pop();
                q.poll();
                count = 0;
            }else{
                int s = q.peek();
                q.poll();
                q.add(s);
                count++;
            }
        }
        return q.size();
    }
}