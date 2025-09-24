Đề bài:
https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75

Cách giải:
1. Đặt 2 con trỏ i,j. i tạo s[0], j tại t[0];
2. Nếu chữ cái trong s và t trùng nhau thì tăng i lên. Tăng j kể cả khi không trùng
3. Nếu i == chiều dài s thì trả về true
