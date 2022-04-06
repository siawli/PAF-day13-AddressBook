package addressBook.day1364.model;

public class Contact {
    private String email;
    private String name;
    private String phone;
    private String status;
    private String date;
    private String passPhrase;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getPassPhrase() {
        return passPhrase;
    }
    public void setPassPhrase(String passPhrase) {
        this.passPhrase = passPhrase;
    }
    @Override
    public String toString() {
        return "Contact [date=" + date + ", email=" + email + ", name=" + name + ", passPhrase=" + passPhrase
                + ", phone=" + phone + ", status=" + status + "]";
    }

    
}
