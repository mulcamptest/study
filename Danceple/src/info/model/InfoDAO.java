package info.model;

import java.util.List;

import dandb.ApplyVO;
import dandb.DuescheckVO;
import dandb.GenreVO;
import dandb.GradeVO;
import dandb.ProjectVO;
import dandb.SeasonVO;
import dandb.TeamVO;
import dandb.UserVO;
import info.model.vo.ApplyTGenreVO;
import info.model.vo.ApplyUListVO;
import info.model.vo.TeamSummVO;
import info.model.vo.TeamUserListVO;

public interface InfoDAO {

	List<TeamVO> getTeamList() throws Exception;

	List<GenreVO> getGenreList() throws Exception;

	List<SeasonVO> getSeasonList() throws Exception;
	
	List<ProjectVO> getProjectList() throws Exception;
	
	List<DuescheckVO> getDuesCheckList() throws Exception;

	List<UserVO> getUserList() throws Exception;
	
	List<GradeVO> getGradeList() throws Exception;

	List<ApplyVO> getApplyList() throws Exception;

	TeamVO getTeamDetail(String teamId) throws Exception;

	GenreVO getGenreDetail(String genreId) throws Exception;

	GradeVO getGradeDetail(String gradeId) throws Exception;

	SeasonVO getSeasonDetail(long seasonId) throws Exception;
	
	ProjectVO getProjectDetail(long projectNo) throws Exception;

	

	ApplyUListVO getApplyUser(ApplyUListVO aulistVO) throws Exception; //1
    List<ApplyUListVO> getApplyUserList(String teamid) throws Exception; //2
    List<ApplyUListVO> getApplyTeamGender(String teamid) throws Exception; //3
    
    List<ApplyUListVO> getApplyTeamUserCount(String teamid) throws Exception; //4
    List<ApplyUListVO> getApplyAllTeamUserCount() throws Exception; //5
    
    List<ApplyTGenreVO> getApplyTeamGenre(String teamid) throws Exception; //6 
    List<ApplyTGenreVO> getApplyAllGenre() throws Exception; //7

    List<TeamSummVO> getTeamSummary(List<ApplyUListVO> auVO) throws Exception;

    List<TeamUserListVO> sortUserList(List<ApplyUListVO> applyUserList) throws Exception;



}
