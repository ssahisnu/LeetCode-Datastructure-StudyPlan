class Solution {
    //TC - O(N)
    //SC - O(C) character set, in case of lowercase - O(1) bitmask
    public int firstUniqChar(String s) {
        int isCharFoundInStr = 0;
        int isRepeatingChar = 0;
        for(char c: s.toCharArray()){
            int bitMask = 1 << c - 'a';
            if((isCharFoundInStr & bitMask) ==0) {
                isCharFoundInStr^=bitMask;
            } else if((isRepeatingChar & bitMask) ==0 ) {
                isRepeatingChar^=bitMask;
            }
        }
        for(int i=0; i<s.length(); ++i){
            char c = s.charAt(i);
            int bitMask = 1 << c - 'a';
            if((isCharFoundInStr & bitMask)!=0 &&
               (isRepeatingChar & bitMask)==0)
                return i;
        }
        return -1;
    }
}
