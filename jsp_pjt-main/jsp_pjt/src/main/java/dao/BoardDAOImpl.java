package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.BoardVO;
import domain.PagingVO;
import orm.DatabaseBuilder;


public class BoardDAOImpl implements BoardDAO {
	private static final Logger log = LoggerFactory.getLogger(BoardDAOImpl.class);
	//DB 연결
	private SqlSession sql;
	private final String NS = "BoardMapper."; //NS = NameSpace.id 인식
	
	public BoardDAOImpl() {
		new DatabaseBuilder();
		sql = DatabaseBuilder.getFactory().openSession();
	}
	
	@Override
	public int insert(BoardVO bvo) {
		log.info("insert dao check 3");
		int isOk = sql.insert(NS+"add", bvo); // BoardMapper.add
		if(isOk > 0) {  // insert, update, delete 시 commit가 필요.
			sql.commit();
		}
		return isOk;
	}

	@Override
	public List<BoardVO> selectList() {
		log.info("list check 3");
		return sql.selectList(NS+"list");
	}

	@Override
	public BoardVO selectOne(int bno) {
		log.info("detail check 3");
		return sql.selectOne(NS+"detail", bno);
	}

	@Override
	public int update(BoardVO bvo) {
		log.info("edit check 3");
		// insert, update, delete 시 commit가 필요.
		int isOk = sql.update(NS+"up", bvo);
		if(isOk > 0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public int delete(int bno) {
		int isOk = sql.delete(NS+"del", bno);
		if(isOk > 0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public int getTotalCount(PagingVO pgvo) {
		return sql.selectOne(NS+"cnt", pgvo);
	}

	@Override
	public List<BoardVO> getPageList(PagingVO pgvo) {
		// TODO Auto-generated method stub
		return sql.selectList(NS+"page", pgvo);
	}

	@Override
	public String getFileName(int bno) {
		// TODO Auto-generated method stub
		return sql.selectOne(NS+"fileName", bno);
	}
	
	

}
