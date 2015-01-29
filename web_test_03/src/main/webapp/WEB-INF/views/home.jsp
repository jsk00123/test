<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>

<html>
<head>
	
	<meta http-equiv="Content-Type" content="text/html,js; charset=UTF-8">
	<title>Home</title>
	
	<script src="http://code.jquery.com/jquery-latest.js"></script> 
	
	<link rel="stylesheet" type="text/css" media="screen" href="/resources/css/jquery-ui-1.11.2.custom.css" />
	<link rel="stylesheet" type="text/css" media="screen" href="/resources/css/ui.jqgrid.css" />
	<link rel="stylesheet" type="text/css" media="screen" href="/resources/css/searchFilter.css" />
	<link rel="stylesheet" type="text/css" media="screen" href="/resources/css/ui.multiselect.css" />
	 
	<script src="/resources/js/jquery-1.11.0.min.js" type="text/javascript"></script>
	<script src="/resources/js/i18n/grid.locale-kr.js" type="text/javascript"></script>
	<script src="/resources/js/jquery.jqGrid.src.js" type="text/javascript"></script>
	 
	<script type="text/javascript">
		$(window.document).ready(function(){
			$('#list').jqGrid({
				url:'/boardlist',
				datatype:"json",
				colNames:['번호','제목','작성자','수정날짜','조회수'],
				colModel:[
				          {name:'num',index:'col1'},
				          {name:'title',index:'col2'},
				          {name:'writer',index:'col2'},
				          {name:'regdate',index:'col2'},
				          {name:'count',index:'col2'}
				],
				caption:"test",
				rowNum:10,
				rowList:[10,20,30],
				pager:'#pager',
				sortname:'num',
				viewrecords:true,
				sortorder:"desc",
			})
			jQuery("#list").jqGrid('navGrid','#pager',{edit:false,add:false,del:false});
		})
	</script>
	
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<P>  The test on the database is ${testdb}. </P>

<table id ="list"></table>
<div id="pager"></div>

</body>
</html>
