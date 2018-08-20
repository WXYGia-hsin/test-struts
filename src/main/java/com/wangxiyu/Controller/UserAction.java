package com.wangxiyu.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wangxiyu.model.UserModel;
import org.apache.struts2.ServletActionContext;

/**
 * Created by Administrator on 2018/5/4 0004.
 */
public class UserAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private String userName;
    private String password;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String login() {
        UserModel model = new UserModel();
        if(model.login(this.userName, this.password)) {
//            ActionContext ctx = ActionContext.getContext();
//            ctx.put("userName", this.userName);
            ServletActionContext.getRequest().setAttribute("username",this.userName);
            return SUCCESS;
        }else {
            return ERROR;
        }
    }
}

