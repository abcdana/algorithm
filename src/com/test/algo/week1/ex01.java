package com.test.algo.week1;

import java.util.ArrayList;

public class ex01 {

    private static long solution1(int a, int b){

        //문제 1. 두 정수 사이의 모든 수들의 합?

        long answer = 0;

        if (a>b) {
            //a가 b보다 클 경우 b부터 a까지 차례대로 값을 쌓아 return
            for (int i=b; i<=a; i++) {
                answer += i;
            }
        }else {
            //b가 a보다 클 경우 a부터 b까지 차례대로 값을 쌓아 return
            for (int i=a; i<=b; i++) {
                answer += i;
            }
        }
        return answer;
    }

    private static void solution2(int n){

        //문제 2. *를 이용하여 마름모 모양을 반환하라.

        //조건 1. 홀수만 파라미터로 받을 수 있음
        //    2. 양수만 입력받을 수 있음
        if (n > 0 && n%2 == 1) {

           int i,j = 0;
           //윗 삼각형과 아랫 삼각형을 만들 기준 값을 정한다.
            //mid 값을 기준으로 두개의 삼각형을 만드는 for문을 돌릴 것.
           int mid = (int)n/2 + 1;

           //윗 삼각형형 (1부터 기준값까지 1씩 증가)
           for (i=1; i<=mid; i++) {
               //공백은 1칸씩 감소하므로 기준값(mid)-i의 규칙을 가진다.
                for (j=0; j<mid-i; j++){
                    System.out.print(" ");
                }
                //*은 홀수개씩 늘어나므로 (2*i)-1의 규칙을 가진다.
                for (j=0; j<(2*i)-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
           }

           //아래 역삼각형 (기준값-1부터 1까지 1씩 감소)
           for (i=mid-1; i>=1; i--){
               //위와 동일
               //i가 기준값-1로부터 1씩 감소하므로 그에 따라
                //공백은 기준값(mid)-i의 규칙을 가지며,
               for (j=0; j<mid-i; j++){
                   System.out.print(" ");
               }
                //*은 (2*i)-1의 규칙을 가진다.
               for (j=0; j<(2*i)-1; j++){
                   System.out.print("*");
               }
               System.out.println();
           }
        } else {
            System.out.println("n은 홀수이자 양수로 입력해야한다.");
        }

    }

    private static long solution3(int n){
        
        //문제 3. 팩토리얼값 구하기
        
        long answer = 0;
        
        //입력값이 1일 때는 1 그대로 반환
        if (n <= 1) return n;
        //입력값이 그 이상일때는 재귀호출을 이용한다. n(n-1)(n-2)... 1이 나올때까지 호출
        else return solution3(n-1)*n;
    }

    private static void solution4(int[] arr){

        //문제 4. 중복된 숫자를 찾아라.

        //중복값을 제거한 list와 중복값만 저장한 duplist를 선언
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> duplist = new ArrayList<>();

        for (int dnum : arr) {
            //리스트의 contains 메소드로 내부의 데이터가 있는지 없는지 체크
            if (!list.contains(dnum)) {
                //중복값이 없을 경우 list에 담는다.
                list.add(dnum);
            } else {
                //중복값인 경우 duplist에 담는다.
                duplist.add(dnum);
            }
        }

        for (int i=0; i<duplist.size(); i++) {
            //duplist의 엘리먼트 하나씩 출력
            //마지막 엘리먼트는 ',' 제외하고 출력한다.
            if (i < duplist.size()-1) {
                System.out.print(duplist.get(i) + ",");
            } else {
                System.out.print(duplist.get(i));
            }
        }

    }



    public static void main(String[] args) {

        //문제 1.
        System.out.println(solution1(2, 2));

        //문제 2.
        solution2(7);

        //문제 3.
        System.out.println(solution3(5));

        int[] arr = { 1, 4, 5, 1, 2, 2 };

        //문제 4.
        solution4(arr);

    }
}
