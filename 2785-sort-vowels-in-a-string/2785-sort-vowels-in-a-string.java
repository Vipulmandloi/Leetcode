class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        List<Integer> index = new ArrayList<>();
        List<Character> ch = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            char ch1 =Character.toLowerCase(c);
            if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'){
                 index.add(i);
                 ch.add(c);
            }
        }
        Collections.sort(ch);
        for(int i=0; i<index.size() ; i++){
           sb.setCharAt(index.get(i),ch.get(i));
        }
        return sb.toString();
    }
}