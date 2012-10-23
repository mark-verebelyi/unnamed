package hu.shining.unnamed.core.security.model;

import hu.shining.unnamed.core.base.model.BaseEntity;

import org.springframework.data.annotation.PersistenceConstructor;

public class User extends BaseEntity {

	private final String username;
	private final String password;

	@PersistenceConstructor
	public User(final String username, final String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}

	@Override
	public String toString() {
		return "User [username=" + this.username + ", password=*****]";
	}

}
