package kh.s11.kd.member.model;

import java.sql.Connection;
import common.jdbc.JdbcTemplate;

public class MemberService {
	private MemberDao dao = new MemberDao();
	// insert
				public int insert( MemberVo vo) {
					int result = 0;
			Connection conn = JdbcTemplate.getConnection();
					result = dao.insert(conn, vo);
			JdbcTemplate.close(conn);
					return result;
				}
			// update - 수정
				public int update(MemberVo vo, String mid/*주로 PK*/) {
					int result = 0;
			Connection conn = JdbcTemplate.getConnection();
					result = dao.update(conn, vo, mid);
			JdbcTemplate.close(conn);
					return result;
				}
			// delete - 삭제
				public int delete(String mid/*주로 PK*/) {
					int result = 0;
			Connection conn = JdbcTemplate.getConnection();
					result = dao.delete(conn, mid);
			JdbcTemplate.close(conn);	
					return result;
				}

}
