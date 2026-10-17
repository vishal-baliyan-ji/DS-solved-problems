public class Node{
    Node[] child=new Node[26];
    boolean isEnd=false;
}
class WordDictionary {
    Node root;
    public WordDictionary() {
        root=new Node();
    }
    
    public void addWord(String word) {
        Node curr=root;
        for(int i =0;i<word.length();i++){
            int val=word.charAt(i)-'a';
            if(curr.child[val]!=null){
                curr=curr.child[val];
            }
            else{
                curr.child[val]=new Node();
                curr=curr.child[val];
            }
        }
        curr.isEnd=true;
    }
    public boolean search(Node curr,String word,int i){
        if(curr==null) return false;
        if(i==word.length()) return curr.isEnd;
        int val=word.charAt(i)-'a';
        boolean ans=false;
        if(word.charAt(i)=='.'){
            for(int k =0;k<26;k++){
                if(curr.child[k]!=null){
                    ans=ans|| search(curr.child[k],word,i+1);
                }
            }
        }
        else if(curr.child[val]!=null){
            ans=search(curr.child[val],word,i+1);
        }
        else return false;
        return ans;
    }
    public boolean search(String word) {
        Node curr=root;
        boolean val=search(curr,word,0);
        return val;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */