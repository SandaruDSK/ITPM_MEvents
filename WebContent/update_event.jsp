<%@page import="model.Events_model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:include page="admin_header.jsp" ></jsp:include>

 <div class="right_col" role="main">
         
            <div class="page-title">
  <%
    	Events_model PS= (Events_model)request.getAttribute("Pro");

    %>           
        
            </div><h3>Update Event Details</h3>
     
                    		<form class="form-horizontal" action="UpdateEvent" method="post" enctype="multipart/form-data">

			
			<div class="row">
				<div class="form-group col-md-6">
					<label class="col-md-3 control-label">Event ID:</label>
					<div class="col-md-9">
						<input type="text" value="<%=PS.getId() %>" class="form-control"  name="eveID" id="" readonly>
					</div>
				</div>
				<div class="form-group col-md-6">
					<label class="col-md-3 control-label">Event Name:</label>
					<div class="col-md-9">
						<input type="text" value="<%=PS.getEvent_name() %>" class="form-control"  name="eveName" id=""  required>
					</div>
				</div>
				<div class="form-group col-md-6">
					<label class="col-md-3 control-label">Arrangement:</label>
					<div class="col-md-9">

						<select name="eveType" class="form-control" id="cars"  >
						  <option value="Indoor">Indoor</option>
							<option value="Outdoor">Outdoor</option>
						</select>
					</div>
				</div>
				<div class="form-group col-md-6">
					<label class="col-md-3 control-label" >Type:</label>
					<div class="col-md-9">

						<select name="eveType2" class="form-control" id="cars">
						  <option value="General">General</option>
							<option value="Gold">Gold</option>
							<option value="Platinum">Platinum</option>
						 
						</select>
					</div>
				</div>
				</div>
				<div class="row">
				<div class="form-group col-md-6">
					<label class="col-md-3 control-label"  >City:</label>
					<div class="col-md-9">
						<input type="text" value="<%=PS.getCity() %>" class="form-control"  name="eveCity" id=""  required>
					</div>
				</div>				
				
				<div class="form-group col-md-6">
					<label class="col-md-3 control-label">Estimated full Payment :</label>
					<div class="col-md-9">
						<textarea id="example-textarea-input" name="evePayplan" rows="3" class="form-control" required><%=PS.getPay_plan() %></textarea>
					</div>
				</div>
				</div>
				
			
			
			<div class="row">
				<div class="form-group col-md-6">
				<label class="col-md-3 control-label">Price :</label>
					<div class="col-md-9">
						<input type="text" value="<%=PS.getPrice() %>" class="form-control"  name="evePrice" id="" required>
					</div>
					
				</div>
				
			<div class="form-group col-md-6">
					<label class="col-md-3 control-label">Description :</label>
					<div class="col-md-9">
						<textarea id="example-textarea-input" name="eveDescription" rows="3" class="form-control" required><%=PS.getDescription()%></textarea>
					</div>
				</div>
			</div>
			
			<div class="row">
			
				<div class="form-group col-md-6">
					
				</div>
				
				<div class="form-group col-md-6">
					
				</div>
				<br>
			</div>
			
			<div class="row">
			
				<div class="form-group col-md-6">
					
				</div>
				
				<div class="form-group col-md-6">
					
				</div>
				<br>
			</div>
			<div class="row">
			
				<div class="form-group col-md-6">
					<label class="col-md-3 control-label">Contact Person:</label>
					<div class="col-md-9">
						<input type="text" value="<%=PS.getCont_name() %>" name="eveContname" class="form-control"   id="" required>
					</div>
				</div>
				
				<div class="form-group col-md-6">
					<label class="col-md-3 control-label" for="Supplier_Name">Contact Number:</label>
						<div class="col-md-9">
							<input type="text" name="eveContphone" value="<%=PS.getCont_phone() %>" class="form-control"  id="" required >
						</div>
				</div>
				<br>
			</div>
			
			<div class="row">
				<div class="form-group col-md-6">
					
						<div class="col-md-4">
							
						</div>
				</div>
			</div>
			
			<!--end of the main table-->
			
			<div class="col-sm-6">
				<div class="block">
					<div class="block-title">
						<div class="block-options pull-right">
						</div>
						<h2><strong>Main Features</strong></h2>
					</div>	
							<div class="row">
								<div class="form-group">
									<label class="col-md-3 control-label">Feature 1:</label>
									<div class="col-md-8">
										<input type="text" id="last-name" value="<%=PS.getFeature_1() %>" name="eveFeat1" required="required" class="form-control" >
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-3 control-label">Feature 2:</label>
									<div class="col-md-8">
										<input type="text" name="eveFeat2" value="<%=PS.getFeature_2() %>" class="form-control"   id=""  required>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-3 control-label">Feature 3:</label>
									<div class="col-md-8">
										<input type="text"  class="form-control" value="<%=PS.getFeature_3() %>" name="eveFeat3" id=""  required>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-3 control-label">Feature 4:</label>
									<div class="col-md-8">
										<input type="text"  class="form-control" value="<%=PS.getFeature_4() %>" name="eveFeat4" id=""  required>
									</div>
								</div>
							</div>
							
				
				</div>
				</div>
				<div class="col-sm-6">
				<div class="block">
					<div class="block-title">
						<div class="block-options pull-right">
						</div>
						<h2><strong>Others</strong></h2>
					</div>	
							<div class="row">
							<div class="form-group" id='imgx'>
					
					
				</div>
				
				<div class="form-group">
					<label class="col-md-3 control-label" for="Supplier_Name">Youtube link:</label>
						<div class="col-md-7">
							<input type="text" class="form-control" value="<%=PS.getLink() %>" name="eveLink" id="yt" required>
						</div>
				</div>
							
								
								
								
							</div>
							
				
				</div>
				</div>
				
		
			<div class="form-group form-actions" align="right">
				
				<button type="submit" onclick="myFunction()" class="btn btn-success"><i class="fa fa-check-circle"></i>Update Event</button>
			</div>
	
		</form>
	
	
	</div>
	<script>
function myFunction() {
  alert("Sucsessfully Updated");
}
</script>
<jsp:include page="admin_footer.jsp" ></jsp:include>
