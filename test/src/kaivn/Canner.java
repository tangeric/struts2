package kaivn;

import com.opensymphony.xwork2.ActionSupport;

public class Canner extends ActionSupport {

	public String add(){
		return "add";
	}
	public String update(){
		return "update";
	}
	@Override
	public String execute() throws Exception {
	
		System.out.println("gggggggg");
		return SUCCESS;
	}
 
	
}
