Đề bài

https://leetcode.com/problems/word-break/description/

Cách giải:

1. Khởi tạo mảng dp[i] = true nếu đoạn [0...i-1] tạo thành 1 từ trong wordDict
2. Duyệt từ đầu đến cuối string. Với mỗi i, duyệt xem từ đầu đến vị trí đó có tồn tại 1 word trong wordDict không => nếu có dp[i] = true
3. Kết quả là dp[str.length()] => nếu true str được từ các đoạn con true