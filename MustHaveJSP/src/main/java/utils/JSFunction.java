package utils;

import javax.servlet.jsp.JspWriter;

public class JSFunction {
// 메시지 알림창을 띄우 후 명시한 URL 로 이동함
	public static void alertLocation(String msg, String url, JspWriter out) {
		try {
			String script = ""
					+"<scropt>"
					+"alert('"+msg+"');"
							+ "+location.href='"+url+"'; "
							+"</script>";
			out.println(script);
		}
		catch(Exception e) {}
			
		}

	public static void alertBack(String msg, JspWriter out) {
		try {
			String script = ""
					+"<script>"
					+"alert('"+msg+"');"
					+" history.back();"
					+"</script>";
			out.println(script);
		}
		catch(Exception e) {}
	}
}