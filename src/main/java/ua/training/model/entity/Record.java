package ua.training.model.entity;

/**
 * Класс записи в записной книжке
 *
 * @author benjamin
 */
public class Record implements Cloneable {
    private int id;
    private String familyName;
    private String firstName;
    private String email;
    private String mobileNum;
    private String group;
    private String login;

    public Record() {

    }

    /**
     * Only to test login not unique exception
     * delete after testing of unique logins
     *
     * @param login
     */
    public Record(String login) {
        this.login = login;
    }

    public Record(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }

    public Record(int id, String firstName, String login) {
        this.id = id;
        this.firstName = firstName;
        this.login = login;
    }

    public String getShortName() {
        return familyName + " " + firstName.charAt(0) + ".";
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", login='" + login + '\'' +
                '}';
    }

    @Override
    public Record clone() {
        try {
            return (Record) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
