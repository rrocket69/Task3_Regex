package ua.training.Model;

/**
 * Класс записи в записной книжке
 *
 * @author benjamin
 */
public class Record implements Cloneable {
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
     * @param login
     */
    public Record(String login) {
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
