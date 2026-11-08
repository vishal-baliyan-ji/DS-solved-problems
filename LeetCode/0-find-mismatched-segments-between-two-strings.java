class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        //boolean flag = false;
        List<List<String>> ans=new ArrayList<>();
        StringBuilder sb1 =new StringBuilder();
        StringBuilder sb2 =new StringBuilder();
        for(int i =0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                sb1.append(s1.charAt(i));
                sb2.append(s2.charAt(i));
            }
            else if(sb1.length()!=0 && s1.charAt(i)==s2.charAt(i)){
                List<String> l1=new ArrayList<>();
                l1.add(sb1.toString());
                l1.add(sb2.toString());
                ans.add(l1);
                sb1.setLength(0);
                sb2.setLength(0);
            }
        }
        if(sb1.length()!=0){
           List<String> l1=new ArrayList<>();
            l1.add(sb1.toString());
            l1.add(sb2.toString());
            ans.add(l1); 
        }
        return ans;
    }
}