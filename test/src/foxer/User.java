package foxer;

import java.util.List;

public class User {

	private String username;
	private String password;
	private List<User> book;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<User> getBook() {
		return book;
	}
	public void setBook(List<User> book) {
		this.book = book;
	}
	
}
