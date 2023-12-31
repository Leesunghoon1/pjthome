package domain;


//VO,  DTO => 컨트롤러 -> DB로 데이터를 전송하는 목적으로 쓰임
//DB에 저장학 객체를 생성하는 목적으로 만들어주는 클래스
//저장한 객체를 가져와 화면에 뿌릴때도 사용
//DB와 상관없이 화면에서 조작해야 하는 값이 필요하다면 Handler를 사용
//Handler는 DB와 상관없이 화면을 조정

//페이징 DB구문 ((시작숫자(0, 10, 20, ,고정숫자(10개)))
//select * from board order by bno desc limit (0,10);
//select * from board order by bno desc limit (10,10);
//select * from board order by bno desc limit (20,10);

public class PagingVO {
	
	private int pageNo; 
	//현재 화면에 출력되는 페이지네이션 번호
	private int qty;
	//한페이지당 보여주는 게시글 수
	
	//검색 변수를 추가
	private String type;
	//검색 할수있는 건수
	
	private String keyword;
	//검색어
	

	public PagingVO(int pageNo, int qty) {
		//클릭하면 설정되는 값
		this.pageNo = pageNo;
		this.qty = qty;
	}
	
	public PagingVO() { //페이지네이션을 클릭하기 전 기본리스트 출력값
		this(1, 10);
	}
	
	
	public int getPageStart() {
		//기본은 10개지만 화면에 5개를 구성할수도 있음
		return (pageNo-1)*qty;
		
		//첫 페이지의 첫게시글 index 번호 를 나타내는 메소드 
		
		//DB에서 조회할 시작 페이지 구하기 
		//만약에 5페이지가 있으면 1,2,3,4,5 있으니까, ((5-1) * 10) = 5페이지의 첫번째 게시글 번호 ('40')
	}
	
	public String[] getTypeToArray() {
		//type이 여러개 들어올때 값을 배열로 리턴
		//서치에서 필요한거
		return(this.type == null) ? new String[] {} : this.type.split("");
	}
	
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	//DB는 겟,셋으로만 접근 가능 맴버변수가 private 이기때문
	
	

}
