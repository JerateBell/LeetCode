Đề bài

https://leetcode.com/problems/letter-combinations-of-a-phone-number/

Cách giải:

- Dùng đệ quy dfs để giải.  
- Nếu ký tự đầu tiên trong s là root của cây. Ví dụ '2' thì sẽ có 3 con là a,b,c. Cứ thế đi đến 1 lá là được 1 chuỗi.
- 1 chuỗi bất kỳ trong list kết quả là đi đường đi từ đỉnh đến lá của cây.