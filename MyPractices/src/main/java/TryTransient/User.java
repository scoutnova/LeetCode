package TryTransient;

import java.io.Serializable;

/**
 * @author Scoutnova
 */
public class User implements Serializable{

    public static String username;
    private transient String passwd;

    public void setUsername(String username) { this.username = username;}

    public void setPasswd(String passwd) { this.passwd = passwd; }

    public String getUsername() { return username; }

    public String getPasswd() { return passwd; }

}
