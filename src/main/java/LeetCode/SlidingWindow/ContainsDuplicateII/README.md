Đề bài:

https://leetcode.com/problems/contains-duplicate-ii/solutions/7172311/beats-100-sliding-window-with-hashset-java-c-python-javascript/

Cách giải:

1. Giữ 1 cửa sổ có độ dài <= k bằng cách khi i > k thì remove phần tử ra khỏi set.
2. Nếu không thể add thêm vào set thì chứng tỏ phần tử đã trong set => True