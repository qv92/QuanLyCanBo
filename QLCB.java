import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QLCB {
    public QLCB() {
    }
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<CanBo> list = new ArrayList<>();
    static NameComparator comparator = new NameComparator();

    QLCB qlcb = new QLCB();
    public static void addCongNhan(){
        System.out.println("NHập tên");
        String name = scanner.nextLine();
        System.out.println("NHập ngày tháng năm sinh");
        String dateOfBirth = scanner.nextLine();
        System.out.println("NHập giới tính");
        String gender = scanner.nextLine();
        System.out.println("NHập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("NHập cấp bậc");
        String level = scanner.nextLine();
        System.out.println("NHập ngành");
        String branch = scanner.nextLine();
        CanBo canBo = new CongNhan(name,dateOfBirth,gender,address,level,branch);
        list.add(canBo);
    }
    public static void addNhanVien(){
        System.out.println("NHập tên");
        String name = scanner.nextLine();
        System.out.println("NHập ngày tháng năm sinh");
        String dateOfBirth = scanner.nextLine();
        System.out.println("NHập giới tính");
        String gender = scanner.nextLine();
        System.out.println("NHập địa chỉ");
        String address = scanner.nextLine();
        CanBo canBo = new NhanVien(name,dateOfBirth,gender,address);
        list.add(canBo);
    }
    public static void addKySu(){
        System.out.println("NHập tên");
        String name = scanner.nextLine();
        System.out.println("NHập ngày tháng năm sinh");
        String dateOfBirth = scanner.nextLine();
        System.out.println("NHập giới tính");
        String gender = scanner.nextLine();
        System.out.println("NHập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("NHập ngành");
        String branch = scanner.nextLine();
        CanBo canBo = new KySu(name,dateOfBirth,gender,address,branch);
        list.add(canBo);
    }
    public static void addCanBo(){
        while (true){
            System.out.println("1.Thêm công nhân");
            System.out.println("2.Thêm nhân viên");
            System.out.println("3.Thêm kỹ sư");
            System.out.println("4.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1 :
                    addCongNhan();
                    break;
                case 2 :
                    addNhanVien();
                    break;
                case 3:
                    addKySu();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Nhập không đúng");
                    return;
            }
            if (choice==4) break;
        }
    }
    public static void showCanBo(){
        for (CanBo b:list) {
            System.out.println(b);
        }
    }
    public static void searchCanBo(String name){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                System.out.println(list.get(i));
            }else System.out.println("Không tìm thấy");
        }
    }
    public static void removeNhanVien(String name){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                list.remove(i);
            }
        }
    }
    public static void editNhanVien(String name, String nameAfter){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                list.get(i).setName(nameAfter);
            }
        }
    }
    public static void sortCanBo(){
        list.sort(comparator);
    }
    public static void searchBranch(String branch){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toString().contains(branch)){
                System.out.println(list.get(i));
            }
        }
    }
    public static void main(String[] args) {
        while (true){
            System.out.println("Quản lý cán bộ");
            System.out.println("1.Thêm cán bộ");
            System.out.println("2.Tìm kiếm cán bộ");
            System.out.println("3.Xóa nhân viên");
            System.out.println("4.Sửa tên nhân viên");
            System.out.println("5.Hiển thị danh sách cán bộ");
            System.out.println("6.Sắp xếp cán bộ theo tên");
            System.out.println("7.Tìm kiếm cán bộ theo ngành");
            System.out.println("8.Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    QLCB.addCanBo();
                    break;
                case 2:
                    System.out.println("Nhập tên cán bộ cần tìm");
                    String nameSearch = scanner.nextLine();
                    QLCB.searchCanBo(nameSearch);
                    break;
                case 3 :
                    System.out.println("Nhập tên nhân viên cần xóa");
                    String nameNhanVien = scanner.nextLine();
                    QLCB.removeNhanVien(nameNhanVien);
                    break;
                case 4 :
                    System.out.println("Nhập tên nhân viên cần sửa");
                    String nameNhanVienCanSua = scanner.nextLine();
                    System.out.println("Nhập tên nhân viên muốn thay");
                    String nameNhanVienMoi = scanner.nextLine();
                    QLCB.editNhanVien(nameNhanVienCanSua,nameNhanVienMoi);
                    break;
                case 5:
                    QLCB.showCanBo();
                    break;
                case 6:
                    QLCB.sortCanBo();
                    break;
                case 7 :
                    System.out.println("Nhập ngành cần tìm");
                    String branchSearch=scanner.nextLine();
                    QLCB.searchBranch(branchSearch);
                    break;
                case 8 :
                    System.exit(0);
                default:
                    System.out.println("Nhập không đúng");
                    return;
            }
        }
    }
}

