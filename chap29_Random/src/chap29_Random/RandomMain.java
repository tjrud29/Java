package chap29_Random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 Random : 난수를 생성하기 위해 사용되는 클래스
 난수 : 무작위로 만들어진 수
 * */
public class RandomMain {
	public static void main(String[] args) {
		//로또 번호 생성기
		RandomMain lottoBot = new RandomMain();
		lottoBot.RandomExam();
		lottoBot.Lotto();
	}
	
	public void Lotto() {
		Random rd = new Random();
		//ArrayList 사용해서 장바구니로 담기
		List<Integer> lottoNum = new ArrayList<>();
		
		//중복 피하기 위해 set 사용 가능
		//6개의 숫자만 생성할 것
		int six = 6; // 로또 번호 몇 개 뽑을것인지 설정
		while(lottoNum.size() < 6) {
			//1~45 범위를 지정해서 난수 생성
			int ranNumber = rd.nextInt(45) + 1; //0~44자리의 랜덤으로 번호 하나
			System.out.println(ranNumber);
			//존재하는지 여부 중복x
			if(!lottoNum.contains(ranNumber)) {
			lottoNum.add(ranNumber);
			}
			
		}
		System.out.println("로또 번호 :" + lottoNum);
		
		
		
		
	}
	public void RandomExam() {
		
				Random rd = new Random();//랜덤 객체 생성
				
				//1. 정수 범위 내에서 랜덤인 난수를 만들어야 겠다
				int ranInt = rd.nextInt(100);//0~99 사이의 1개의 숫자
				System.out.println(ranInt);
				
				//2. 실수 범위 내에서 랜덤인 난수를 만들어야 겠다.
				double ranD = rd.nextDouble();
				System.out.println(ranD);
				
				//3. 불리언 값 랜덤으로 생성
				boolean ranB = rd.nextBoolean();
				System.out.println(ranB);
	}
}
