package org.springframework.samples.petclinic.appointment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Appointments {

	private List<Appointment> appointments;

	@XmlElement
	public List<Appointment> getAppointmentList() {
		if (appointments == null) {
			appointments = new ArrayList<>();
		}
		return this.appointments;
	}
	
	/**
	 * This is just a sample method to return a collection of sample appointments
	 * This method should be removed once the response from rest call in appointment controller is handled
	 * @return Collection of Appointment
	 */
	public Collection<Appointment> getSample() {		
		Collection<Appointment> apps = new ArrayList<>();
		Appointment app1, app2;
		app1 = new Appointment();
		app2 = new Appointment();
		app1.setApptDate(LocalDate.now());
		app1.setPetId("1");
		app1.setVetId("1");
		app2.setApptDate(LocalDate.now());
		app2.setPetId("2");
		app2.setVetId("2");
		apps.add(app1);
		apps.add(app2);
		return apps;
	}
}
