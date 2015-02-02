package net.hwanee.www.services;

import java.util.List;

import net.hwanee.www.bean.Board;
import net.hwanee.www.bean.Page;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Service
public class TestServices {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = "/boardlist")
	public 
	@ResponseBody
	Page<Board> getList(
			@RequestParam(value="page", required=false, defaultValue="1") int page,
			@RequestParam(value="rows", required=false, defaultValue="20") int rows,
			@RequestParam(value="sidx", required=false, defaultValue="memberId") String sidx,
			@RequestParam(value="sord", required=false, defaultValue="sort") String sord
			) throws Exception{
		
		List<Board> bd = sqlSession.selectList("test.boardList");
		
		Page<Board> obj = new Page<Board> ();   
	    obj.setRows(bd);  // list<map>형태의 받아온 데이터를 가공해서 셋하고 리턴
	    return obj;
	}
}
