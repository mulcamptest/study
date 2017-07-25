package info.model.vo;

public class GenderVO {
    private String genderid;
    private String genrename;
    
    
    public String getGenderid() {
        return genderid;
    }


    public void setGenderid(String genderid) {
        this.genderid = genderid;
    }


    public String getGenrename() {
        return genrename;
    }


    public void setGenrename(String genrename) {
        this.genrename = genrename;
    }


    @Override
    public String toString() {
        return "GenderVO [genderid=" + genderid + ", genrename=" + genrename + "]";
    }
    
}
