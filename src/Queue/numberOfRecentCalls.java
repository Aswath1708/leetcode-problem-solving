package Queue;

import java.util.*;

class numberOfRecentCalls {
    Queue<Integer> queue;

    public void RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);

        while (queue.peek() < t - 3000) queue.poll();

        return queue.size();
    }
}
