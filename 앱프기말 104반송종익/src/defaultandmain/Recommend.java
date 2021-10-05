package defaultandmain;
import java.util.Scanner;


class Tem{
	int tempature;
	
	
	public Tem(int tem) {
		tempature = tem;
	}
	public String iceOrHot() {//switch 문이 안되므로 if문으로 처리
	
		if(tempature==1||tempature==2)
		{
			if(tempature==1)
				return "아이스";
			else 
				return "핫";
		}
		else return "오류발생, 재시작요망.";
		
	}
}

class Caffein{
	int caffeinfree;
	public Caffein(int caf) {
		caffeinfree = caf;
		
	
	}
	public String caffein() {
		if (caffeinfree==1||caffeinfree==2) {
			if(caffeinfree==1)
				return "디카페인";
			else
				return "";
		}
		else
			return"오류발생, 재시작요망.";
	}
}
class Cream {
	int cream;
	public Cream(int cr) {
	cream = cr;
	}
	public String howToCream() {
		if(cream==1||cream==2)
		{
			if(cream==1)
				return "휘핑 많은";
			else 
				return "";
		}
		else return "오류발생, 재시작요망.";
	}
}
class BitterAndMilk{
	int bitter;
	int milk;
	
	public BitterAndMilk(int bit, int milky) {
		bitter = bit;
		milk = milky;
	}
	public String menu() {
		
		if(bitter>0 && milk>0 && bitter <3 && milk <3) {
			if(bitter ==1) {
				return "아메리카노";
			}
			if  (bitter ==2) {
				if(milk==1)
					return "카페 라떼";
				if  (milk ==2)
					return "카라멜 마키아또";
				else 
					return "오류발생, 재시작요망.";
			}
			else return  "오류발생, 재시작요망.";
		}
		else return "오류발생, 재시작요망.";
		
	}
}
public class Recommend {//질문에 대한 정답이 정수나 불린이 아닐 경우에 대한 오류를 캐치문으로 작성해서 해결할 것.
	public static void main(String[] args) {
		System.out.println("커피음료를 추천해드립니다. 지금부터 나오는 질문에 대답해주세요. 예는 1, 아니오는 2입니다.");
		
		Scanner scanner = new Scanner(System.in);
		
		String[] questions = new String [5];//Boolean 타입은 배열 생성이 안됨.
		questions[0] ="차가운 음료를  좋아합니까?";
		questions[1] = "소화기가 안 좋거나, 10시간 이내에 숙면에 취해야 합니까?";
		questions[2] = "휘핑크림이 잔득 들어간 음료를 마시고 싶습니까?";
		questions[3] = "쓴 음료를 종아합니까?";
		questions[4] = "우유가 들어간 음료가 좋습니까?";
		
		
	
		int[] answer = new int[5];
		

		
		try {

			for(int i=0; i<questions.length; i++) {
				System.out.println(questions[i]);
				answer[i] = scanner.nextInt();
				}
			
			
		}
		catch (java.util.InputMismatchException e) {
			System.out.println("오류발생, 재시작요망.");
		}

		Tem iceice = new Tem(answer[0]);
		String ice = iceice.iceOrHot();
		
	
		Caffein noCaffein = new Caffein(answer[1]);
		String caff =noCaffein.caffein();
		
		Cream whipping  = new Cream(answer[2]); 
		String whip = whipping.howToCream();
		
		BitterAndMilk last = new BitterAndMilk(answer[3], answer[4]);
		String bitAndMilk =last.menu();
		
		
		
		System.out.println("오늘의 추천 메뉴는"+ " "+ whip+" "+ caff+" "+ice+ " "+bitAndMilk +"입니다");
		
			

	}
	
}
		
		
		
			
				
		
				
		
			
		
		
			
		
		
		
	

		
	
		
		
		
		
		
	
	


