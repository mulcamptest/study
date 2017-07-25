package info.model.vo;

public class SummVO {
    private String teamid;
    private String name;
    private int gradeid;
    private String gender;
    private String genre1;
    private String genre2;
    private String genre3;
    @Override
    public String toString() {
        return "SummVO [teamid=" + teamid + ", name=" + name + ", gradeid=" + gradeid + ", gender=" + gender
                + ", genre1=" + genre1 + ", genre2=" + genre2 + ", genre3=" + genre3 + "]";
    }
    public String getTeamid() {
        return teamid;
    }
    public void setTeamid(String teamid) {
        this.teamid = teamid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGradeid() {
        return gradeid;
    }
    public void setGradeid(int gradeid) {
        this.gradeid = gradeid;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGenre1() {
        return genre1;
    }
    public void setGenre1(String genre1) {
        this.genre1 = genre1;
    }
    public String getGenre2() {
        return genre2;
    }
    public void setGenre2(String genre2) {
        this.genre2 = genre2;
    }
    public String getGenre3() {
        return genre3;
    }
    public void setGenre3(String genre3) {
        this.genre3 = genre3;
    }
    
}
