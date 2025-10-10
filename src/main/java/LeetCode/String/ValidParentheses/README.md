Đề bài:

https://leetcode.com/problems/valid-parentheses/

Cách giải:

Nếu là mở ngoặc thì push vào stack. Nếu là đóng ngoặc thì lấy top của stack ra. Nếu top của stack không trùng khớp thì return false;