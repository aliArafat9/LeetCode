class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int pval=0;
        int ans=0;
        for(int i=s.length()-1;i>=0;i--){
            int cval = hm.get(s.charAt(i));            
            if(cval >= pval)
                ans+=cval;
            else
                ans-=cval;
            pval=cval;
        }
        return ans;
    }
}