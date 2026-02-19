package TwoPointer;
class ReverseString{
    public void reverseString(char[] s) {
        for(int i = 0, j = s.length - 1; i <= (s.length-1) / 2; i++, j--){
            char aux = s[i];
            s[i] = s[j];
            s[j] = aux;
        }        
    }
}

// class Solution {
//     public void reverseString(char[] s) {
//         for(int i=0,j=s.length-1;i<=j;i++,j--){
//             char ch=s[i];
//             s[i]=s[j];
//             s[j]=ch;
//         }
//     }
// }