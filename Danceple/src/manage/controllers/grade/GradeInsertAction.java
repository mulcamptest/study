package manage.controllers.grade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.GradeVO;
import manage.model.GradeManageDAO;
import manage.model.GradeManageDAOImpl;

public class GradeInsertAction extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {

		String gradeName = request.getParameter("gradeName");
		String gradeId = request.getParameter("gradeId");
		
		GradeVO gradeVO = new GradeVO();
		gradeVO.setGradeId(gradeId);
		gradeVO.setGradeName(gradeName);
		
		GradeManageDAO gradeManageDAO = GradeManageDAOImpl.getInstance();
		ModelAndView mav = new ModelAndView("/WEB-INF/views/result.jsp");
		
		try {
			gradeManageDAO .insertGrade(gradeVO);
			mav.addObject("msg", "등급 등록");
			mav.addObject("url", "menu#grade");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("msg", "등급 등록 실패");
			mav.addObject("url", "javascript:history.back();");
		}
		
		return mav;
		
		
	}
} //end class