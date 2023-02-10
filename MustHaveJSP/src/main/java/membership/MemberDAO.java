package membership;

import common.JDBConnect;

public class MemberDAO extends JDBConnect {
	// 명시한 데이터베이스의 연결이 완료된 memberDAO 객체를 생성한다.
	public MemberDAO(String drv, String url, String id, String pw) {
		super(drv, url, id, pw);
	}

	// 명시한 아이디/패스워드와 일치하는 회원 정보를 반환합니다.
	public MemberDTO getMemberDTO(String uid, String upass) {
		MemberDTO dto = new MemberDTO(); // 회원정보 DTO 객체 생성
		String query = "SELECT * FROM member WHERE id=? AND pass=?"; // 쿼리 템플릿

		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, uid);
			psmt.setString(2, upass);
			rs = psmt.executeQuery();

			// 결과처리
			if (rs.next()) {
				// 쿼리 결과로 엳은 회원 정보를 DTO 객체에 저장
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString(3));
				dto.setRegidate(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto; // DTO 객체 변환

	}

}
