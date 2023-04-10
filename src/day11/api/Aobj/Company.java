package day11.api.Aobj;

public class Company {

    String company; // 회사명
    String address; // 회사주소

    public Company(String company, String address) {
        this.company = company;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "company='" + company + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
