package assignment1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/*Assessment: Assignment 1
Student Name: Na Yang
Student Number: 040744984
Lab Professor Name: Natalie Gluzman
Lab Section: 312
*/
/**
@author Na Yang
@version 1.0
@since javac 21.0.1
*/
/*
 * 	W24	CST8284
 * 	Assignment 1: My Health System
 * 
 *		This is the start of a system which would maintain Electronic Medical Records for patients.
 *		This class assumes all values passed to the set methods are correct and valid.
 *		REVIEW THIS FILE, ASSIGNMENT INSTRUCTIONS, UML Class Diagram CAREFULLY BEFORE YOU START CODING!
 *
 * 	Remove unneeded comments/code when you are done. (Clean code is better code).
 * 
 * 	Field values and constraints can be found in the Standards guide
 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428 (last searched January 27, 2024).
 * 
 */


/**
 * This class represents the EMHRecord for a patient.  
 * 
 */
public class EMHRecord {
	/**
	 * declare the variable reportingFacilityProvince(2 characters)
	 */
	private String reportingFacilityProvince;
	/**
	 * declare the variable institutionNumber (5 characters)
	 */
	private String institutionNumber; 
	/**
	 * declare the variable funcitonalCentreAccount (9 characters)
	 */
	private String funcitonalCentreAccount; 
	/**
	 * declare the variable encounterSequence (3 characters（001–999 or blank）)
	 */
	private int encounterSequence; 
	/**
	 * declare the variable healthCareNumber (12 characters（Valid health care number, 0, 1,8 (DAD only) or 9 (see Appendix C)）)
	 */
	private String healthCareNumber; 
	/**
	 * declare the variable chartNumber (10 characters（0–9, A–Z or blank）)
	 */
	private String chartNumber; 
	/**
	 * declare the variable issuingProvince (2 characters（NL, PE, NS, NB, QC, ON, MB, SK, AB, BC, YT, NT, NU, 99, CA）)
	 */
	private String issuingProvince; 
	/**
	 * declare the variable postalCode (6 characters(: Valid postal code (ANANAN), 2-digit mini–postal code, 99))
	 */
	private String postalCode; 
	/**
	 * declare the variable residenceCode (7 characters(As defined by the province/territory or blank))
	 */
	private String residenceCode;
	/**
	 *declare the variable gender: M,F, U,O
	 */
	private String gender;
	/**
	 * declare the variable submissionYear (4 characters)
	 */
	private int submissionYear;
	/**
	 * declare the variable adminViaAmbulance (1 character(Valid data: A, G, C, N ))
	 */
	private String adminViaAmbulance;
	
	/**
	 * declare the variable registrationDate format: YYYYMMDD
	 */
	private int registrationDate;
	/**
	 * declare the variable registrationTime format: HHMM
	 */
	private int registrationTime;
	
	
	


	/**
	 * Constructor for EMHRecord
	 * @param reportingFacilityProvince reportingFacilityProvince of user
	 * @param institutionNumber institutionNumber of user
	 * @param healthCareNumber healthCareNumber of user
	 * @param chartNumber chartNumber of user
	 */
	public EMHRecord(String reportingFacilityProvince, String institutionNumber, String healthCareNumber,
			String chartNumber) {
		super();
		this.reportingFacilityProvince = reportingFacilityProvince;
		this.institutionNumber = institutionNumber;
		this.healthCareNumber = healthCareNumber;
		this.chartNumber = chartNumber;
	}



	/**
	 * To get funcitonal centre account of user.
	 * @return user's FuncitonalCentreAccount.
	 */
	public String getFuncitonalCentreAccount() {
		return funcitonalCentreAccount;
	}


	/**
	 * To set funcitonal centre account of user.
	 * @param funcitonalCentreAccount user's FuncitonalCentreAccount.
	 */
	public void setFuncitonalCentreAccount(String funcitonalCentreAccount) {
		this.funcitonalCentreAccount = funcitonalCentreAccount;
	}


	/**
	 * To get encounter sequence of user.
	 * @return user's encounterSequence.
	 */
	public int getEncounterSequence() {
		return encounterSequence;
	}


	/**
	 * To set encounter sequence of user.
	 * @param encounterSequence user's encounterSequence.
	 */
	public void setEncounterSequence(int encounterSequence) {
		this.encounterSequence = encounterSequence;
	}


	/**
	 * To get issuing province of user.
	 * @return user's IssuingProvince.
	 */
	public String getIssuingProvince() {
		return issuingProvince;
	}

	
	/**
	 * To set issuing province of user.
	 * @param issuingProvince user's IssuingProvince.
	 */
	public void setIssuingProvince(String issuingProvince) {
		this.issuingProvince = issuingProvince;
	}


	/**
	 * To get postal code of user.
	 * @return user's PostalCode.
	 */
	public String getPostalCode() {
		return postalCode;
	}


	/**
	 * To set postal code of user.
	 * @param postalCode user's PostalCode.
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	/**
	 * To get residence code of user.
	 * @return user's ResidenceCode.
	 */
	public String getResidenceCode() {
		return residenceCode;
	}


