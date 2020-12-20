<%@ page import="java.io.*,java.util.*"%>
<%@ page import="com.sonata.Model.Course"%>
<%@ page import="com.sonata.*"%>

<%@ page isELIgnored="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    
<body>
       <h1>Course Information </h1>
            <div>
				<table border="1">
                    <thead>
                        <tr>
                        	<th>Course ID</th>
                            <th>Course Name</th>
                            <th>Course Trainer</th>
                            <th>Course Pre-Requisite</th>
                            <th>Course Duration</th>
                            <th>Start Date</th>
                            <th>End Date</th>
                            <th>Timing</th>
                            <th>Course Link</th>
                             
                        </tr>
                    </thead>
              		<tbody>
              	<% 
              		List<Course> list = (List)request.getAttribute("courses"); 
              		for (Course u : list) { 
                    %>                  
					<tr>
      					<td><%=u.getCourseID()%></td>
   						<td><%=u.getCourseName()%></td>
   						<td><%=u.getCourseTrainer()%></td>
   						<td><%=u.getPreRequisites()%></td>
   						<td><%=u.getDuration()%></td>
				    	<td><%=u.getStartDate()%></td>
   						<td><%=u.getEndDate()%></td>
   						<td><%=u.getTimings()%></td>
				    	<td><%=u.getUrl()%></td>
					</tr>		                 
				<% 
				} 
			%> 
			
			    <% 
              		List<Course> list1 = (List) request.getAttribute("courses1"); 
              		for (Course u1 : list1) { 
                    %>                  
					<tr>
      					<td><%=u1.getCourseID()%></td>
   						<td><%=u1.getCourseName()%></td>
   						<td><%=u1.getCourseTrainer()%></td>
   						<td><%=u1.getPreRequisites()%></td>
   						<td><%=u1.getDuration()%></td>
				   		<td><%=u1.getStartDate()%></td>
   						<td><%=u1.getEndDate()%></td>
   						<td><%=u1.getTimings()%></td>
				    	<td><%=u1.getUrl()%></td>
					</tr>		                 
				<% 
				} 
			%> 
			    <% 
              		List<Course> list2 = (List)request.getAttribute("courses2"); 
              		for (Course u2 : list2) { 
                    %>                  
					<tr>
      					<td><%=u2.getCourseID()%></td>
   						<td><%=u2.getCourseName()%></td>
   						<td><%=u2.getCourseTrainer()%></td>
   						<td><%=u2.getPreRequisites()%></td>
   						<td><%=u2.getDuration()%></td>
				    	<td><%=u2.getStartDate()%></td>
   						<td><%=u2.getEndDate()%></td>
   						<td><%=u2.getTimings()%></td>
				    	<td><%=u2.getUrl()%></td>
					</tr>		                 
				<% 
				} 
			%> 
                    </tbody>
                </table>
            </div>
	</body>
</html>