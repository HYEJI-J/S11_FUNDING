package kh.s11.fun.project.model;

import java.sql.Connection;
import common.jdbc.JdbcTemplate;

public class ProjectService {
	private ProjectDao dao = new ProjectDao();
//	insert - 등록
	public int insert(ProjectVo vo) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.insert(conn, vo);
		JdbcTemplate.close(conn);
		return result;
	}
//	update - 수정
	public int update(ProjectVo vo, int pno ) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.update(conn, vo, pno);
		JdbcTemplate.close(conn);
		return result;
	}
//	delete  - 삭제
	public int delete(int pno) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.delete(conn, pno);
		JdbcTemplate.close(conn);	
		return result;
	}
	
	

}
