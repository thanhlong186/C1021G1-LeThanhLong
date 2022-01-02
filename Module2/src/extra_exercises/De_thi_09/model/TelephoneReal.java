package extra_exercises.De_thi_09.model;

public class TelephoneReal extends Telephone{
    private double warrantyPeriod;
    private String warrantyCoverage;

    public TelephoneReal() {
    }

    public TelephoneReal(int idPhone,
                         String namePhone,
                         Double price,
                         int amount,
                         String manufacturer,
                         double warrantyPeriod,
                         String warrantyCoverage) {
        super(idPhone, namePhone, price, amount, manufacturer);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCoverage = warrantyCoverage;
    }

    public double getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(double warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyCoverage() {
        return warrantyCoverage;
    }

    public void setWarrantyCoverage(String warrantyCoverage) {
        this.warrantyCoverage = warrantyCoverage;
    }

    @Override
    public String toString() {
        return "TelephoneReal{" +
                super.toString() +
                "warrantyPeriod=" + warrantyPeriod +
                ", warrantyCoverage='" + warrantyCoverage + '\'' +
                '}';
    }
}
