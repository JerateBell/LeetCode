Đề bài:

https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

Cách giải:

Dùng sliding window và hashset để đánh dấu ký tự đã có trong cửa sổ, khi gặp ký tự trùng thì dịch left lên. Lấy maxLen(cửa sổ hiện tại, Maxlen)