package com.cap4.Backend_API.Controllers;

import java.util.List;

import com.cap4.Backend_API.Models.Schedule;
import com.cap4.Backend_API.Repository.ScheduleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi")
public class ScheduleController 
{

	@Autowired
	private ScheduleRepository scheduleRepository;

	@GetMapping("/schedules")
	public List<Schedule> getAllSchedules()
	{
		return scheduleRepository.findAll();
	}

	@GetMapping("/schedules/{id}")
	public ResponseEntity<Schedule> getScheduleId(
		@PathVariable(value = "id") int scheduleId)
			throws Exception {
			Schedule schedule =
				scheduleRepository.findById(scheduleId).orElseThrow(() -> new Exception("Schedule not found on :: " + scheduleId));

			return ResponseEntity.ok().body(schedule);
			}


}