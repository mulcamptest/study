package manage.model;

import dandb.TeamVO;

public interface TeamManageDAO {

	void insertTeam(TeamVO teamVO) throws Exception;
	void deleteTeam(String teamVO) throws Exception;
	void updateTeam(TeamVO teamVO)throws Exception;

}
