# Problem 1768: Merge Strings Alternately

## Problem Description
You are given two strings `word1` and `word2`. Merge the strings by adding letters in alternating order, starting with `word1`. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

### Example 1
**Input:** `word1 = "abc", word2 = "pqr"`  
**Output:** `"apbqcr"`  
**Explanation:**  
The merged string is formed as follows:
```
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
```

### Example 2
**Input:** `word1 = "ab", word2 = "pqrs"`  
**Output:** `"apbqrs"`  
**Explanation:**  
As `word2` is longer, `"rs"` is appended to the end.
```
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s
```

### Ý tưởng giải:
Duyệt qua từng chữ tại index 0,1,2,... của 2 String và thêm vào String kết quả.

### Lời giải: 
1. Tạo String rỗng để lưu kết quả
2. So sánh độ dài String của 2 chuỗi. Tạo 1 biến lưu maxLength.
3. Duyệt i chạy từ 0 -> maxLength, thêm lần lượt các chữ Str1[i] sau đó là Str2[i] khi i < độ dài Str1, Str2.
4. In ra kết quả



