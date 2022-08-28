class Solution {
    //TC - O(N)
    //SC - O(CharcterSet)
    public boolean canConstruct(String ransomNote, String magazine) {
        int rL = ransomNote.length();
        int mL = magazine.length();
        
        if(rL>mL) return false;
        
        int[] magFreq = new int[26];
        for(char c: magazine.toCharArray()) magFreq[c - 'a']++;
        for(char c: ransomNote.toCharArray()) {
            if(magFreq[c-'a']==0) return false;
            magFreq[c-'a']--;
        }
        
        return true;
    }
}
