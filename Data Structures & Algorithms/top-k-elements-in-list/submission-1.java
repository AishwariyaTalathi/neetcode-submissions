class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Create a hashmap and store each number and its frequency
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int num:nums){
            freqMap.merge(num,1,Integer::sum);
        }
        //In a priority queue, keep adding the key and value.
        //Sort the queue by value(frequency)
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int num:freqMap.keySet()){
            int[] arr = new int[2];
            arr[0] = num;
            arr[1] = freqMap.get(num);
            queue.add(arr);
            //if number of elements exceed count k, poll from the queue
            if(queue.size()>k) {
                queue.poll();
            }
        }
        int[] output = new int[k];
        for(int i = 0;i<k;i++){
            output[i] = queue.poll()[0];
        }
        return output;
    }
}
