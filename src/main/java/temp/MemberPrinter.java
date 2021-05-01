package temp;

import com.libraryManage.Member;

public class MemberPrinter {

	public void print(Member member) {
		System.out.printf("회원 정보: 이메일=%s, 이름=%s, 등록일=%tF\n", member.getMemEmail(),
				member.getMemName(), member.getRegisterDate());
	}

}
