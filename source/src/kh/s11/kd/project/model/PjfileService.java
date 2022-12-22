package kh.s11.kd.project.model;

import static common.jdbc.JdbcTemplate.close;
import static common.jdbc.JdbcTemplate.commit;
import static common.jdbc.JdbcTemplate.getConnection;
import static common.jdbc.JdbcTemplate.rollback;

import java.sql.Connection;

public class PjfileService {
	
	
	public int insert(PjfileVo vo) {
		Connection con = getConnection();
		int result=0;
		result = new PjfileDao().insert(con,vo);
		if(result > 0) commit(con);
		else rollback(con);
		
		return result;
		
	}

	public int updateMember(PjfileVo vo) {
		Connection con = getConnection();
		int result=0;
		result = new PjfileDao().update(con,vo);
		
		if(result>0)commit(con);
		else rollback(con);
		close(con);
		
		return result;
	}

	public int delete(PjfileVo vo, int pno) {
		Connection con = getConnection();
		int result=0;
		result = new PjfileDao().delete(con, pno);
		
		if(result>0)commit(con);
		else rollback(con);
		close(con);
		
		return result;
	}


	
}
