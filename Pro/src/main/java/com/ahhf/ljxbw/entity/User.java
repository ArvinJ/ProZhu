package com.ahhf.ljxbw.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Entity;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * @ClassName: User
 * @Description: TODO(User)
 * @author Arvin 庐江小霸王
 * @e-mail 15156980156@163.com
 * @date 2017年7月13日 下午10:36:03
 *
 */
@Entity
@Table(name = "t_user")
public class User {
	private int id;
	private String username;
	private String password;
	private String email;
	private int status;

	public User() {
		super();
	}

	public User(String username, String password, String email, int status) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.status = status;
	}

	@GeneratedValue
	@Id 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@NotEmpty(message = "用户名不能为空")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Size(min = 1, max = 10, message = "密码的长度应该在1和10之间")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@NotEmpty(message = "邮箱不能为空")
	@Email(message = "邮箱格式不正确")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", status=" + status
				+ "]";
	}

}
