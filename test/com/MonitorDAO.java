package test.com;

/**
 * @program:MyIdeaTest
 * @description:模拟监视器
 * @author:JasonYu
 * @date:2019-08-31 21-05
 **/
public class MonitorDAO {
    private String driver;
    private String url;
    private String username;
    private String password;

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MonitorDAO(){
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/fan";
        username = "root";
        password = "123456";
    }

    public static void main(String[] args) {
        MonitorDAO md = new MonitorDAO();
        System.out.println(md.driver+" "+md.url+" "+md.username+" "+md.password);
    }
}
