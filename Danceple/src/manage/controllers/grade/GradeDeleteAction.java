package manage.controllers.grade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.GradeVO;
import manage.model.GradeManageDAO;
import manage.model.GradeManageDAOImpl;

public class GradeDeleteAction extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {

		String gradeId = request.getParameter("gradeId");
		
		
		GradeManageDAO gradeManageDAO = GradeManageDAOImpl.getInstance();
		ModelAndView mav = new ModelAndView("/WEB-INF/views/result.jsp");
		
		try {
			gradeManageDAO .deleteGrade(gradeId);
			mav.addObject("msg", "등급 삭제 성공");
			mav.addObject("url", "menu#grade");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("msg", "등급 삭제 실패");
			mav.addObject("url", "javascript:history.back();");
		}
		
		return mav;
	}
} //end class