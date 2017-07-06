package kaivn;

import foxer.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Login extends ActionSupport implements ModelDriven<User> {

	private User user=new User();
	
	public String login(){
		System.out.println(user.getUsername());
		System.out.println(user.getBook().get(0).getUsername());
		System.out.println(user.getBook().get(1).getPassword());
		return SUCCESS;
	}
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	
}
