package ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardDAO;
import board.BoardVO;
import member.MemberDAO;
import member.MemberVO;

public class InsertAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardDAO bDAO=new BoardDAO();
		BoardVO bVO=new BoardVO();
		MemberDAO mDAO = new MemberDAO();
		MemberVO mVO = new MemberVO();
		if(mDAO.insert(mVO)){
			System.out.println("<script>alert('회원가입 완료!');opener.parent.location.reload();window.close();</script>");
		}
		else{
			System.out.println("<script>alert('회원가입 실패!');history.go(-1);</script>");
		}
		return null;
	}
	
}
