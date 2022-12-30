package kh.s11.fun.project.model;

import static common.jdbc.JdbcTemplate.close;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ProjectDao {
	public int insert(Connection conn, ProjectVo vo) {
		System.out.println(">>>project insert :" +vo);
		int result = 0;
		ResultSet rset = null;
//		INSERT INTO PROJECT VALUES(01,1,'A1','프로젝트 주제목','프로젝트부제목','프로젝트 요약 내용','태그',10000000,'2023/01/01','2023/01/31',31,'Y')
		String sql="INSERT INTO PROJECT (PNO,CNO,CATENO,PJTITLE,PJSTITLE,PJSUM,PJTAG,TGMONEY,SDAY,FDAY,TDAY,PERMISSION)"
				+ "VALUES((select nvl(max(pno),0)+1 from project),"
				+ "?,?,?,?,?,?,?,?,?,?,?);";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getCno());
			pstmt.setString(2, vo.getCateno() );
			pstmt.setString(3, vo.getPjtitle() );
			pstmt.setString(4, vo.getPjstitle());
			pstmt.setString(5, vo.getPjsum());
			pstmt.setString(6, vo.getPjtag());
			pstmt.setInt(7, vo.getTgmoney());
			pstmt.setDate(8, vo.getSday());
			pstmt.setDate(9, vo.getFday());
			pstmt.setInt(10, vo.getTday());
			pstmt.setString(11, vo.getPermission());
			rset = pstmt.executeQuery();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		System.out.println("프로젝트 정보 : "+ result);
		return result;
	}

	public int update(Connection conn, ProjectVo vo, int pno) {
		int result = 0;
		return result;
	}

	public int delete(Connection conn, int pno) {
		int result = 0;
		return result;
	}


}
