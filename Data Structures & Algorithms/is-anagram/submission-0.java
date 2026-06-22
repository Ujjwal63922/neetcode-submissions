class Solution {
    public boolean isAnagram(String s, String t) {
           char[]arr=s.toCharArray();
           Arrays.sort(arr);
           String s1=new String(arr);
           char[]arr1=t.toCharArray();
           Arrays.sort(arr1);
           String t1=new String(arr1);


           if(s1.equals(t1))
           return true;
        return false;
    }
}
