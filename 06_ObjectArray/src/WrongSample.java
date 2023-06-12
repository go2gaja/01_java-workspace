import com.kh.chap02_objectArray.model.vo.Phone;

public class WrongSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone [] arr = new Phone[3];//배열만 생성할 경우
		
		//==========================1번 문제의 조치 내용===================
		arr[0] = new Phone();
		arr[1] = new Phone();
		arr[2] = new Phone();
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i].getName());
		}
		/*
		for(int i=0; i<=arr.length;i++) { 
			System.out.println(arr[i].getName());
		}
		*/
		//잘못된 부분이 뭐냐
		//1 NunllPointerException : 객체 배열의 각 인덱스에 담긴 값이 null인 상태에서 메소드를 호출하려고 했기 때문에
		// 조치내용>> 객체배열을 만든 후 각 인덱스 별로 객체 생성을 진행해야됨
		//2 ArrayIndexOutOfBoundsException : 배열의 적절한 인덱스 범위를 벗어난 경우
		// 조건식으로 i<=배열의 길이 라고 제시돼있음. 배열의 마지막 인덱스보다 큰값이 제시
		// 조치내용>> 조건식 수정(i<배열의 길이)
		
	}
	

}
