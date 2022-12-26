package kh.s11.fun.project.model;

import java.sql.Connection;
import common.jdbc.JdbcTemplate;

public class FuturesService {
	private FuturesDao dao = new FuturesDao();
//	insert - 등록
	public int insert(FuturesVo vo) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.insert(conn, vo);
		JdbcTemplate.close(conn);
		return result;
	}
//	update - 수정
	public int update(FuturesVo vo, int fno) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.update(conn, vo, fno);
		JdbcTemplate.close(conn);
		return result;
	}
//	delete  - 삭제
	public int delete(int fno) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.delete(conn, fno);
		JdbcTemplate.close(conn);	
		return result;
	}

}
