package manage.controllers.team;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;

public class TeamInsert extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		return new ModelAndView("/WEB-INF/manage/team/TeamInsert.jsp");
	}

}
