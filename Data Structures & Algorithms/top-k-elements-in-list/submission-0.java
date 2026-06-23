class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int []arr = new int[k];
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        for(int i=0;i<k;i++){
            int maxFreq=0;
            int maxElement=0;

            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                if(entry.getValue()>maxFreq){
                    maxFreq=entry.getValue();
                    maxElement=entry.getKey();
                }
            }
            arr[i]=maxElement;
            map.remove(maxElement);
        }
        return arr;

    }
}
