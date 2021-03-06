package com.bestqualified.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.bestqualified.controllers.GeneralController;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Text;

public class Job implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7898460568156561794L;
	
	private Key id;
	private List<String> skills;
	private Text jobRoles;
	private Date closingDate;
	private String salaryRange;
	private String salaryCurrency;
	private String careerLevel;
	private boolean allowLinkedInApplication;
	private boolean allowFacebookApplication;
	private String Location;
	private String educationLevel;
	private boolean positionFilled;
	private String jobType;
	private String jobCategory;
	private Key Employer;
	private List<Key> applicants;
	private String jobTitle;
	private Date datePosted;
	private Text description;
	private Text customAttributes;
	private String experience;
	private String applicationUrl;
	private Key company;
	private List<Key> viewers;
	private List<Key> newApplicants;

	public Job() {
		id = GeneralController.ds.allocateIds(Job.class.getSimpleName(), 1).getStart();
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", skills=" + skills + ", jobRoles="
				+ jobRoles + ", closingDate=" + closingDate + ", salaryRange="
				+ salaryRange + ", salaryCurrency=" + salaryCurrency
				+ ", careerLevel=" + careerLevel
				+ ", allowLinkedInApplication=" + allowLinkedInApplication
				+ ", allowFacebookApplication=" + allowFacebookApplication
				+ ", Location=" + Location + ", educationLevel="
				+ educationLevel + ", positionFilled=" + positionFilled
				+ ", jobType=" + jobType + ", jobCategory=" + jobCategory
				+ ", Employer=" + Employer + ", applicants=" + applicants
				+ ", jobTitle=" + jobTitle + ", datePosted=" + datePosted
				+ ", description=" + description + ", customAttributes="
				+ customAttributes + ", experience=" + experience
				+ ", applicationUrl=" + applicationUrl + ", company=" + company
				+ ", viewers=" + viewers + ", newApplicants=" + newApplicants
				+ "]";
	}
	
	

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Text getJobRoles() {
		return jobRoles;
	}

	public void setJobRoles(Text jobRoles) {
		this.jobRoles = jobRoles;
	}

	public List<Key> getNewApplicants() {
		return newApplicants;
	}

	public void setNewApplicants(List<Key> newApplicants) {
		this.newApplicants = newApplicants;
	}

	public List<Key> getViewers() {
		return viewers;
	}

	public void setViewers(List<Key> viewers) {
		this.viewers = viewers;
	}

	public String getApplicationUrl() {
		return applicationUrl;
	}
	
	public void setApplicationUrl(String applicationUrl) {
		this.applicationUrl = applicationUrl;
	}

	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getSalaryRange() {
		return salaryRange;
	}
	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}
	public Key getId() {
		return id;
	}
	public void setId(Key id) {
		this.id = id;
	}
	public Date getClosingDate() {
		return closingDate;
	}
	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}
	public String getSalaryCurrency() {
		return salaryCurrency;
	}
	public void setSalaryCurrency(String salaryCurrency) {
		this.salaryCurrency = salaryCurrency;
	}
	public String getCareerLevel() {
		return careerLevel;
	}
	public void setCareerLevel(String careerLevel) {
		this.careerLevel = careerLevel;
	}
	public boolean isAllowLinkedInApplication() {
		return allowLinkedInApplication;
	}
	public void setAllowLinkedInApplication(boolean allowLinkedInApplication) {
		this.allowLinkedInApplication = allowLinkedInApplication;
	}
	public boolean isAllowFacebookApplication() {
		return allowFacebookApplication;
	}
	public void setAllowFacebookApplication(boolean allowFacebookApplication) {
		this.allowFacebookApplication = allowFacebookApplication;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	public boolean isPositionFilled() {
		return positionFilled;
	}
	public void setPositionFilled(boolean positionFilled) {
		this.positionFilled = positionFilled;
	}
	
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getJobCategory() {
		return jobCategory;
	}
	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}
	public Key getEmployer() {
		return Employer;
	}
	public void setEmployer(Key employer) {
		Employer = employer;
	}
	public List<Key> getApplicants() {
		return applicants;
	}
	public void setApplicants(List<Key> applicants) {
		this.applicants = applicants;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Date getDatePosted() {
		return datePosted;
	}
	public void setDatePosted(Date datePosted) {
		this.datePosted = datePosted;
	}
	public Text getDescription() {
		return description;
	}
	public void setDescription(Text description) {
		this.description = description;
	}
	
	public Text getCustomAttributes() {
		return customAttributes;
	}
	public void setCustomAttributes(Text customAttributes) {
		this.customAttributes = customAttributes;
	}

	public Key getCompany() {
		return company;
	}

	public void setCompany(Key company) {
		this.company = company;
	}

}
