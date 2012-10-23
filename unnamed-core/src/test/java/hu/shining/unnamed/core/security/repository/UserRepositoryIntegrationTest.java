package hu.shining.unnamed.core.security.repository;

import hu.shining.unnamed.core.security.model.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/spring/data-access-config-test.xml" })
public class UserRepositoryIntegrationTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void User_can_be_saved() {
		final User user = new User("admin", "mDSHbc+wXLFnpcJJU+uljErImxrfV/KPL50JrxB+6PA=");
		this.userRepository.save(user);
	}
}
