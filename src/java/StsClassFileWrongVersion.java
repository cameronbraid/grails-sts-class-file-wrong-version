import javax.servlet.http.HttpServletRequest;


public class StsClassFileWrongVersion {

    public static String useRequest(HttpServletRequest request) {
        return request.getParameter("dummy");
    }

}
