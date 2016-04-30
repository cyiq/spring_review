package cyiq.spring.jdbc.transaction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class PersonDaoImpl extends JdbcDaoSupport implements PersonDao{

	@Override
	public void savePerson() {
		// TODO Auto-generated method stub
		this.getJdbcTemplate().execute("insert into person(name) values('aa')");
		int a = 1/0;
		this.getJdbcTemplate().execute("insert into person(name) values('aa')");
	}

}
