package pairmatching;
import camp.nextstep.edu.missionutils.Console;

public class Input {
	public static String skillSelect() {
		System.out.println("기능을 선택하세요.");
		System.out.println("1. 페어 매칭");
		System.out.println("2. 페어 조회");
		System.out.println("3. 페어 초기화");
		System.out.println("Q. 종료");
		String selcetNumber= Console.readLine();
		return selcetNumber;
	}
	public static String pairMatching() {
		System.out.println("과정, 레벨, 미션을 선택하세요.");
		System.out.println("ex) 백엔드, 레벨1, 자동차경주");
		String selcetThreeThings= Console.readLine();
		return selcetThreeThings;
				
	}
	
}
