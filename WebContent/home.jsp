<%@page import="model.Events_model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:include page="client_header.jsp" ></jsp:include>
<section class="slider_wrap slider_fullwide slider_engine_revo slider_alias_revsliderHome1">
               <!-- REVOLUTION SLIDER -->
               <div id="rev_slider_4_1_wrapper" class="rev_slider_wrapper fullwidthbanner-container">
                  <div id="rev_slider_4_1" class="rev_slider fullwidthabanner" data-version="5.1">
                     <ul>
						<li data-index="rs-8" data-transition="fade" data-slotamount="default" data-easein="default" data-easeout="default" data-masterspeed="500" data-thumb="images/slider1h1-100x50.jpg" data-rotate="0" data-saveperformance="off" data-title="Slide" data-description="">
                           <img src="images/slide/slide_1.jpg" alt="" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" class="rev-slidebg" data-no-retina>  
                        </li>
                        
                        <li data-index="rs-8" data-transition="fade" data-slotamount="default" data-easein="default" data-easeout="default" data-masterspeed="500" data-thumb="images/slider1h1-100x50.jpg" data-rotate="0" data-saveperformance="off" data-title="Slide" data-description="">
                           <img src="images/slide/slide_2.jpg" alt="" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" class="rev-slidebg" data-no-retina>
                       
                        </li>
                        
                        <li data-index="rs-8" data-transition="fade" data-slotamount="default" data-easein="default" data-easeout="default" data-masterspeed="500" data-thumb="images/slider1h1-100x50.jpg" data-rotate="0" data-saveperformance="off" data-title="Slide" data-description="">
                           <img src="images/slide/slide_3.jpg" alt="" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" class="rev-slidebg" data-no-retina>
                           
                        </li>
                        <li data-index="rs-8" data-transition="fade" data-slotamount="default" data-easein="default" data-easeout="default" data-masterspeed="500" data-thumb="images/slider1h1-100x50.jpg" data-rotate="0" data-saveperformance="off" data-title="Slide" data-description="">
                           <img src="images/slide/slide_4.jpg" alt="" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" class="rev-slidebg" data-no-retina>
                           
                        </li>
                        
                     </ul>
                     <div class="tp-bannertimer tp-bottom"></div>
                  </div>
               </div>
               <!-- END REVOLUTION SLIDER -->
            </section>
 
				                 
            <div class="page_content_wrap page_paddings_no">
   <%

    	List<model.Events_model> Pro= (List<model.Events_model>)request.getAttribute("Pro");
    	for(int x =0; x<Pro.size(); x++)
    	{

    %>  
               <div class="sc_section">
                  <div class="content_wrap">
                     <div class="columns_wrap margin_top_xlarge margin_bottom_xmedium">
                        <div class="column-1_2">
                           <div class="bgtext1">
                              <p>FEATURED</p>
                           </div>
                           <h2 style="margin-top: -50px;"; class="sc_title sc_title_iconed ind2 margin_top_null margin_bottom_xmedium">
                              <span class="sc_title_icon sc_title_icon_left sc_title_icon_small icon-map-pointer18 sc_left"></span>
                              <span class="sc_title_box">
                              <a href="ViewSingleEvent?vid=<%=Pro.get(x).getId() %>"><%=Pro.get(x).getEvent_name() %> | <%=Pro.get(x).getCity() %> </a>
                              
                              </span>
                           </h2>
                           <div class="sc_section margin_bottom_xmedium section_style_1">
                              <div class="sc_section_inner">
                                 <p><%=Pro.get(x).getDescription() %> </p>
								 <h5>Payment Plan</h5>
									<p><%=Pro.get(x).getPay_plan() %> </p>
                              </div>
                           </div>
                           <div class="columns_wrap sc_columns margin_bottom_medium">
                              <div class="column-1_2 sc_column_item">
                                 <ul class="sc_list sc_list_style_iconed color_1">
                                    <li class="sc_list_item">
                                       <span class="sc_list_icon icon-stop color_2"></span>
                                       <p><%=Pro.get(x).getFeature_1() %> </p>
                                    </li>
                                    <li class="sc_list_item">
                                       <span class="sc_list_icon icon-stop color_2"></span>
                                       <p><%=Pro.get(x).getFeature_2() %></p>
                                    </li>
                                 </ul>
                              </div>
                              <div class="column-1_2 sc_column_item">
                                 <ul class="sc_list sc_list_style_iconed color_1">
                                    <li class="sc_list_item">
                                       <span class="sc_list_icon icon-stop color_2"></span>
                                       <p><%=Pro.get(x).getFeature_3() %></p>
                                    </li>
                                    <li class="sc_list_item">
                                       <span class="sc_list_icon icon-stop color_2"></span>
                                       <p><%=Pro.get(x).getFeature_4() %> </p>
                                    </li>
                                 </ul>
                              </div>
                           </div>
                           <div class="sc_property_wrap">
                              <div class="sc_property sc_property_style_property-2">
                                 <div class="sc_property_item">
                                    <div class="ps_single_info">
                                       <div class="property_price_box">
                                          <span class="property_price_box_sign">Rs</span><span class="property_price_box_price"><%=Pro.get(x).getPrice() %></span>
                                       </div>
                                       <div class="sc_property_info_list">
                                          
                                          <span class="icon-warehouse"><%=Pro.get(x).getType() %></span>
                                       </div>
                                       <div class="cL"></div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                        </div>
                        <div class="column-1_2  bigimg">
                           <figure class="sc_image ">
                              <a href=""><img src="getimg?imageName=<%=Pro.get(x).getId() %>_1.jpg" alt="" /></a>
                           </figure>
                        </div>
                     </div>
                  </div>
               </div>
               <%		
    	}
    %>	
               <div class="sc_section overflow_hidden bg_color_1">
                  <div class="content_wrap margin_top_large margin_bottom_medium">
				  <div class="row">
	 
 
		                       <h4 class="pull-left sc_title margin_top_null margin_bottom_medium">Recent Events</h4>
  
				  </div>
				    
														

                     <div class="sc_property_wrap">
                        <div class="sc_property sc_property_style_property-1">
                           <div class="sc_columns columns_wrap">
						   
						   <%
				   	List<model.Events_model> PL= (List<model.Events_model>)request.getAttribute("PL");
		                     	for(int x =0; x<PL.size(); x++)
		           {

		               %>	 
						   
                              <div class="column-1_3 column_padding_bottom">
                                 <div class="sc_property_item">
                                    <div class="sc_property_image">
                                       <a href="ViewSingleEvent?vid=<%=PL.get(x).getId() %>">
                                          <div class="property_price_box"><span class="property_price_box_sign">Rs </span><span class="property_price_box_price"><%=PL.get(x).getPrice() %></span></div>
                                          <img alt="" src="getimg?imageName=<%=PL.get(x).getId() %>_1.jpg" style="width:356px;height:220px;padding:5px;border: 1px solid #dbdbdb;" >
                                       </a>
                                    </div>
                                    <div class="sc_property_info">
                                       <div class="sc_property_description"></div>
                                       <div>
                                          <div class="sc_property_icon">
                                             <span class="icon-location"></span>
                                          </div>
                                          <div class="sc_property_title">
                                             <div class="sc_property_title_address_1">
                                                <a href="ViewSingleEvent?vid=<%=PL.get(x).getId() %>"><%=PL.get(x).getEvent_name() %> |  <%=PL.get(x).getCity() %></a>  
                                             </div>
                                             <div class="sc_property_title_address_2"><%=PL.get(x).getDescription() %></div>
                                          </div>
                                          <div class="cL"></div>
                                       </div>
                                    </div>
                                    <div class="sc_property_info_list">
                                       
								   </div>
                                 </div>
                              </div>
							  
                                            <%		
    	}
    %>	
    
                           </div>
                        </div>
                     </div>
            </div>
               </div>              
            </div>
         
            

<style>
.sc_services_style_services-1 {
    padding: 8em 0 5em;
}

.property_price_box {
    position: absolute;
    right: 6px;
    bottom: 6px;
}
.bigimg{
	
    overflow: hidden;
}

.scheme_original .top_panel_wrap_inner {
	background-color: rgba(32, 36, 43, 0.6);
	background-image: none;
}

@media only screen and (max-width: 625px) {
  .slider_wrap {
    display: none;
  }
}


</style>

<script>
			
				$(document ).ready(function() {    
					$(window).scroll(function () {     
						if ($('body').scrollTop() < 50) {
						   $('#mme').addClass("sdown");

						} else {
						    $('#mme').removeClass("sdown");
						}
					});
				 });
			
			
			</script>
			
			<style>
				.sdown{position:fixed !important;}
			
			
			</style>         
  
<jsp:include page="client_footer.jsp" ></jsp:include>