package info.model;

import java.util.List;

import dandb.ApplyVO;
import dandb.GenreVO;
import dandb.GradeVO;
import dandb.SeasonVO;
import dandb.TeacherVO;
import dandb.TeamVO;
import dandb.UserVO;
import info.model.vo.ApplyTGenreVO;
import info.model.vo.ApplyUListVO;

public interface InfoDAO {

	List<TeamVO> getTeamList() throws Exception;

	List<GenreVO> getGenreList() throws Exception;

	List<SeasonVO> getSeasonList() throws Exception;

	List<UserVO> getUserList() throws Exception;

	List<ApplyVO> getApplyList() throws Exception;

	List<TeacherVO> getTeacherList() throws Exception;

	List<GradeVO> getGradeList() throws Exception;

	TeamVO getTeamDetail(String teamId) throws Exception;

	GenreVO getGenreDetail(String genreId) throws Exception;

	GradeVO getGradeDetail(String gradeId) throws Exception;
	

    ApplyUListVO getApplyUser(ApplyUListVO aulistVO) throws Exception; //1
    List<ApplyUListVO> getApplyUserList(String teamid) throws Exception; //2
    List<ApplyUListVO> getApplyTeamGender(String teamid) throws Exception; //3
    
    List<ApplyUListVO> getApplyTeamUserCount(String teamid) throws Exception; //4
    List<ApplyUListVO> getApplyAllTeamUserCount() throws Exception; //5
    
    List<ApplyTGenreVO> getApplyTeamGenre(String teamid) throws Exception; //6 
    List<ApplyTGenreVO> getApplyAllGenre() throws Exception; //7

}
