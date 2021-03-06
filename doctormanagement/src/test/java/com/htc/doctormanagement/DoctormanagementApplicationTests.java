package com.htc.doctormanagement;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.htc.doctormanagement.dao.AppointmentInterface;
import com.htc.doctormanagement.entity.Appointment;

@SpringBootTest
class DoctormanagementApplicationTests {
	@Autowired
	AppointmentInterface appointmentInterface;

	private void Main() {
		// TODO Auto-generated method stub
		testAppointment();

	}
	
	@Test
	public  void testAppointment() {
		Appointment appointment = new Appointment();
		appointment.setAppointmentId(101L);
		appointment.setAppointmentDate(LocalDate.now());
		appointment.setDoctorId(001L);
		
		appointmentInterface.save(appointment);
		
		assertNotNull(appointmentInterface.findById(101L).get());
	}

	private void assertNotNull(Appointment appointment) {
		// TODO Auto-generated method stub
		
	}

	

}
