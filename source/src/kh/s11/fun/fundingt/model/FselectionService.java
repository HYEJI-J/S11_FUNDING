package kh.s11.fun.fundingt.model;

import static common.jdbc.JdbcTemplate.close;
import static common.jdbc.JdbcTemplate.commit;
import static common.jdbc.JdbcTemplate.getConnection;
import static common.jdbc.JdbcTemplate.rollback;

import java.sql.Connection;


public class FselectionService {
	private FselectionDao dao = new FselectionDao();
	
	public int insert(FselectionVo vo) {
		Connection conn = getConnection();
		int result = 0;
		result = dao.insert(conn, vo);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}

	public int update(FselectionVo vo, int fno) {
		Connection conn = getConnection();
		int result = 0;
		result = dao.update(conn, vo, fno);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}

	public int delete(int fno) {
		Connection conn = getConnection();
		int result = 0;
		result = dao.delete(conn, fno);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);	
		return result;
	}

}
