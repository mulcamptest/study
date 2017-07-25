package info.model;

import java.util.List;

import dandb.ApplyVO;
import dandb.GenreVO;
import dandb.GradeVO;
import dandb.SeasonVO;
import dandb.TeacherVO;
import dandb.TeamVO;
import dandb.UserVO;
import info.model.vo.SummVO;

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
	
	List<SummVO> getSummaryDetail(String teamid) throws Exception;

    List<SummVO> getSummaryListAll() throws Exception;

}
