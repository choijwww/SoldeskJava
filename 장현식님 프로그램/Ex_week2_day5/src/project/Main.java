package project;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//letsGoTravel;
		int destIndex;
		int transportIndex;
		int accomIndex;
		int cost = 0;
		int time = 0;
		int timeMin = 0;
		int[] tempArray = {0, 0, 0, 0};
		String destination;
		String[] accompany;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("솔데스크 여행사에 오신 것을 환영합니다.");
		System.out.println("출발 시각을 입력해 주세요. 년  ||  월  ||  일  ||  시간  ||  분");
		Date dDate = new Date(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		
		while(true) {
			System.out.println("몇 분이 같이 여행하시나요?");
			accomIndex = scanner.nextInt();
			
			System.out.println("본인의 성함과 여행에 동행하실 분들의 성함을 입력해 주세요.");
			accompany = new String[accomIndex];
			for(int i = 0 ; i < accomIndex ; ++i) {
				accompany[i] = scanner.next();
				System.out.println(accompany[i] + " 입력 확인");
			}
			
			System.out.println("\n\n목적지를 선택해 주세요.");
			System.out.println("1.부산 \t\t||\t2. 제주도\t\t||\t3.후쿠오카");
			destIndex = scanner.nextInt();
			System.out.println("--------------------------------------------------------------------------------------------------");
			if(destIndex == 1) {
				System.out.println("\n부산을 선택 하셨습니다.");
				destination = "부산";
				System.out.println("이동 수단을 선택해 주세요.");
				System.out.println("1.KTX \t\t||\t2.여객기 \t\t||\t3.고속 버스 \t\t||\t4. 자가용(정해진 목적지에서 합류하시면 됩니다.)");
				transportIndex = scanner.nextInt();
				if(transportIndex != 1 && transportIndex !=2 && transportIndex != 3 && transportIndex !=4) {
					System.out.println("다시 입력해 주세요.");
					continue;
				}
				switch(transportIndex) {
				case 1:{
					tempArray = trainTravel(scanner, cost, time, timeMin, accompany.length, destination);
					break;
				}
				case 2:{
					tempArray = airTravel(cost, time, timeMin, accompany.length, destination);
					break;
				}
				case 3:{
					tempArray = busTravel(scanner, cost, time, timeMin, accompany.length, destination);
					break;
				}
				case 4:{
					tempArray = carTravel(scanner, cost, time, timeMin, accompany.length, destination);
					if(tempArray[3]==0)
						continue;
					break;
					}
				}
				break;
			}else if(destIndex == 2) {
				System.out.println("\n제주도을 선택 하셨습니다.");
				destination = "제주도";
				System.out.println("이동 수단을 선택해 주세요.");
				System.out.println("1.여객기 \t\t||\t2. 선박");
				transportIndex = scanner.nextInt();
				if(transportIndex != 1 && transportIndex !=2) {
					System.out.println("다시 입력해 주세요.");
					continue;
				}
				switch(transportIndex) {
				case 1:{
					tempArray = airTravel(cost, time, timeMin, accompany.length, destination);
					break;
				}
				case 2:{
					System.out.println("\n배편을 선택하셨습니다.");
					System.out.println("부산에서 선박을 타고 목적지로 이동합니다.");
					System.out.println("서울에서 부산까지 버스를 이용하시겠습니까?");
					boolean choice = scanner.nextBoolean();
					if(choice) {
						tempArray = busTravel(scanner, cost, time, timeMin, accompany.length, "부산");
					}else {
						tempArray = carTravel(scanner, cost, time, timeMin, accompany.length, "부산");
						if(tempArray[3]==0)
							continue;
						}
					tempArray = waterTravel(tempArray, cost, time, timeMin, accompany.length, destination);
					break;
					}
				}break;
				
			}else if(destIndex == 3) {
				System.out.println("\n후쿠오카을 선택 하셨습니다.");
				destination = "후쿠오카";
				System.out.println("이동 수단을 선택해 주세요.");
				System.out.println("1.여객기 \t\t||\t2. 선박");
				transportIndex = scanner.nextInt();
				if(transportIndex !=1 && transportIndex !=2) {
					System.out.println("다시 입력해 주세요.");
					continue;
				}
				switch(transportIndex) {
				case 1:{
					tempArray = airTravel(cost, time, timeMin, accompany.length, destination);
					break;
				}
				case 2:{
					System.out.println("\n배편을 선택하셨습니다.");
					System.out.println("부산에서 선박을 타고 목적지로 이동합니다.");
					System.out.println("서울에서 부산까지 버스를 이용하시겠습니까?");
					boolean choice = scanner.nextBoolean();
					if(choice) {
						tempArray = busTravel(scanner, cost, time, timeMin, accompany.length, "부산" );
					}else {
						tempArray = carTravel(scanner, cost, time, timeMin, accompany.length, "부산");
						if(tempArray[3]==0)
							continue;
						}
					tempArray = waterTravel(tempArray, cost ,time, timeMin, accompany.length, destination);
					break;
					}
				}
				break;
			}else {
				System.out.println("다시 입력해 주세요.");
			}
		}
		time = tempArray[1];
		timeMin = tempArray[2];
		dDate.timePass(time, timeMin);
		System.out.printf("도착 예정 시각은 : %s\n", dDate);
		
		////////
	}

