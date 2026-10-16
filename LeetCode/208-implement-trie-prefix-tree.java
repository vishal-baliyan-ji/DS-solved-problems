class Node{ // node for trie
    Node[] child=new Node[26];  //every node stores 26 charcters as child
    boolean isEnd=false; // flag to check if word ends here
}
class Trie {
    Node root;
    public Trie() {
        root=new Node();//defined root of the trie
    }
    
    public void insert(String word) {
        Node curr=root;// set a iterator to iterate over the trie
        for(int i =0;i<word.length();i++){
            int val=word.charAt(i)-'a'; // find the index for current charcter
            if(curr.child[val]!=null){ // if it exists got to child
                curr=curr.child[val]; 
            }
            else{// otherwise assign new child
                curr.child[val]=new Node();
                curr=curr.child[val];
            }
        }
        curr.isEnd=true;
    }
    
    public boolean search(String word) {
        Node curr=root;// set a iterator to iterate over the trie
        for(int i=0;i<word.length();i++){
            int val=word.charAt(i)-'a';// find index of child
            if(curr.child[val]==null) return false;// if dows not exist return false
            else curr=curr.child[val];// else go to that child
        }
        return curr.isEnd;// check id word ends here
    }
    
    public boolean startsWith(String word) {
        Node curr=root;// set a iterator to iterate over the trie
        for(int i=0;i<word.length();i++){
            int val=word.charAt(i)-'a';// find index of child
            if(curr.child[val]==null) return false;// if dows not exist return false
            else curr=curr.child[val];// else go to that child
        }
        return true;// if prefix exist retunr true
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */