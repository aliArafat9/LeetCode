class Solution {

    public int maximum69Number(int n) {

        String num = Integer.toString(n);
        
        String ans = "";
        
        boolean check = false;
        
        for (int i = 0; i < num.length(); i++) {
            
            if (num.charAt(i) != '9') {
                ans = num.substring(0, i) + '9' + num.substring(i + 1, num.length());
                check = true;
            }
            
   
            if (check) {
                break;
            }
        }

        if (ans.length() == 0) {
            return n;
        }

        int result = Integer.parseInt(ans);
        return result;
    }
}