Đề bài:

https://leetcode.com/problems/decode-ways/submissions/1781953252/?envType=problem-list-v2&envId=dynamic-programming

Cách giải: 
1. Tạo mảng dp[] với dp[i] là số cách có thể giải mã ở vị trí i
2. dp[0] = 1 vì mảng rỗng thì có 1 cách decode. dp[1] = 1 
3. Từ i = 2 : Có thể lấy thêm số đó => dp[i] += dp[i-1] hoặc lấy thêm 1 số trước đó để thành số có 2 chữ số => dp[i] += dp[i-2]