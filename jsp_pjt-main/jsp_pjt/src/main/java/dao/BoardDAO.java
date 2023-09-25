package dao;

import java.util.List;

import domain.BoardVO;
import domain.PagingVO;

public interface BoardDAO {

	int insert(BoardVO bvo);
	//전달받고 다오한테 전달
	List<BoardVO> selectList();

	BoardVO selectOne(int bno);

	int update(BoardVO bvo);

	int delete(int bno);

	int getTotalCount(PagingVO pgvo);

	List<BoardVO> getPageList(PagingVO pgvo);

	String getFileName(int bno);

}
