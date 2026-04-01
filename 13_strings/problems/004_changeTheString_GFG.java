// if first character of string is lower then change all to lowercase and if not then in uppercase

class Solution {
    String modify(String s) {
        char v = s.charAt(0);
        if(Character.isLowerCase(v)){
            s=s.toLowerCase();
        }else{
            s=s.toUpperCase();
        }
        return s;
    }
}
