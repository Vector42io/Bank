package kg.vextor.vextor.Bank;

public class Account {
    Safe safeObject;
    String name;
    String password;

    public Account(String name, String password, Safe s) {
        this.name = name;
        this.safeObject = s;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public Safe getSafeObject() {
        return safeObject;
    }

    public void setSafeObject(Safe safeObject) {
        this.safeObject = safeObject;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
