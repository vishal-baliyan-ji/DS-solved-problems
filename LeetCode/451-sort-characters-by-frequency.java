class Solution {
    public String frequencySort(String s) {
        int[][] arr=new int[62][2];
        for(int i =0;i<arr.length;i++){
            arr[i][0]=i;
        }
        for(int i =0;i<s.length();i++){
            int val=0;
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                val=s.charAt(i)-'a';
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                val=s.charAt(i)-'A'+26;
            }
            else{
                val =s.charAt(i)-'0'+52;   
            }
            arr[val][1]+=1;
        }
        Arrays.sort(arr,(a,b)->Integer.compare(b[1],a[1]));
        StringBuilder sb=new StringBuilder();
        for(int i =0;i<arr.length;i++){
            for(int j=arr[i][1];j>0;j--){
                int val=arr[i][0];
                if(val<26){
                    sb.append((char)(val+'a'));
                }
                else if(val<52){
                    sb.append((char)(val-26+'A'));
                }
                else{
                    sb.append((char)(val-52+'0'));
                }
            }
        }
        return sb.toString();
    }
}