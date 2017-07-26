package info.model.vo;

public class ApplyTGenreVO {
    private long rank;
    private long count;
    private String genreid;
    private String genrename;
    private String genreurl;
    private String teamid;
    private String teamname;
    
    public long getRank() {
        return rank;
    }
    public void setRank(long rank) {
        this.rank = rank;
    }
    public long getCount() {
        return count;
    }
    public void setCount(long count) {
        this.count = count;
    }
    public String getGenreid() {
        return genreid;
    }
    public void setGenreid(String genreid) {
        this.genreid = genreid;
    }
    public String getGenrename() {
        return genrename;
    }
    public void setGenrename(String genrename) {
        this.genrename = genrename;
    }
    public String getGenreurl() {
        return genreurl;
    }
    public void setGenreurl(String genreurl) {
        this.genreurl = genreurl;
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
        return "ApplyTGenreVO [rank=" + rank + ", count=" + count + ", genreid=" + genreid + ", genrename=" + genrename
                + ", genreurl=" + genreurl + ", teamid=" + teamid + ", teamname=" + teamname + "]";
    }
    
}
