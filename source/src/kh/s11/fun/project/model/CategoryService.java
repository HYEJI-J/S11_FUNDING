package kh.s11.fun.project.model;

import java.sql.Connection;
import java.util.List;
import common.jdbc.JdbcTemplate;


public class CategoryService {
	private CategoryDao dao = new CategoryDao();
//	insert - 등록
	public int insert(CategoryVo vo) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.insert(conn, vo);
		JdbcTemplate.close(conn);
		return result;
	}
//	update - 수정
	public int update(CategoryVo vo, String cateno) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.update(conn, vo, cateno);
		JdbcTemplate.close(conn);
		return result;
	}
//	delete  - 삭제
	public int delete(String cateno) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.delete(conn, cateno);
		JdbcTemplate.close(conn);	
		return result;
	}
	public List<CategoryVo> selectList(){
		List<CategoryVo> volist = null;
		Connection conn = JdbcTemplate.getConnection();

		volist = dao.selectList(conn);
		
		JdbcTemplate.close(conn);
		return volist;
	}
//		selectOne
	public CategoryVo selectOne(String cateno){
		CategoryVo vo = null;
		Connection conn = JdbcTemplate.getConnection();

		vo = dao.selectOne(conn, cateno);
		
		JdbcTemplate.close(conn);
		return vo;
	}


}
