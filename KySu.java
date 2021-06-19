public class KySu extends CanBo{
    private String branch;

    public KySu(String name, String dateOfBirth, String gender, String address, String branch) {
        super(name, dateOfBirth, gender, address);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "KySu " +
                super.toString()+
                "branch='" + branch + '\'' +
                "" + "}";
    }
}
