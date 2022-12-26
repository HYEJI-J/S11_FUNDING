package kh.s11.fun.member.model;

import java.sql.Connection;

import common.jdbc.JdbcTemplate;

public class CreatorService {
	private CreatorDao dao = new CreatorDao();
//	insert - 등록
	public int insert(CreatorVo vo) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.insert(conn, vo);
		JdbcTemplate.close(conn);
		return result;
	}
//	update - 수정
	public int update(CreatorVo vo, int cno ) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.update(conn, vo, cno);
		JdbcTemplate.close(conn);
		return result;
	}
//	delete  - 삭제
	public int delete(int cno) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.delete(conn, cno);
		JdbcTemplate.close(conn);	
		return result;
	}
}
