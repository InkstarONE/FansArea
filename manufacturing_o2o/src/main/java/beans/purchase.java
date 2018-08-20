package beans;

import java.util.Date;

public class purchase {
    private int kind;
    private String materials;
    private int number;
    private Date date;
    private int budget_amount;
    private int id;
    private Date deadline;
    private String adress;
    private String orderNumbers;
    private int sORp;

    public int getsORp() {
        return sORp;
    }

    public void setsORp(int sORp) {
        this.sORp = sORp;
    }

    public String getOrderNumbers() {
        return orderNumbers;
    }

    public void setOrderNumbers(String orderNumbers) {
        this.orderNumbers = orderNumbers;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    private String detail;

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getBudget_amount() {
        return budget_amount;
    }

    public void setBudget_amount(int budget_amount) {
        this.budget_amount = budget_amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public purchase() {

    }
}