package kh.s11.fun.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kh.s11.fun.member.model.MemberService;
import kh.s11.fun.member.model.MemberVo;

/**
 * Servlet implementation class LoginDoController
 */
@WebServlet("/login.do")
public class LoginDoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDoController() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		MemberService service = new MemberService();
		MemberVo m = service.login(id, pwd);
		if(m !=null) {
			HttpSession session = request.getSession();
			session.setAttribute("member", m);
			response.sendRedirect(request.getContextPath()+"/main");
		}else {
			response.sendRedirect(request.getContextPath()+"/login");
			System.out.println("로그인 실패");
		}

	}
}
