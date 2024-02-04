class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        if(s.charAt(0)==']'||s.charAt(0)==')'||s.charAt(0)=='}'){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            if(st.isEmpty() && (ch==']'||ch==')'||ch=='}')){
                return false;
            }
            if((ch==')'&& st.peek()!='(')||(ch==']'&& st.peek()!='[')||(ch=='}'&& st.peek()!='{'))return false;
            if(st.peek()=='(' && ch==')' ||st.peek()=='{' && ch=='}' ||st.peek()=='[' && ch==']' ){
                st.pop();
            }
        }
        return st.isEmpty();
    }
}