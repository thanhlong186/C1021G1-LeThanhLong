package extra_exercises.De_thi_09.model;

import java.util.Comparator;

public abstract class Telephone implements Comparable<Telephone>, Comparator<Telephone> {
    private int idPhone;
    private String namePhone;
    private Double price;
    private int amount;
    private String manufacturer;

    public Telephone() {
    }

    public Telephone(int idPhone, String namePhone, Double price, int amount, String manufacturer) {
        this.idPhone = idPhone++;
        this.namePhone = namePhone;
        this.price = price;
        this.amount = amount;
        this.manufacturer = manufacturer;
    }

    public int getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(int idPhone) {
        this.idPhone = idPhone;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "idPhone='" + idPhone + '\'' +
                ", namePhone='" + namePhone + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public int compareTo(Telephone o) {
        if (this.price > o.getPrice()) {
            return 1;
        } else if (this.price < o.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int compare(Telephone o1, Telephone o2) {
        if (o1.price > o2.getPrice()) {
            return -1;
        } else if (o1.price < o2.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }
}
