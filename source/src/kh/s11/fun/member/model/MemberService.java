package kh.s11.fun.member.model;

import static common.jdbc.JdbcTemplate.close;
import static common.jdbc.JdbcTemplate.commit;
import static common.jdbc.JdbcTemplate.getConnection;
import static common.jdbc.JdbcTemplate.rollback;

import java.sql.Connection;
import common.jdbc.JdbcTemplate;


public class MemberService {
	private MemberDao dao = new MemberDao();
	
	public MemberVo login(String id, String pwd) {
		 Connection con = getConnection();
		 MemberVo m = new MemberDao().login(con, id, pwd);
		 close(con);
		 return m;
		}

	public int dupIdChk(String id) {
		Connection con = getConnection();
		int result = new MemberDao().dupIdChk(con,id);
		return result;
	}
	
	public int insert(MemberVo vo) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.insert(conn, vo);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}

	public int update(MemberVo vo, String id) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.update(conn, vo, id);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}

	public int delete(String id) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.delete(conn, id);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);	
		return result;
	}
	
	
}
