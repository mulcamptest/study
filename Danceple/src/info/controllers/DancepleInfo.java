package info.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import dandb.ApplyVO;
import dandb.UserVO;
import dandb.TeamVO;
import info.model.InfoDAO;
import info.model.InfoDAOImpl;

public class DancepleInfo extends AbstractController {
    @Override
    public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
        InfoDAO listDAO = InfoDAOImpl.getInstance();
        
        ModelAndView mav = new ModelAndView();
        try {
        	List<TeamVO> teamlist = listDAO.getTeamList();
        	
            List<ApplyVO> applist = listDAO.getApplyList();
            List<UserVO> userlist = listDAO.getUserList();
            
            mav.setViewName("/WEB-INF/menu/listinfopage.jsp");
            mav.addObject("teamList", teamlist);
            mav.addObject("userList", userlist);
            mav.addObject("appList", applist);

        } catch (Exception e) {
            e.printStackTrace();
            mav.setViewName("/WEB-INF/views/result.jsp");
            mav.addObject("msg", "게시물 리스트 출력에러\n관리자에게 문의하세요");
            mav.addObject("url", "test");
        }
        return mav;
    }
}
