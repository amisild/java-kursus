package viieshomework;

public class Vendor {
    private String companyName;
    private String address;
    private String nameOfRepresentative;
    private String phoneNumber;

    public Vendor(String companyName, String address, String nameOfRepresentative, String phoneNumber) {
        this.companyName = companyName;
        this.address = address;
        this.nameOfRepresentative = nameOfRepresentative;
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameOfRepresentative() {
        return nameOfRepresentative;
    }

    public void setNameOfRepresentative(String nameOfRepresentative) {
        this.nameOfRepresentative = nameOfRepresentative;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", nameOfRepresentative='" + nameOfRepresentative + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
