package info.model.vo;

public class TeamSummVO {
    private String teamname;
    private String teamid;
    private long oldman;
    private long oldwoman;
    private long newwoman;
    private long newman;
    private long total;
    public String getTeamname() {
        return teamname;
    }
    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }
    public String getTeamid() {
        return teamid;
    }
    public void setTeamid(String teamid) {
        this.teamid = teamid;
    }
    public long getOldman() {
        return oldman;
    }
    public void setOldman(long oldman) {
        this.oldman = oldman;
    }
    public long getOldwoman() {
        return oldwoman;
    }
    public void setOldwoman(long oldwoman) {
        this.oldwoman = oldwoman;
    }
    public long getNewwoman() {
        return newwoman;
    }
    public void setNewwoman(long newwoman) {
        this.newwoman = newwoman;
    }
    public long getNewman() {
        return newman;
    }
    public void setNewman(long newman) {
        this.newman = newman;
    }
    public long getTotal() {
        return total;
    }
    public void setTotal(long total) {
        this.total = total;
    }
    @Override
    public String toString() {
        return "[teamname=" + teamname + ", teamid=" + teamid + ", oldman=" + oldman + ", oldwoman="
                + oldwoman + ", newwoman=" + newwoman + ", newman=" + newman + ", total=" + total + "]";
    }
    
    
}

