package kh.s11.kd.member.model;

import static common.jdbc.JdbcTemplate.close;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
			
			public MemberVo login(Connection con,String id, String pwd) {
				MemberVo m = null;
				PreparedStatement pstmt = null;
				ResultSet rset = null;
				String query = "SELECT*FROM TEST_MEMBER WHERE ID=? AND PWD=?";
				try {
					pstmt = con.prepareStatement(query);
					pstmt.setString(1, id);
					pstmt.setString(2, pwd);
					rset = pstmt.executeQuery();
					if(rset.next()) {
						m = new MemberVo();
						m.setId(rset.getString("ID"));
						m.setPwd(rset.getString("PWD"));
						m.setName(rset.getString("NAME"));
						m.setEmail(rset.getString("EMAIL"));
					}
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					close(rset);
					close(pstmt);
				}
				return m;
			
		}
			public int dupIdChk(Connection con, String id) {
				PreparedStatement pstmt = null;
				ResultSet rset = null;
				
				int result = 0;
				String query = "SELECT COUNT(*)FROM MEMBER  WHERE ID=?";
				try {
					pstmt = con.prepareStatement(query);
					pstmt.setString(1, id);
					rset = pstmt.executeQuery();
					if(rset.next()){
						result=rset.getInt(1);
					}
				}catch(SQLException e){
					e.printStackTrace();
				}finally {
					close(rset);
					close(pstmt);
				}
					return result;
			}
}
