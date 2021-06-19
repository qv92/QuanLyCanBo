public class CongNhan extends CanBo{
    private String level;
    private String branch;

    public CongNhan(String name, String dateOfBirth, String gender, String address, String level, String branch) {
        super(name, dateOfBirth, gender, address);
        this.level = level;
        this.branch = branch;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "CongNhan " +
                super.toString()  +
                ", branch='" + branch + '\'' +
                " " + "level='" + level + '\''+"}";
    }
}
