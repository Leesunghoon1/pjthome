package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import service.CommentService;
import service.CommentServiceImpl;


@WebServlet("/cmt/*")
public class CommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    private static final Logger log = LoggerFactory.getLogger(CommentController.class);
    //비동기 방식  => 페이지 이동 방식X => destPageX requestdispacherX
	private CommentService csv;
    private int isOk;
    

    public CommentController() {
    	 csv = new CommentServiceImpl();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//response의 setContentType 설정은 하지 않음.
		
		
		String uri = request.getRequestURI(); // 
		// /brd/detail?bno=1;  => 동기방식 주소
		// 동기방식 => get, post 
		// /cmt/list/10, /cmt/post, /cmt/update => RestAPI 방식
		// get=>리스트 보여줄때, post=>등록시, put=>updtate, delete=>delete
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		service(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
