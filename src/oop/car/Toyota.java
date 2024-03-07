package oop.car;

public class Toyota extends Car {
    public String branchName;
    private String country;

    public Toyota(int year) {
        System.out.println("Establish year is " + year);
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void tyre() {
        System.out.println("Toyota use Michelin tyre");
        System.out.println("Toyota use latest tech tyre");
    }

    public static Toyota getObject() {
        return new Toyota(1890);
    }
}
