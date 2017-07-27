package info.model;

import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import dandb.ApplyVO;
import dandb.DuescheckVO;
import dandb.GenreVO;
import dandb.GradeVO;
import dandb.ProjectVO;
import dandb.SeasonVO;
import dandb.TeamVO;
import dandb.UserVO;
import ibatis.QueryHandler;
import info.model.vo.ApplyTGenreVO;
import info.model.vo.ApplyUListVO;
import info.model.vo.TeamSummVO;
import info.model.vo.TeamUserListVO;

public class InfoDAOImpl implements InfoDAO{

	private static InfoDAOImpl infoDAO = null;
	
	public static InfoDAOImpl getInstance() {
		
		if (infoDAO == null) {
			infoDAO = new InfoDAOImpl();
		}
		
		return infoDAO;
	} //end getInstance()
	
	
	@Override
	public List<TeamVO> getTeamList() throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return sqlMap.queryForList("info.getTeamList");
	} //end getTeamList
	
	@Override
	public TeamVO getTeamDetail(String teamId) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return (TeamVO) sqlMap.queryForObject("info.getTeamDetail", teamId);
	}
	
	@Override
	public List<GenreVO> getGenreList() throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return sqlMap.queryForList("info.getGenreList");
	} //end getGenreList
	
	@Override
	public GenreVO getGenreDetail(String genreId) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return (GenreVO) sqlMap.queryForObject("info.getGenreDetail", genreId);
	}
	
	@Override
	public List<SeasonVO> getSeasonList() throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return sqlMap.queryForList("info.getSeasonList");
	}
	
	@Override
	public SeasonVO getSeasonDetail(long seasonId) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return (SeasonVO) sqlMap.queryForObject("info.getSeasonDetail", seasonId);
	}
	
	@Override
	public List<ProjectVO> getProjectList() throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return sqlMap.queryForList("info.getProjectList");
	}
	
	@Override
	public ProjectVO getProjectDetail(long projectNo) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return (ProjectVO) sqlMap.queryForObject("info.getProjectDetail", projectNo);
	}
	
	@Override
	public List<DuescheckVO> getDuesCheckList() throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return sqlMap.queryForList("info.getDuesCheckList");
	}
	
	
	@Override
	public List<ApplyVO> getApplyList() throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return sqlMap.queryForList("info.getApplyList");
	}
	@Override
	public List<UserVO> getUserList() throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return sqlMap.queryForList("info.getUserList");
	}
	
	@Override
	public List<GradeVO> getGradeList() throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return sqlMap.queryForList("info.getGradeList");
	}
	
	@Override
	public GradeVO getGradeDetail(String gradeId) throws Exception {
		SqlMapClient sqlMap = QueryHandler.getInstance();
		return (GradeVO) sqlMap.queryForObject("info.getGradeDetail", gradeId);
	}	
	//1
    @Override
    public ApplyUListVO getApplyUser(ApplyUListVO aulistVO) throws Exception {
        SqlMapClient sqlMap = QueryHandler.getInstance();
        return (ApplyUListVO)sqlMap.queryForObject("info.getApplyUser", aulistVO) ;
    }   
    //2
    @Override
    public List<ApplyUListVO> getApplyUserList(String teamid) throws Exception {
        SqlMapClient sqlMap = QueryHandler.getInstance();
        return sqlMap.queryForList("info.getApplyUserList", teamid);
    }
    //3
    @Override
    public List<ApplyUListVO> getApplyTeamGender(String teamid) throws Exception {
        SqlMapClient sqlMap = QueryHandler.getInstance();
        return sqlMap.queryForList("info.getApplyTeamGender",teamid);
    }
    
    //4
    @Override
    public List<ApplyUListVO> getApplyTeamUserCount(String teamid) throws Exception {
        SqlMapClient sqlMap = QueryHandler.getInstance();
        return sqlMap.queryForList("info.getApplyTeamUserCount", teamid);
    }
    //5
    @Override
    public List<ApplyUListVO> getApplyAllTeamUserCount() throws Exception {
        SqlMapClient sqlMap = QueryHandler.getInstance();
        return sqlMap.queryForList("info.getApplyAllTeamUserCount");
    }
    
    //6
    @Override
    public List<ApplyTGenreVO> getApplyTeamGenre(String teamid) throws Exception {
        SqlMapClient sqlMap = QueryHandler.getInstance();
        return sqlMap.queryForList("info.getApplyTeamGenre", teamid);
    }
    //7
    @Override
    public List<ApplyTGenreVO> getApplyAllGenre() throws Exception {
        SqlMapClient sqlMap = QueryHandler.getInstance();
        return sqlMap.queryForList("info.getApplyAllGenre");
	}	
    
    @Override
    public List<TeamSummVO> getTeamSummary(List<ApplyUListVO> auVO) throws Exception {
        
        TeamSummVO tsVO = new TeamSummVO();
        List<TeamSummVO> rts = new ArrayList<TeamSummVO>();
        
        for(ApplyUListVO ul : auVO){
            
            if (ul.getTeamname() == null && ul.getTeamid() != null) {
                TeamSummVO save = new TeamSummVO();
                save.setTeamname(tsVO.getTeamname());
                save.setTeamid(tsVO.getTeamid());
                save.setOldman(tsVO.getOldman());
                save.setOldwoman(tsVO.getOldwoman());
                save.setNewman(tsVO.getNewman());
                save.setNewwoman(tsVO.getNewwoman());
                save.setTotal(tsVO.getTotal());
//                System.out.println(save);
                rts.add(save);
                tsVO = new TeamSummVO();
            }

            if (ul.getTeamname() != null && ul.getGradeid() == null){
                tsVO.setTeamname(ul.getTeamname());
                tsVO.setTeamid(ul.getTeamid());
                tsVO.setTotal(ul.getCount());
            }
            
            try{
                if(ul.getGradeid().equals("2")){//기존
                    if(ul.getGender().equals("man")){
                        tsVO.setOldman(ul.getCount());
                    }else if(ul.getGender().equals("woman")){
                        tsVO.setOldwoman(ul.getCount());
                    }
                }else if(ul.getGradeid()==null){
                    
                }else{ // 신규, 복귀
                    if(ul.getGender().equals("man")){
                        tsVO.setNewman(ul.getCount());
                    }else if(ul.getGender().equals("woman")){
                        tsVO.setNewwoman(ul.getCount());
                    }
                }
            }catch(Exception e){                
            }
        }
        
        return rts;
    }
    
    @Override
    public List<TeamUserListVO> sortUserList(List<ApplyUListVO> aul) throws Exception {
        
        List<TeamUserListVO> compsort = new ArrayList<TeamUserListVO>();
        TeamUserListVO temp = new TeamUserListVO();
        int idx = 0, gradeid = 1, rank = 1;
        ApplyUListVO ul=  new ApplyUListVO();
//        System.out.println(aul);
        
        while(aul.isEmpty() != true){
            if (idx >= aul.size()){
                idx=0;
            }
            
            ul = aul.get(idx);
//            System.out.println("[I:" + idx+ "/S:" + aul.size() +"]"+ul);
            
            if(ul.getRank() == rank && Integer.parseInt(ul.getGradeid()) == gradeid)
            {
                if(ul.getGender().equals("man")){
                    if (temp.getManrank() == 0) {
                        temp.setGradeid(ul.getGradeid());
                        temp.setManname(ul.getUsername());
                        temp.setManrank(ul.getRank());
                        aul.remove(idx);
                        if(aul.isEmpty() == true){
//                            System.out.println("Add & Finish!!!");
                            compsort.add(temp);
                        }
                    }else{
                        idx++;
                    }
                   
                    continue;
                }else if (ul.getGender().equals("woman")){
                    if(temp.getWomrank() == 0){
                        temp.setGradeid(ul.getGradeid());
                        temp.setWomname(ul.getUsername());
                        temp.setWomrank(ul.getRank());
                        aul.remove(idx);
//                        System.out.println("Add!! w");
                        compsort.add(temp);
                        temp = new TeamUserListVO();
                        temp.setManrank(0);
                        temp.setWomrank(0);
                        rank++;
                        idx=0;
                    }else{
                        idx++;
                    }
                    continue;
                }
            }/*else if(ul.getRank() != rank && Integer.parseInt(ul.getGradeid()) == gradeid)
            {
                System.out.println("Add!! r");
                compsort.add(temp);
                temp = new TeamUserListVO();
                temp.setManrank(0);
                temp.setWomrank(0);
                rank++;
                idx=0;
                continue;
            }*/
            
            if(Integer.parseInt(ul.getGradeid()) != gradeid){
                if(temp.getManrank() != 0 || temp.getWomrank() != 0){
//                    System.out.println("Add!! e");
                    compsort.add(temp);
                    temp = new TeamUserListVO();
                    temp.setManrank(0);
                    temp.setWomrank(0);
                    rank++;
                    idx=0;
                }
                else if(idx == 0){
                    gradeid++;
                    rank=1;
                }
                continue;
            }
            idx++;
        }
//        System.out.println("C : " + compsort);
        return compsort;
    }
} //end class
