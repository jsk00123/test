package net.hwanee.www.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import net.hwanee.www.bean.Board;
import net.hwanee.www.bean.Page;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Service
public class TestServices {

	@Autowired
	private SqlSession sqlSession;
	
	@SuppressWarnings("null")
	@RequestMapping(value = "/boardlist")
	public 
	@ResponseBody
	Page<Board> getList(
			@RequestParam(value="page", required=false, defaultValue="1") int page,
			@RequestParam(value="rows", required=false, defaultValue="20") int rows,
			@RequestParam(value="sidx", required=false, defaultValue="memberId") String sidx,
			@RequestParam(value="sord", required=false, defaultValue="sort") String sord
			) throws Exception{
		
		List<Board> bd = sqlSession.selectList("test.boadList");
		
		Page<Board> obj = null;   
	    obj.setRows(bd);  // list<map>������ �޾ƿ� �����͸� �����ؼ� ���ϰ� ����
	    return obj;
	}
}