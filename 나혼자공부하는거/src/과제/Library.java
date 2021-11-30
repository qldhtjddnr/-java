package 과제;

public class Library {

	// 필드

	private static final int MAX_SIZE = 5;
	private Book[] bookList;// 보유중인 책정보
	private int bookCount;// 보유중인 책수량

	// 생성자
	public Library() {
		this.bookList = new Book[MAX_SIZE];
		this.bookCount = 0;
	}

	// 메소드
	// 책에대한 입고처리

	// 현재 보유중이 책 정보 확인

	public void printBookList() {
		for (int i = 0; i < this.bookCount; i++)
			System.out.println(bookList[i]);
	}

	public void bookName() {
		String bookList1 = "혼자공부하는 자바";
		String bookList2 = "이것이 자바다";
		String bookList3 = "자바스크립트파워북";
		String bookList4 = "나는 프로그래머다";
		String bookList5 = "오늘부터 개발자";
	}

	// 지정된 책 정보 확인

	// 책을 대여

	// 책 반납

	// 대여 횟수를 기준으로 인기순위 확인

}
