package defaultandmain;
import java.util.Scanner;


class Tem{
	int tempature;
	
	
	public Tem(int tem) {
		tempature = tem;
	}
	public String iceOrHot() {//switch ���� �ȵǹǷ� if������ ó��
	
		if(tempature==1||tempature==2)
		{
			if(tempature==1)
				return "���̽�";
			else 
				return "��";
		}
		else return "�����߻�, ����ۿ��.";
		
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
				return "��ī����";
			else
				return "";
		}
		else
			return"�����߻�, ����ۿ��.";
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
				return "���� ����";
			else 
				return "";
		}
		else return "�����߻�, ����ۿ��.";
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
				return "�Ƹ޸�ī��";
			}
			if  (bitter ==2) {
				if(milk==1)
					return "ī�� ��";
				if  (milk ==2)
					return "ī��� ��Ű�ƶ�";
				else 
					return "�����߻�, ����ۿ��.";
			}
			else return  "�����߻�, ����ۿ��.";
		}
		else return "�����߻�, ����ۿ��.";
		
	}
}
public class Recommend {//������ ���� ������ ������ �Ҹ��� �ƴ� ��쿡 ���� ������ ĳġ������ �ۼ��ؼ� �ذ��� ��.
	public static void main(String[] args) {
		System.out.println("Ŀ�����Ḧ ��õ�ص帳�ϴ�. ���ݺ��� ������ ������ ������ּ���. ���� 1, �ƴϿ��� 2�Դϴ�.");
		
		Scanner scanner = new Scanner(System.in);
		
		String[] questions = new String [5];//Boolean Ÿ���� �迭 ������ �ȵ�.
		questions[0] ="������ ���Ḧ  �����մϱ�?";
		questions[1] = "��ȭ�Ⱑ �� ���ų�, 10�ð� �̳��� ���鿡 ���ؾ� �մϱ�?";
		questions[2] = "����ũ���� �ܵ� �� ���Ḧ ���ð� �ͽ��ϱ�?";
		questions[3] = "�� ���Ḧ �����մϱ�?";
		questions[4] = "������ �� ���ᰡ �����ϱ�?";
		
		
	
		int[] answer = new int[5];
		

		
		try {

			for(int i=0; i<questions.length; i++) {
				System.out.println(questions[i]);
				answer[i] = scanner.nextInt();
				}
			
			
		}
		catch (java.util.InputMismatchException e) {
			System.out.println("�����߻�, ����ۿ��.");
		}

		Tem iceice = new Tem(answer[0]);
		String ice = iceice.iceOrHot();
		
	
		Caffein noCaffein = new Caffein(answer[1]);
		String caff =noCaffein.caffein();
		
		Cream whipping  = new Cream(answer[2]); 
		String whip = whipping.howToCream();
		
		BitterAndMilk last = new BitterAndMilk(answer[3], answer[4]);
		String bitAndMilk =last.menu();
		
		
		
		System.out.println("������ ��õ �޴���"+ " "+ whip+" "+ caff+" "+ice+ " "+bitAndMilk +"�Դϴ�");
		
			

	}
	
}
		
		
		
			
				
		
				
		
			
		
		
			
		
		
		
	

		
	
		
		
		
		
		
	
	


