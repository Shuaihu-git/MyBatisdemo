package shuaihu.vip.mbg.pojo;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    private String user;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.passwd
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    private String passwd;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user
     *
     * @return the value of user.user
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user
     *
     * @param user the value for user.user
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.passwd
     *
     * @return the value of user.passwd
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.passwd
     *
     * @param passwd the value for user.passwd
     *
     * @mbggenerated Tue Feb 14 17:37:40 CST 2023
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }
}