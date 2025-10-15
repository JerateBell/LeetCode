Đề bài:
https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/

Cách giải:

- Khi khi val của fast.next == val của fast -> dịch con trỏ fast ra sau
- Nếu mà slow.next != fast => chứng tỏ fast đã đi 1 chặng > 1  => nhảy slow đến fast
- Nếu  slow.next == fast -> fast chỉ đi 1 lần => slow đi 1 lần