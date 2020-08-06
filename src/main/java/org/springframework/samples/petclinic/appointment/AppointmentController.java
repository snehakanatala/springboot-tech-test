package org.springframework.samples.petclinic.appointment;

import java.time.LocalDate;
//import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

//import org.apache.http.StatusLine;
//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.samples.petclinic.appointment.Appointment;
import org.springframework.stereotype.Controller;

@Controller
public class AppointmentController {

	//This should make a REST call to appointment service 
	
	@GetMapping("/appointments")
	public String showAppointmentList(Map<String, Object> model) {
		// Making a REST call to appointment service
		
//		try {
//			CloseableHttpClient httpClient = HttpClients.createDefault();
//			final HttpGet httpGet = new HttpGet("http://localhost:8081/appointments");
//			CloseableHttpResponse response = httpClient.execute(httpGet);
//			StatusLine statusLine = response.getStatusLine();		        
//			String responseBody = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);        
//		} catch (Exception e) {
//			
//		}
		Appointments appts = new Appointments();/* handle responseBody to get List of appointments*/
		
		/* This is just a sample collection of appointments. Ideally it should be coming from responsebody */
		Collection<Appointment> sample = appts.getSample();
		appts.getAppointmentList().addAll(sample);
		
		model.put("appointments",  appts);   
		return "appointments/appointmentList";
	}
}
