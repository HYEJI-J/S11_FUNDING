package kh.s11.kd.project.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.jdbc.JdbcTemplate;


public class CategoryDao {
	public int insert(Connection conn, CategoryVo vo) {
		int result = 0;
		return result;
	}
	public int update(Connection conn, CategoryVo vo, String cateno) {
		int result = 0;
		return result;
	}
	public int delete(Connection conn, String cateno) {
		int result = 0;
		return result;
	}
	//selectList
	public List<CategoryVo> selectList(Connection conn){
		List<CategoryVo> volist = null;
		String sql = "select * from category";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			//TODO:
			if(rs.next()) {
				volist = new ArrayList<CategoryVo>();
				do {
					CategoryVo vo = new CategoryVo();
					vo = new CategoryVo();
					
					
					vo.setCateno(rs.getString("cateno"));
					vo.setCatename(rs.getString("catename"));
					vo.setDetailcate(rs.getString("detailcate"));
					volist.add(vo);
				}while(rs.next());
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return volist; 
	}
	//selectOne
	public CategoryVo selectOne(Connection conn, String cateno) {
		return null;
	}

}