public static int[] carTravel(Scanner scanner, int cost,int  time, int timeMin,int  accompany, String destination) {
	TransportPersonalCar carToB = new TransportPersonalCar(destination,  accompany);
	System.out.println("자가용을 이용하실 때의 비용과 소요시간을 계산해 드리겠습니다.");
	System.out.println("차의 모델명을 입력하세요.");
	String carModel = scanner.next();
	System.out.println("차의 번호를 입력하세요.");
	String carNumber = scanner.next();
	
	carToB.inputCarStatus(carModel, carNumber);
	carToB.calculateHowFar();
	int[] tempArray = {0, 0, 0, 0 };
	
	if(carToB.calculateCost()) {
		cost = carToB.getCost();
		time = carToB.getTime();
		timeMin = carToB.getTimeMin();
		if(timeMin >= 60) {
			timeMin = timeMin - 60;
			++time;
		}
		tempArray[0] = cost;
		tempArray[1] = time;
		tempArray[2] = timeMin;
		tempArray[3] = 1;
		System.out.println(destination + "까지 걸리는 시간은 : " + time + "시간 " + timeMin + "분 입니다." + "비용은 : " + cost);
		return tempArray;
	}else {
		tempArray[3] = 0;
		return tempArray;
	}
}
public static int[] trainTravel(Scanner scanner, int cost, int time, int timeMin, int accompany, String destination) {
	TransportPublicTrain ktxToB = new TransportPublicTrain("기차", destination, accompany);
	int[] tempArray = {0, 0, 0, 0 };
	
	System.out.println("KTX인가요?");
	boolean pre = scanner.nextBoolean();

	ktxToB.setDestination("부산");
	ktxToB.calculateHowFar();
	ktxToB.calculateCostAndTime(pre);
	cost = ktxToB.getCost();
	time = ktxToB.getTime();
	timeMin = ktxToB.getTimeMin();
	if(timeMin >= 60) {
		timeMin = timeMin - 60;
		++time;
	}
	tempArray[0] = cost;
	tempArray[1] = time;
	tempArray[2] = timeMin;
	System.out.println("여행 비용은 총 " + cost + "원 되시겠습니다." + "\n걸리는 시간은 : " + time + "시간 " + timeMin + "분 입니다.");
	return tempArray;
}
public static int[] waterTravel(int[] tempArray, int cost, int time, int timeMin ,int accompany, String destination) {
	TransportPublicWater waterToB = new TransportPublicWater("상관없음" , destination , accompany);
	waterToB.calculateHowFar();
	waterToB.calculateTimeAndCost();
	
	cost = tempArray[0];
	time = tempArray[1];
	timeMin = tempArray[2];
	cost += waterToB.getCost();
	time += waterToB.getTime();
	timeMin += waterToB.getTimeMin();
	if(timeMin >= 60) {
		timeMin = timeMin - 60;
		++time;
	}
	tempArray[0] = cost;
	tempArray[1] = time;
	tempArray[2] = timeMin;
	System.out.println("여행 비용은 총 " + cost + "원 되시겠습니다." + "\n걸리는 시간은 : " + time + "시간 " + timeMin + "분 입니다.");
	return tempArray;
	
}
public static int[] busTravel(Scanner scanner, int cost, int time, int timeMin, int accompany, String destination) {
	TransportPublicBus busToB = new TransportPublicBus("RHD BX 212", destination, accompany);
	int[] tempArray = {0, 0, 0, 0 };
	System.out.println("우등인가요?");
	boolean pre = scanner.nextBoolean();
	
	busToB.ecoOrPre(pre);
	cost = busToB.getCost();
	busToB.calculateHowFar();
	time = busToB.getTime();
	timeMin = busToB.getTimeMin();
	if(timeMin >= 60) {
		timeMin = timeMin - 60;
		++time;
	}
	tempArray[0] = cost;
	tempArray[1] = time;
	tempArray[2] = timeMin;
	System.out.println(destination + "까지 여행 비용은 총 " + cost + "원 되시겠습니다." + "\n"+ destination + "까지 걸리는 시간은 : " + time + "시간 " + timeMin + "분 입니다.");
	return tempArray;
}
public static int[] airTravel(int cost, int time, int timeMin, int accompany, String destination) {
	int[] tempArray = {0, 0, 0, 0 };
	TransportPublicAir airToB = new TransportPublicAir("보잉 747", destination, accompany);
	
	airToB.calculateHowFar();
	airToB.calculateCostAndTime(3);
	cost = airToB.getCost();
	time = airToB.getTime();
	timeMin = airToB.getTimeMin();
	if(timeMin >= 60) {
		timeMin = timeMin - 60;
		++time;
	}
	tempArray[0] = cost;
	tempArray[1] = time;
	tempArray[2] = timeMin;
	System.out.println("여행 비용은 총 " + cost + "원 되시겠습니다." + "\n걸리는 시간은 : " + time + "시간 " + timeMin + "분 입니다.");
	return tempArray;
}
}

