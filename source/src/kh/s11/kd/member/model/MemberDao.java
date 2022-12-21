package kh.s11.kd.member.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import common.jdbc.JdbcTemplate;

public class MemberDao {
		
		// insert
			public int insert(Connection conn, MemberVo vo) {
				int result = 0;
				return result;
			}
		// update
			public int update(Connection conn, MemberVo vo, String id) {
				int result = 0;
				return result;
			}
		// delete
			public int delete(Connection conn, String id) {
				int result = 0;
				return result;
			}
			
			public MemberVo login(Connection conn, String mid, String mpwd){
				MemberVo vo = null;
				String query = "select id,name,email,address,phonenum from member where id=? and pwd=?";
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, mid);
					pstmt.setString(2, mpwd);
					rs = pstmt.executeQuery();
					if(rs.next()) {
						vo = new MemberVo();
						vo.setId(rs.getString("id"));
						vo.setName(rs.getString("name"));
					}
				}catch (Exception e) {
					e.printStackTrace();
				}finally {
					JdbcTemplate.close(rs);
					JdbcTemplate.close(pstmt);
				}
				
				
				return vo;

			}
}
