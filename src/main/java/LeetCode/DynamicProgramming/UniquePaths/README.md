Đề bài:

https://leetcode.com/problems/unique-paths/

Cách giải:

Đánh dấu dp[i][j] là số cách để đi đến vị trí [i][j] => hàng 1 và cột 1 chỉ có 1 cách. Các ô sau có thể đi từ dp[i-1][j] và dp[i][j-1]
