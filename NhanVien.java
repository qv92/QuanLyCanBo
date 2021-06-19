public class NhanVien extends CanBo{
    public NhanVien(String name, String dateOfBirth, String gender, String address) {
        super(name, dateOfBirth, gender, address);
    }

    @Override
    public String toString() {
        return "NhanVien " + super.toString()+"}";
    }
}
