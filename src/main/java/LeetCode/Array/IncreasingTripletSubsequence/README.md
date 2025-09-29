Đề bài:

https://leetcode.com/problems/increasing-triplet-subsequence/

Cách giải:
- Duyệt qua các phần từ trong mảng
- Chọn first nếu i < first
- Sau khi chọn first, ta chọn second > first
- Nếu chọn được third thì return true

Điểm cần lưu ý của cách giải này là ở kết quả cuối cùng có thể ra cặp số first nằm ở giữa second. Vì 3rd luôn luôn > 2nd và nếu tìm được 2nd thì chắc chắn tồn tại 1st ở dâu đó trước 2nd trong dãy