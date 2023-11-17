public class Bai2 {
    public static void main(String[] args) {
        Bill bill= new Bill();
        bill.input();
        bill.output();
        System.out.printf("%-25s%-15s%-15s%-15s%-15s\n","Tên hàng hóa, dịch vụ","Đơn vị tính","Số lươợng","Đơn giá","Thành tiền");
        bill.most().output();
    }
}
