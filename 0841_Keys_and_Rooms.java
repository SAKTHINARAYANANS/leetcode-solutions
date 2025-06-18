class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean visited[]=new boolean[n];
        Queue<Integer> qw = new ArrayDeque<>();
        visited[0]=true;
        qw.offer(0);
        int count=1;
        while(qw.size()!=0)
        {
            int cur=qw.poll();
            for(int x:rooms.get(cur))
            {
                if(!visited[x])
                {
                    visited[x]=true;
                    count++;
                    qw.offer(x);
                }
        }
        }
        return count==n;
    }
}