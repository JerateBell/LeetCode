Đề bài:
https://leetcode.com/problems/find-pivot-index/?envType=study-plan-v2&envId=leetcode-75

Cách giải: 
1. Tạo 1 mảng lưu tổng ở phần tử arrLeft[i] = tổng từ arr[0] -> arr[i]
2. Tạo 1 mảng lưu tổng ở phần tử arrRight[i] = tổng từ arr[arr.length-1] -> arr[i]
3. Xem arrLeft[i] == arrRight[i] hay không