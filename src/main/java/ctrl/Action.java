package ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action { //Action류 로직들을 강제하기 위해 생성
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception;
}
