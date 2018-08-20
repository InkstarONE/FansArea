package beans;


public class User {

    private String name;
    private  String password;
    private  String tel;
    private  int id;
    private  int my_vip;
    private double my_wallet;
    private String my_auth;

    public User()
    {
        super();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMy_vip() {
        return my_vip;
    }

    public void setMy_vip(int my_vip) {
        this.my_vip = my_vip;
    }

    public double getMy_wallet() {
        return my_wallet;
    }

    public void setMy_wallet(double my_wallet) {
        this.my_wallet = my_wallet;
    }

    public String getMy_auth() {
        return my_auth;
    }

    public void setMy_auth(String my_auth) {
        this.my_auth = my_auth;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
