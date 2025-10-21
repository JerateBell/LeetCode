Đề bài:

https://leetcode.com/problems/longest-consecutive-sequence/description/

Cách giải:

- Add tất cả số vào set
- Tìm số nhỏ nhất bắt đầy chuỗi = cách: với mỗi i, nếu có số i - 1 trong set -> continue
- Nếu không có trong set, nếu có số i + 1 -> duyệt tiếp đến khi đến số lớn nhất
