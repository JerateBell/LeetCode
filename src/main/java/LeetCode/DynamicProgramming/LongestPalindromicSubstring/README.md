Đề bài:

https://leetcode.com/problems/longest-palindromic-substring/description/
Cách giải:
1. Tạo mảng dp[i][j] với i->j là vị trí start và end của chuỗi sub string. 
2. Đầu tiên tất cả dp[i][j] = false
3. Vì chuỗi 1 luôn là Palindrome nên dp[i][i] bất kỳ luôn true
4. Với chuỗi 2 thì các chuỗi có 2 chữ giống nhau là Palindrome
5. Với chuỗi có 3 chữ trở lên: chọn 1 chuỗi 3 bất kỳ từ đầu dãy, nếu dp[i+1][j-1] cũng true (chuỗi con của chuỗi ngoài) thì dp[i][j] là true
6. Tương tự với 4,5,6,....
