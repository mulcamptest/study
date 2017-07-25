package info.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import info.model.InfoDAO;
import info.model.InfoDAOImpl;
import info.model.vo.SummVO;

public class SummaryList extends AbstractController {
    @Override
    public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        /*
         * 세션 체크해서 관리자 유저 구분하기 */
        
        /*HttpSession session = request.getSession();
        SummVO summVO = new SummVO();
        
        long gradeid = Long.parseLong((String) session.getAttribute("gradeId"));
        */
        ModelAndView mav = new ModelAndView();
        InfoDAO infoDAO = InfoDAOImpl.getInstance();
        //List<TeamVO> l_teamVO = new ArrayList<TeamVO>();
       
        try {
            
            List<SummVO> aulVO  = infoDAO.getSummaryDetail("000001");
            List<SummVO> allVO = infoDAO.getSummaryListAll();
         
            mav.setViewName("/WEB-INF/Info/SummaryList.jsp");
            mav.addObject("auList", aulVO);
            mav.addObject("Alllist", allVO);
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return mav;
        
        
    }
}
