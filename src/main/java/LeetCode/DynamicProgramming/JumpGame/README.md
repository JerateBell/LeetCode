Đề bài:

https://leetcode.com/problems/jump-game/?envType=problem-list-v2&envId=dynamic-programming

Cách giải:
- Đặt vị trí cuối cùng trong arr là goal mà ta cần đến.
- Để đến được goal ta bắt buộc phải đến được index gần nhất mà có thể đến goal
- Duyệt từ cuối dãy, đặt vị trí đó là goal mới mà ta cần đến được
- Nếu đến được vị trí 0 thì trả về true