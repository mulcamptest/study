package info.model.vo;

public class ApplyUListVO {
    private long count;
    private long rank;
    private String userid;
    private String username;
    private String gradeid;
    private String gradename;
    private String gender;
    private String teamid;
    private String teamname;
    public long getCount() {
        return count;
    }
    public void setCount(long count) {
        this.count = count;
    }
    public long getRank() {
        return rank;
    }
    public void setRank(long rank) {
        this.rank = rank;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getGradeid() {
        return gradeid;
    }
    public void setGradeid(String gradeid) {
        this.gradeid = gradeid;
    }
    public String getGradename() {
        return gradename;
    }
    public void setGradename(String gradename) {
        this.gradename = gradename;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getTeamid() {
        return teamid;
    }
    public void setTeamid(String teamid) {
        this.teamid = teamid;
    }
    public String getTeamname() {
        return teamname;
    }
    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }
    @Override
    public String toString() {
        return "ApplyUListVO [count=" + count + ", rank=" + rank + ", userid=" + userid + ", username=" + username
                + ", gradeid=" + gradeid + ", gradename=" + gradename + ", gender=" + gender + ", teamid=" + teamid
                + ", teamname=" + teamname + "]";
    }
    
}
