Đề bài:

https://leetcode.com/problems/continuous-subarray-sum/

Cách giải: 

Ta có:
1. nums[i] = k * n + modK1
2. num[j] = k * m + modK2
3. Nếu modK2 = modK1  => num[j] - num[i] = k*(m - n) chia hết cho K.

Ta cũng có:
(a % k + b) % k = (a + b) % k 