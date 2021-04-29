package temp;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.libraryManage.Member;
import com.libraryManage.MemberDAO;

public class MemberInfoPrinter {

	@Autowired
	private MemberDAO memDao;
	private MemberPrinter printer;

	public void setMemberDAO(MemberDAO memberDao) {
		this.memDao = memberDao;
	}

	@Autowired
	// @Qualifier("sysout")
	public void setPrinter(MemberPrinter printer) {
		System.out.println("setPrinter: " + printer);
		this.printer = printer;
	}

	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);

		if (member == null) {
			System.out.println("데이터 없음\n");
			return;
		}

		printer.print(member);
		System.out.println();
	}
}
