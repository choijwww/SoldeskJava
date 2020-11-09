
public class CheckValueBeforeCasting {

	public static int Numbering(int init) {
		int i = init;
		int output = 0;
		
		if(i<Byte.MIN_VALUE||i>Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환할 수 없습니다\n값을 다시 확인해주세요");			
		} else {
			byte b = (byte)i;
			System.out.println(b);
		}
		return output;
	}
	
	public static void main(String[]args) {
		Numbering(128);
	}
}
