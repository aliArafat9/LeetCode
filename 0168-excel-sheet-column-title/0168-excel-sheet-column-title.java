class Solution {
    public String convertToTitle(int columnNumber) {
        String str="";
        while(columnNumber>0)
        {
            columnNumber--;
           
            // Get the last character and append it at the end of the string.
            str=(char) ((columnNumber)%26+'A')+str;
            columnNumber/=26;
        }
        return str;
    }
}