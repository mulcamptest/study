package info.model.vo;

public class TeamUserListVO {
    private String gradeid;
    private long manrank;
    private String manname;
    private long womrank;
    private String womname;
    public String getGradeid() {
        return gradeid;
    }
    public void setGradeid(String gradeid) {
        this.gradeid = gradeid;
    }
    public long getManrank() {
        return manrank;
    }
    public void setManrank(long manrank) {
        this.manrank = manrank;
    }
    public String getManname() {
        return manname;
    }
    public void setManname(String manname) {
        this.manname = manname;
    }
    public long getWomrank() {
        return womrank;
    }
    public void setWomrank(long womrank) {
        this.womrank = womrank;
    }
    public String getWomname() {
        return womname;
    }
    public void setWomname(String womname) {
        this.womname = womname;
    }
    @Override
    public String toString() {
        return "TeamUserListVO [gradeid=" + gradeid + ", manrank=" + manrank + ", manname=" + manname + ", womrank="
                + womrank + ", womname=" + womname + "]";
    }
    
    
}
