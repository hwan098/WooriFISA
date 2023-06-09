/* 주 용도
 * - 고객 정보(데이터) 활용 가능한 클래스
 * - 구성
 * 변수와 메소드(변수값 수정, 변수값 제공, 모든 데이털르 하나의 문자열로 가공해서 반환)
 * - 데이터 : 변수 / 기능 : 메소드
 * - 나이값은 1 이상값만 변수에 대입
 * 		제약조건 : age라는 변수에 값 대입 직접 불허
 * 				호출 제한(접근제한자 private, access modifier)
 * 		사전조건 : 조건문으로 데이터 검증 후 대입여부 결정 
 * 			true/false
 * 			if(비교문장){
 * 				true인 경우 실행
 * 			}false{
 * 				false인 경우 실행
 * 			}
 */

package model.domain;

public class Customer {
	String grade;
	String name;
	private int age;
	
	public Customer(String grade, String name, int age) {
		this.grade = grade;
		this.name  = name;
		this.age = age;
	}

	public void setAge(int newAge) {
		if(newAge > 0) {
			age = newAge;
		}else {
			System.out.println("age 무효합니다");
		}
	}
	
	public int getAge() {
		return age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