	/**
	 * To set residence code of user.
	 * @param residenceCode user's ResidenceCode.
	 */
	public void setResidenceCode(String residenceCode) {
		this.residenceCode = residenceCode;
	}


	/**
	 * To get gender of user.
	 * @return user's Gender.
	 */
	public String getGender() {
		return gender;
	}


	/**
	 * To set gender of user.
	 * @param gender user's gender.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * To get submission year of user.
	 * @return user's SubmissionYear.
	 */
	public int getSubmissionYear() {
		return submissionYear;
	}


	/**
	 * To set submission year of user.
	 * @param submissionYear user's submissionYear.
	 */
	public void setSubmissionYear(int submissionYear) {
		this.submissionYear = submissionYear;
	}


	/**
	 * To get admin via ambulance of user.
	 * @return user's adminViaAmbulance.
	 */
	public String getAdminViaAmbulance() {
		return adminViaAmbulance;
	}


	/**
	 * To set admin via ambulance of user.
	 * @param adminViaAmbulance user's adminViaAmbulance.
	 */
	public void setAdminViaAmbulance(String adminViaAmbulance) {
		this.adminViaAmbulance = adminViaAmbulance;
	}


	/**
	 * To get registration date of user.
	 * @return user's registrationDate.
	 */
	public int getRegistrationDate() {
		return registrationDate;
	}



	/**
	 * To set registration date of user.
	 * @param registrationDate user's registrationDate with format: YYYYMMDD.
	 */
	public void setRegistrationDate(int registrationDate) {
		this.registrationDate = registrationDate;
	}


	/**
	 * To get registration time of user.
	 * @return user's RegistrationTime.
	 */
	public int getRegistrationTime() {
		return registrationTime;
	}


	/**
	 * To set registration time of user.
	 * @param registrationTime user's RegistrationTime with format: HHMM.
	 */
	public void setRegistrationTime(int registrationTime) {
		this.registrationTime = registrationTime;
	}


	/**
	 * To get reporting facility province of user.
	 * @return user's ReportingFacilityProvince.
	 */
	public String getReportingFacilityProvince() {
		return reportingFacilityProvince;
	}


	/**
	 * To set reporting facility province of user.
	 * @param reportingFacilityProvince user's reportingFacilityProvince.
	 */
	public void setReportingFacilityProvince(String reportingFacilityProvince) {
		this.reportingFacilityProvince = reportingFacilityProvince;
	}


	/**
	 * To get institution number of user.
	 * @return user's InstitutionNumber.
	 */
	public String getInstitutionNumber() {
		return institutionNumber;
	}


	/**
	 * To set institution number of user.
	 * @param institutionNumber user's InstitutionNumber.
	 */
	public void setInstitutionNumber(String institutionNumber) {
		this.institutionNumber = institutionNumber;
	}


	/**
	 * To get healthCare number of user.
	 * @return user's HealthCareNumber.
	 */
	public String getHealthCareNumber() {
		return healthCareNumber;
	}


	/**
	 * To set healthCare number of user.
	 * @param healthCareNumber user's HealthCareNumber.
	 */
	public void setHealthCareNumber(String healthCareNumber) {
		this.healthCareNumber = healthCareNumber;
	}


	/**
	 * To get chart number of user.
	 * @return user's ChartNumber.
	 */
	public String getChartNumber() {
		return chartNumber;
	}

	
	/**
	 * To set chart number of user.
	 * @param chartNumber user's ChartNumber.
	 */
	public void setChartNumber(String chartNumber) {
		this.chartNumber = chartNumber;
	}



	/**
	 * Convert this objectd into a meaningful string.
	 * @return	This object as a string.
	 */
	@Override
	public String toString() {
		return "EMHRecord [reportingFacilityProvince=" + reportingFacilityProvince + ", institutionNumber="
				+ institutionNumber + ", funcitonalCentreAccount=" + funcitonalCentreAccount + ", encounterSequence="
				+ encounterSequence + ", healthCareNumber=" + healthCareNumber + ", chartNumber=" + chartNumber
				+ ", issuingProvince=" + issuingProvince + ", postalCode=" + postalCode + ", residenceCode="
				+ residenceCode + ", gender=" + gender + ", submissionYear=" + submissionYear + ", adminViaAmbulance="
				+ adminViaAmbulance + ", registrationDate=" + registrationDate + ", registrationTime="
				+ registrationTime + "]";
	}
	
	/**
	 * convert the int date to LocalDate format
	 * @return
	 */
   /* public LocalDate convertDate() {
        String dateString = String.valueOf(this.registrationDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        return LocalDate.parse(dateString, formatter);
    }*/

    /**
     * convert int time to LocalTime
     * @return
     */
    /*public LocalTime convertTime() {
        String timeString = String.format("%04d", this.registrationTime); // Ensure the time is in HHMM format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmm");
        return LocalTime.parse(timeString, formatter);
    }*/












	

	
	
	
	
	
	
}