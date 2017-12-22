package project.v2;

import java.util.ArrayList;
import java.util.List;

import project.v1.SungJukV0;

public class SungJukServiceImpl implements SungJukService {

	// 성적데이터를 저장하기 위해 ArrayList 객체 사용
	private List<SungJukV0> sjdb;
	
	public SungJukServiceImpl() {
		sjdb = new ArrayList<>();
	}
	
	@Override
	public void addSungJuk(SungJukV0 sj) {
		processSungJuk(sj); // 성적처리 - 총점, 평균, 학점
		sjdb.add(sj);
	}

	@Override
	public String getSungJuk() {
		StringBuffer sb = new StringBuffer();
		String fmt = "%s %d %d %d \n";
		for(SungJukV0 sj : sjdb) {
			sb.append(String.format(fmt, sj.getName(), sj.getKor(),sj.getEng(), sj.getMat()));
		}
		return sb.toString();
	}

	@Override
	public String getSungJuk(int no) {
		System.out.printf("%s 성적이 조회 되었습니다 \n", no);
		return "";
	}

	@Override
	public String modifySungJuk(SungJukV0 sj, int no) {
		System.out.printf("%s 성적 데이터가 수정 되었습니다 \n", sj.getName());
		return null;
	}

	@Override
	public String removeSungJuk(int no) {
		System.out.printf("%s 성적 데이터가 삭제 되었습니다 \n", no);
		return null;
	}
	
	private void processSungJuk(SungJukV0 sj) {
		int tot = sj.getKor() + sj.getEng() + sj.getMat();
		double avg = (double)tot / 3;
		String grd = "가";
		
		switch((int)avg/10) {
		case 10:
		case 9: grd = "수"; break;
		case 8: grd = "우"; break;
		case 7: grd = "미"; break;
		case 6: grd = "양"; break;
		}
		
		sj.setTot(tot);
		sj.setAvrg(avg);
		sj.setGrd(grd);
		
	}

}
