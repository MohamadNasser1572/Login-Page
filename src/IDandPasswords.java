import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords() {
        logininfo.put("Mohammad Al Rezz", "3223");
        logininfo.put("Mohammad Zbib", "4567");
        logininfo.put("Mohammad Nasser", "1572");
        logininfo.put("Triple Ms", "MMM");
    }

    @SuppressWarnings("rawtypes")
    protected HashMap getLoginInfo() {
        return logininfo;
    }
}