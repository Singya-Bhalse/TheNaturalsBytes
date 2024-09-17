package com.userexprior.dto;

public class ActivitiesDTO {
	private String activity_name;
	private Long occurrences;

	public String getActivity_name() {
		return activity_name;
	}

	public void setActivity_name(String activity_name) {
		this.activity_name = activity_name;
	}

	public Long getOccurrences() {
		return occurrences;
	}

	public void setOccurrences(Long occurrences) {
		this.occurrences = occurrences;
	}

	@Override
	public String toString() {
		return "ActivitiesDTO [activity_name=" + activity_name + ", occurrences=" + occurrences + "]";
	}

}
