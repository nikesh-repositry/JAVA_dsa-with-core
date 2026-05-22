//count how many balloon can be made
class Solution {
    public int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count = 0;
        String s = "balloon";
        
        while(true){
            boolean p = true;
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                int current = map.getOrDefault(ch,0);
                if(!map.containsKey(ch) || map.get(ch)<1){
                    p = false;
                }else{
                    map.put(ch,current-1);
                }
                
            }
            if(p){
                count++;
            }else{
                break;
            }
        }
        return  count;
        
    }
}
