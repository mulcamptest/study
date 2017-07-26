package info.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.controllers.AbstractController;
import basic.controllers.ModelAndView;
import info.model.InfoDAO;
import info.model.InfoDAOImpl;
import info.model.vo.ApplyTGenreVO;
import info.model.vo.ApplyUListVO;

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
        ApplyUListVO auV1 = new ApplyUListVO();
        List<ApplyUListVO> auV2 = new ArrayList<ApplyUListVO>();
        List<ApplyUListVO> auV3 = new ArrayList<ApplyUListVO>();
        List<ApplyUListVO> auV4 = new ArrayList<ApplyUListVO>();
        List<ApplyUListVO> auV5 = new ArrayList<ApplyUListVO>();
        
        List<ApplyTGenreVO> atV1 = new ArrayList<ApplyTGenreVO>();
        List<ApplyTGenreVO> atV2 = new ArrayList<ApplyTGenreVO>();
        
        /*
        ApplyUListVO getApplyUser(ApplyUListVO aulistVO) throws Exception; //1
        List<ApplyUListVO> getApplyUserList(String teamid) throws Exception; //2
        List<ApplyUListVO> getApplyTeamGender(String teamid) throws Exception; //3
        
        List<ApplyUListVO> getApplyTeamUserCount(String teamid) throws Exception; //4
        List<ApplyUListVO> getApplyAllTeamUserCount() throws Exception; //5
        
        List<ApplyTGenreVO> getApplyTeamGenre(String teamid) throws Exception; //6 
        List<ApplyTGenreVO> getApplyAllGenre() throws Exception; //7
         */ 
        ApplyUListVO aulistVO = new ApplyUListVO();
        aulistVO.setUsername("Tester8");
        aulistVO.setTeamid("000001");
        try {
            
            auV1 = infoDAO.getApplyUser(aulistVO);
            auV2 = infoDAO.getApplyUserList(aulistVO.getTeamid());
            auV3 = infoDAO.getApplyTeamGender(aulistVO.getTeamid());
            
            auV4 = infoDAO.getApplyTeamUserCount(aulistVO.getTeamid());
            auV5 = infoDAO.getApplyAllTeamUserCount();
            
            atV1 = infoDAO.getApplyTeamGenre(aulistVO.getTeamid());
            atV2 = infoDAO.getApplyAllGenre();
            
            System.out.println(auV1);
            System.out.println(auV2);
            System.out.println(auV3);
            System.out.println(auV4);
            System.out.println(auV5);
            System.out.println(atV1);
            System.out.println(atV2);
            
            mav.setViewName("/WEB-INF/Info/SummaryList.jsp");
            mav.addObject("auV1", auV1);
            mav.addObject("auV2", auV2);
            mav.addObject("auV3", auV3);
            mav.addObject("auV4", auV4);
            mav.addObject("auV5", auV5);

            mav.addObject("atV1", atV1);
            mav.addObject("atV2", atV2);
            mav.addObject("msg", "테스트중 입니다.");
         /*   List<SummVO> aulVO  = infoDAO.getSummaryDetail("000001");
            List<SummVO> allVO = infoDAO.getSummaryListAll();
         
            mav.setViewName("/WEB-INF/Info/SummaryList.jsp");
            mav.addObject("auList", aulVO);
            mav.addObject("Alllist", allVO);*/
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return mav;
        
        
    }
}
