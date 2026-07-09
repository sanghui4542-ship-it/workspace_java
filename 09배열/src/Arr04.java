
public class Arr04 {

	public static void main(String[] args) {
		/*
		 	예제. 2차원 배열에 초깃값을 저장하면서 배열 생성 후
		  	 	행 단위와 열 단위의 데이터들의 합을 구하는 프로그램
		  	 
		 	2차원 배열 생성 방법 2
		 		의미 : 초깃값을 칸에 저장하는 동시에 2차원 배열 메모리 생성 방법
		 		
		 							 0열  1열
		 		자료형[][]  변수명 = {   
		 							{값1, 값4},     0 index 행
		 		 					{값2, 값5},     1 index 행
		 		 					{값3, 값6},     2 index 행	 		 
		 		 				 }; 
		 */
		//1. 학생들의 과목별 점수를 초깃값으로 갖는 2차원 배열 메모리 생성
			   int[][]  score = {  //국어,  영어,  수학
					   			   //0열,  1열,  2열	 
						    		{85,  60,  70}, //0행  1번학생
						    		{90,  95,  80}, //1행  2번학생
						    		{75,  80, 100}, //2행  3번학생
						    		{80,  70,  95}, //3행  4번학생
						    		{100, 65,  80}  //4행  5번학생
						   
				   				};
			   
		//2. 각 과목별 총점을 저장시킬 1차원 배열 메모리 생성
			   int[]    subject = new int[3];
			   int r, c;
			   
			   System.out.println("각 과목별 총점 구하기");
			   
			   String[] subjectNames = {"국어", "영어" ,"수학"};
			   
			   for(c=0; c<3; c++) {
				   for(r=0; r<5; r++) {
					   
					   subject[c] += score[r][c];
				   }
				   System.out.println(subjectNames[c] + "점수 총합 : " + subject[c]);
			   }
			   
			   System.out.println("====================================");
			   
		//3. 각 학생별 총점을 저장시킬 1차원 배열 메모리 생성
			   int[]    student = new int[5]; //[ 0 ][ 0 ][ 0 ][ 0 ][ 0 ]
			   		    					  //  0    1    2    3    4   index
			   
			   System.out.println("학생별 과목 총점 구하기");
			   
			   
			   
			   
			   for(r=0; r<5; r++) {//행은 각 학생을 구분 하므로 학생 수만큼 반복
				   
				   for(c=0; c<3; c++) { //각 행(학생정보)에 대한 열(과목) 갯수만큼 반복
					   
					   			student[r] += score[r][c];
					   
					   //각 학생에 대한 국어점수 + 영어점수 + 수학점수들을 합한 학생별 총점을 구해 student 1차원 배열에 차례대로 저장
					   				
					   
					   }
				   System.out.println((r+1) + "번 학생 총점 = " + student[r]);
			   }
			   
			   
	}

}
