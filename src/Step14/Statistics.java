package Step14;
import java.util.Arrays;
import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 수 개수 입력
		int iCnt = scan.nextInt();
		// 수가 들어갈 배열
		int[] iNum = new int[iCnt];
		
		int iSum=0;
		int iAvg;
		
		int iMedian; // 중앙값
		int iMode = 0; // 최빈값
		
		int[] iIndex = new int[iCnt]; //인덱스의 카운터
		int iMax = Integer.MIN_VALUE; //최대값을 저장하기위한 변수 
		
		int iMaxNum; // 최댓값
		int iMinNum; // 최솟값
		int iMaxMinDifference; // 최댓값과 최솟값의 차
		 
		// 수 입력
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
			iSum+=iNum[i]; // 1. 산술평균을 구하기 위한 iSum
		}
		iAvg = iSum/iNum.length;
		
		// 2. 중앙값 구하기
		Arrays.sort(iNum);//오름차순 정렬

        int size = iNum.length;

        iMedian = iNum[size / 2];
/*
 * 음수일 경우 index값으로 못들어감 - > 에러
 * 
 * 
        // 3. 최빈값 구하기

        for (int i = 0; i < iNum.length; i++) {
            iIndex[iNum[i]]++; //COUNT          
        }
        for (int i=0; i< iIndex.length; i++){
            if(iMax<iIndex[i]){
                iMax = iIndex[i]; //MAX
                iMode = i; //최빈값 : MODE
            }          
        }      
        */
        // 4. 최솟값, 최댓값 차이 구하기
        iMaxNum = iNum[iCnt-1];
        iMinNum = iNum[0];
        iMaxMinDifference = iMaxNum - iMinNum;
        
        
        // 출력
		System.out.println(iAvg);
		System.out.println(iMedian);
		System.out.println(iMode);
		System.out.println(iMaxMinDifference);
		
	}

}
