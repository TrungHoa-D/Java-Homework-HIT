public class Bai4 {
    /*Đoạn Regex bạn đưa ra được sử dụng để kiểm tra tính hợp lệ của một địa chỉ email. Gồm các thành phần:

    ^[\\w!#$%&’*+/=?{|}~^-]+: Kiểm tra phần tên người dùng của email bao gồm một hoặc nhiều ký tự từ các nhóm sau: chữ và số (\w), các ký tự đặc biệt như !#$%&’*+/=?{|}~^-.

    (?:\\.[\\w!#$%&’*+/=?{|}~^-]+)*`: Kiểm tra tên người dùng có chứa một hoặc nhiều phần được phân tách bằng dấu chấm (`.`) có điều kiện như phần trước.

    @: Ký tự này phân tách giữa tên người dùng và tên miền.

    (?:[a-zA-Z0-9-]+\\.)+: Kiểm tra phần tên miền của email. Tên miền có thể chứa một hoặc nhiều chữ thường, chữ hoa và số được phân tách bằng dấu chấm.

    [a-zA-Z]{2,6}$: Kiểm tra phần mở rộng của tên miền (như .com, .vn, .net, .org, v.v.) từ 2 đến 6 ký tự chữ.*/
}
