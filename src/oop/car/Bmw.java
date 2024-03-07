package oop.car;

public class Bmw extends Car {
    private String branchName;
    private String country;

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

    @Override
    public void tyre() {
        System.out.println("BMW uses Bridgestone tyre");
    }
}
