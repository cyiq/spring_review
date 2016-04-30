package cyiq.spring.jdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class PersonDaoImpl extends JdbcDaoSupport implements PersonDao{

	@Override
	public void savePerson() {
		this.getJdbcTemplate().execute("insert into person (id,name) values(1,'aaaaa') ");
	}
	
}
