class Solution {
    //TC - O(N)
    //SC - O(charSet) 
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] charFreqArr = new int[26];
        for(int i=0; i<s.length(); ++i) {
            charFreqArr[s.charAt(i)-'a']++;
            charFreqArr[t.charAt(i)-'a']--;
        }
        
        for(int i=0; i<26; ++i) {
            if(charFreqArr[i]!=0)
                return false;
        }
        
        return true;
    }
    
  
//Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
    
// String.codePointAt(int index) method to get the integer representation of a Unicode (as the key in the hash table)
// and use Character.charCount(int code) to count how many the characters are used there (to correctly increase our index)
    
//     public boolean isAnagram(String s, String t) {
//         if (s==null && t==null) return true;
//         else if (s==null || t==null) return false;
//         else if (s.length() != t.length()) return false;
        
//         Map<Integer, Integer> dict = new HashMap<>();
//         int index = 0;
//         while(index < s.length()) {
//             int charCode = s.codePointAt(index); // Get the integer representation of Unicode 
//             dict.put(charCode, dict.getOrDefault(charCode, 0) + 1);
//             index += Character.charCount(charCode); // The Unicode could be represented by either one char or two chars
//         }
        
//         index = 0;
//         while(index < t.length()) {
//             int charCode = t.codePointAt(index);
//             int count = dict.getOrDefault(charCode, 0);
            
//             if (count == 0) return false;
//             else dict.put(charCode, count - 1);
            
//             index += Character.charCount(charCode);
//         }
        
//         return true;
//     }

}
