<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.service.UnitQuestionService"%>
<%@page import="com.pro.service.UnitQuestionServiceImpl"%>
<%@page import="java.util.List"%>
<%@page import="com.pro.domain.Question"%>
<%@page import="com.pro.service.UnitService"%>
<%@page import="com.pro.service.UnitServiceImpl"%>
<%@page import="com.pro.domain.Unit"%>
<%@page import="com.pro.service.StuQuestionScoreService"%>
<%@page import="com.pro.service.StuQuestionScoreServiceImpl"%>
<%@page import="com.pro.domain.StuQuestionScore"%>
<%@page import="com.pro.domain.Student"%>

<%
	String unitId = request.getParameter("unitId");
		
	UnitService unitService = new UnitServiceImpl();
	Unit unit = unitService.findSingleUnit(unitId);
	
	Student student = (Student)session.getAttribute("stu");

	StuQuestionScoreService stuQuestionScoreService = new StuQuestionScoreServiceImpl();
	StuQuestionScore sqs = stuQuestionScoreService.findStuQSSingle(student.getStuId(),unitId);
	
	if(sqs!=null){
		response.sendRedirect("reTestError.jsp");
	}else{
		UnitQuestionService unitQuestionService = new UnitQuestionServiceImpl();
		List<Question> questionList = unitQuestionService.getAllUnitQuestion(unitId);
		for(int i=0;i<questionList.size();i++){
			Question question = questionList.get(i);
			StuQuestionScore stuQuestionScore = new StuQuestionScore();
			stuQuestionScore.setAnswerValue(null);
			stuQuestionScore.setUnitId(unitId);
			stuQuestionScore.setQuestionId(question.getQuestionId());
			stuQuestionScore.setStuId(student.getStuId());
			stuQuestionScoreService.addStuQS(stuQuestionScore);
		}
		request.setAttribute("unit",unit);
		request.setAttribute("questionList",questionList);
		
		request.getRequestDispatcher("test.jsp").forward(request,response);
	}
	
%>