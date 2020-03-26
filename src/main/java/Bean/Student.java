package Bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private long s_id;
    private String name, address, contact,fees,course,password,admission_date;

    @Column(unique = true,nullable = false)
    private String username;

    public Student() {
    }

    public Student(String name, String address, String contact, String username, String fees, String course, String password, String admission_date) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.username = username;
        this.fees = fees;
        this.course = course;
        this.password = password;
        this.admission_date = admission_date;
    }

    public long getS_id() {
        return s_id;
    }

    public void setS_id(long s_id) {
        this.s_id = s_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdmission_date() {
        return admission_date;
    }

    public void setAdmission_date(String admission_date) {
        this.admission_date = admission_date;
    }
}
