package ex07string;

import java.util.Scanner;

public class E02StringMethod4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		System.out.println("시나리오1] 주민등록번호를 이용하여 성별을 판단하는 프로그램");
		System.out.print("주민등록번호를 입력하세요 (예: 190419-3000000): ");
        String idNumber = scanner.nextLine();
        
        if (idNumber.length() != 14 || idNumber.charAt(6) != '-') {
            System.out.println("잘못된 형식입니다. 올바른 형식으로 입력해주세요.");
            return;
        }
        char genderChar = idNumber.charAt(7);
        switch (genderChar) {
        case '1': case '3':
            System.out.println("남자");
            break;
        case '2': case '4':
            System.out.println("여자");
            break;
        default:
            System.out.println("잘못된 주민등록번호입니다.");
            break;
        }
        
        System.out.println("===============================================");
		

		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
        System.out.println("시나리오2] 해당 문자열이 이메일 형식인지 검사하는 프로그램");
        System.out.print("이메일 주소를 입력하세요: ");
        String email = scanner.nextLine();
        
        if (email.contains("@") && email.contains(".")) {
            int atPosition = email.indexOf('@');
            int dotPosition = email.lastIndexOf('.');
            
            if (atPosition < dotPosition) {
                System.out.println(email + " => 이메일 형식임");
            } else {
                System.out.println(email + " => 이메일 형식이 아님");
            }
        } else {
            System.out.println(email + " => 이메일 형식이 아님");
        }
        
        System.out.println("===============================================");
		
        

		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 
		이용해서 작성하시오.
		*/	
        System.out.println("시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을이용해 구현");
        
		System.out.print("주민등록번호를 입력하세요 (예: 190419-3000000): ");
        String idNumber2 = scanner.nextLine();
        
        if (idNumber2.length() != 14 || idNumber2.indexOf('-') != 6) {
            System.out.println("잘못된 형식입니다. 올바른 형식으로 입력해주세요.");
            return;
        }
        char genderChar2 = idNumber2.charAt(7);
        switch (genderChar2) {
        case '1': case '3':
            System.out.println("남자");
            break;
        case '2': case '4':
            System.out.println("여자");
            break;
        default:
            System.out.println("잘못된 주민등록번호입니다.");
            break;
        }
        
        System.out.println("===============================================");

		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
        System.out.println("시나리오4]파일명에서 확장자를 잘라내는 프로그램");
        System.out.print("파일명을 입력하세요: ");
        String fname = scanner.nextLine();
        int fdot = fname.lastIndexOf('.');
        
        if (fdot != -1) {
            String fileName = fname.substring(0, fdot);
            System.out.println("확장자를 제외한 파일명: " + fileName);
        } else {
            System.out.println("입력된 파일명에 확장자가 없습니다.");
        }

	}

}
