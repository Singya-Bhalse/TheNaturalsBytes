package com.userexprior.dto;

import java.util.List;

public class EmployeeDto {

	private Long employeeId;
	private List<TodaysActivitiesDto> activities = null;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public List<TodaysActivitiesDto> getActivities() {
		return activities;
	}

	public void setActivities(List<TodaysActivitiesDto> activities) {
		this.activities = activities;
	}

}