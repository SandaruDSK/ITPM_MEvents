<%@page import="jdk.nashorn.internal.runtime.linker.JavaAdapterFactory"%>
<%@page import="model.Events_model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:include page="client_header.jsp" ></jsp:include>

 <%
    	Events_model PS= (Events_model)request.getAttribute("Pro");

    %>
     <section class="slider_wrap slider_fullwide slider_engine_revo slider_alias_revsliderHome1">
               <!-- REVOLUTION SLIDER -->
               <div id="rev_slider_4_1_wrapper" class="rev_slider_wrapper fullwidthbanner-container">
                  <div id="rev_slider_4_1" class="rev_slider fullwidthabanner" data-version="5.1">
                     <ul>
					  
					  
						<li data-index="rs-8" data-transition="fade" data-slotamount="default" data-easein="default" data-easeout="default" data-masterspeed="1000" data-thumb="images/slider1h1-100x50.jpg" data-rotate="0" data-saveperformance="off" data-title="Slide" data-description=""height="300" width="500" >
                           <img src="getimg?imageName=<%=PS.getId() %>_1.jpg" alt="" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" class="rev-slidebg" data-no-retina>
                            
                           
                        </li>
                        <li data-index="rs-8" data-transition="fade" data-slotamount="default" data-easein="default" data-easeout="default" data-masterspeed="1000" data-thumb="images/slider1h1-100x50.jpg" data-rotate="0" data-saveperformance="off" data-title="Slide" data-description=""height="300" width="500">
                           <img src="getimg?imageName=<%=PS.getId() %>_2.jpg" alt="" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" class="rev-slidebg" data-no-retina>
                            
                           
                        </li>
                          <li data-index="rs-8" data-transition="fade" data-slotamount="default" data-easein="default" data-easeout="default" data-masterspeed="1000" data-thumb="images/slider1h1-100x50.jpg" data-rotate="0" data-saveperformance="off" data-title="Slide" data-description=""height="300" width="500">
                           <img src="getimg?imageName=<%=PS.getId() %>_3.jpg" alt="" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" class="rev-slidebg" data-no-retina>
                            
                           
                        </li>
                          <li data-index="rs-8" data-transition="fade" data-slotamount="default" data-easein="default" data-easeout="default" data-masterspeed="1000" data-thumb="images/slider1h1-100x50.jpg" data-rotate="0" data-saveperformance="off" data-title="Slide" data-description=""height="300" width="500">
                           <img src="getimg?imageName=<%=PS.getId() %>_4.jpg" alt="" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" class="rev-slidebg" data-no-retina>
                            
                           
                        </li>
				
           
                        
                     </ul>
                     <div class="tp-bannertimer tp-bottom"></div>
                  </div>
               </div>
               <!-- END REVOLUTION SLIDER -->
            </section>
           
               <div class="content_wrap">
                  <div class="content">
				  <div class="row">
                     <div class="column-1_2">
                        <div class="post_thumb">
                           
						   
						  
							
                           <h4 class="sc_title">Introduction Video </h4>
                           <div id="vid" style="height:320px; " >
						   
						   
						   
						   
						   
						   <iframe width="534px" height="320px" src="https://www.youtube.com/embed/<%=PS.getLink() %>?autoplay=1" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
						   
						   
						   
						   
						   
						   
						   
						   </div>
                           
                        </div>
                     </div>
                 
                     <div class="column-1_2" style="float:right;">
                      
                        <h3 class="post_title"><%=PS.getEvent_name() %> | <%=PS.getCity() %></h3>
							
                        <div class="ps_single_info">
					
                           <div class="ps_single_info_descr">
                              Event ID: <%=PS.getId() %>, <%=PS.getType() %>. 
                           </div>
                           <div class="property_price_box"><span class="property_price_box_sign">Rs</span><span class="property_price_box_price"><%=PS.getPrice() %></span></div>
                          
						   
                           <div class="cL"></div>
						   
                        </div>
						
						
						<div class="sc_line sc_line_position_center_center sc_line_style_solid margin_top_medium margin_bottom_medium"></div>
                           <h4 class="sc_title">Features &amp; Facilities</h4>
                           <div class="columns_wrap sc_columns">
                              <div class="column-1_2 sc_column_item">
                                 <ul class="sc_list sc_list_style_iconed color_1">
                                    <li class="sc_list_item">
                                       <span class="sc_list_icon icon-stop color_2"></span>
                                       <p><%=PS.getFeature_1() %></p>
                                    </li>
                                    <li class="sc_list_item">
                                       <span class="sc_list_icon icon-stop color_2"></span>
                                       <p><%=PS.getFeature_2() %></p>
                                    </li>
                                 </ul>
                              </div>
                              <div class="column-1_2 sc_column_item">
                                 <ul class="sc_list sc_list_style_iconed color_1">
                                    <li class="sc_list_item">
                                       <span class="sc_list_icon icon-stop color_2"></span>
                                       <p><%=PS.getFeature_3() %></p>
                                    </li>
                                    <li class="sc_list_item">
                                       <span class="sc_list_icon icon-stop color_2"></span>
                                       <p><%=PS.getFeature_4() %></p>
                                    </li>
                                 </ul>
                              </div>
                           </div>
						
						
						
					</div>
				</div>
				
					
					<div>
                        <div class="sc_section">
						
						<div class="sc_line sc_line_position_center_center sc_line_style_solid margin_top_medium margin_bottom_medium"></div>
                           <h4 class="sc_title">Description</h4>
                           <p><%=PS.getDescription() %></p>
						   
						   <div class="sc_line sc_line_position_center_center sc_line_style_solid margin_top_medium margin_bottom_medium"></div>
                           <h4 class="sc_title">Payment Structure</h4>
                           <p><%=PS.getPay_plan() %></p>
						   
						   <div class="sc_line sc_line_position_center_center sc_line_style_solid margin_top_medium margin_bottom_medium"></div>
                           <h4 class="sc_title">Contact</h4>
                           <p>Contact Person : <%=PS.getCont_name() %></p>
						   <p>Phone &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <a href="tel:<%=PS.getCont_phone() %>"><%=PS.getCont_phone() %></a></p>
                           
						   
						   </div>
						   
						   
						   </div>
          </div>
		 </div>
	      <center><button type="button" onclick="myFunction" >Pay Now</button></center>
		
		  <style>
				.column-1_2 {
				    width: 47%;
					margin-right:10px;
					float:left;
				}
				.scheme_original .top_panel_wrap_inner {
	background-color: rgba(32, 36, 43, 0.6);
	background-image: none;

</style>
<script>
function myFunction() {
  alert("Sucsess check Payment for more Information ");
}
</script>

<jsp:include page="client_footer.jsp" ></jsp:include>