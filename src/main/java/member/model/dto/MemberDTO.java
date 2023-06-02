package member.model.dto;

public class MemberDTO implements java.io.Serializable{
    private int memberCode;
    private String memberName;
    private String birthDate;
    private String categoryCode;
    private String introduce;
    private String startDate;
    private String activateStatus;

    public MemberDTO () {}

    public MemberDTO(int memberCode, String memberName, String birthDate, String categoryCode, String interduce, String startDate, String activateStatus) {
        this.memberCode = memberCode;
        this.memberName = memberName;
        this.birthDate = birthDate;
        this.categoryCode = categoryCode;
        this.introduce = interduce;
        this.startDate = startDate;
        this.activateStatus = activateStatus;
    }

    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getInterduce() {
        return introduce;
    }

    public void setInterduce(String interduce) {
        this.introduce = interduce;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getActivateStatus() {
        return activateStatus;
    }

    public void setActivateStatus(String activateStatus) {
        this.activateStatus = activateStatus;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberCode=" + memberCode +
                ", memberName='" + memberName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", categoryCode='" + categoryCode + '\'' +
                ", introduce='" + introduce + '\'' +
                ", startDate='" + startDate + '\'' +
                ", activateStatus='" + activateStatus + '\'' +
                '}';
    }
}
