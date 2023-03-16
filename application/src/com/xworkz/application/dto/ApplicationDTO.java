package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.application.constant.LangUsed;
import com.xworkz.application.constant.Type;

public class ApplicationDTO implements Serializable {

	private String name;
	private double version;
	private LocalDate createdDate;
	private double size;
	private String developedBy;
	private Type type;
	private int price;
	private LocalDate firstVersionReleaseDate;
	private LocalDate currentVersionReleaseDate;
	private LocalDate nextVersionReleaseDate;
	private String trialDays;
	private LangUsed langUsed;
	private double minProcessorSpeed;
	private double minRamSpaceRequired;
	private boolean internetNeeded;
	private int ageLimit;
	private int noOfDownloads;
	private int rating;
	private String osTypeSupported;

	public ApplicationDTO() {
		System.out.println("no-org constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getFirstVersionReleaseDate() {
		return firstVersionReleaseDate;
	}

	public void setFirstVersionReleaseDate(LocalDate firstVersionReleaseDate) {
		this.firstVersionReleaseDate = firstVersionReleaseDate;
	}

	public LocalDate getCurrentVersionReleaseDate() {
		return currentVersionReleaseDate;
	}

	public void setCurrentVersionReleaseDate(LocalDate currentVersionReleaseDate) {
		this.currentVersionReleaseDate = currentVersionReleaseDate;
	}

	public LocalDate getNextVersionReleaseDate() {
		return nextVersionReleaseDate;
	}

	public void setNextVersionReleaseDate(LocalDate nextVersionReleaseDate) {
		this.nextVersionReleaseDate = nextVersionReleaseDate;
	}

	public String getTrialDays() {
		return trialDays;
	}

	public void setTrialDays(String trialDays) {
		this.trialDays = trialDays;
	}

	public LangUsed getLangUsed() {
		return langUsed;
	}

	public void setLangUsed(LangUsed langUsed) {
		this.langUsed = langUsed;
	}

	public double getMinProcessorSpeed() {
		return minProcessorSpeed;
	}

	public void setMinProcessorSpeed(double minProcessorSpeed) {
		this.minProcessorSpeed = minProcessorSpeed;
	}

	public double getMinRamSpaceRequired() {
		return minRamSpaceRequired;
	}

	public void setMinRamSpaceRequired(double minRamSpaceRequired) {
		this.minRamSpaceRequired = minRamSpaceRequired;
	}

	public boolean isInternetNeeded() {
		return internetNeeded;
	}

	public void setInternetNeeded(boolean internetNeeded) {
		this.internetNeeded = internetNeeded;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public int getNoOfDownloads() {
		return noOfDownloads;
	}

	public void setNoOfDownloads(int noOfDownloads) {
		this.noOfDownloads = noOfDownloads;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getOsTypeSupported() {
		return osTypeSupported;
	}

	public void setOsTypeSupported(String osTypeSupported) {
		this.osTypeSupported = osTypeSupported;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ageLimit, createdDate, currentVersionReleaseDate, developedBy, firstVersionReleaseDate,
				internetNeeded, langUsed, minProcessorSpeed, minRamSpaceRequired, name, nextVersionReleaseDate,
				noOfDownloads, osTypeSupported, price, rating, size, trialDays, type, version);
	}
	

	public ApplicationDTO(String name, double version, LocalDate createdDate, double size, String developedBy,
			Type type, int price, LocalDate firstVersionReleaseDate, LocalDate currentVersionReleaseDate,
			LocalDate nextVersionReleaseDate, String trialDays, LangUsed langUsed, double minProcessorSpeed,
			double minRamSpaceRequired, boolean internetNeeded, int ageLimit, int noOfDownloads, int rating,
			String osTypeSupported) {
		super();
		this.name = name;
		this.version = version;
		this.createdDate = createdDate;
		this.size = size;
		this.developedBy = developedBy;
		this.type = type;
		this.price = price;
		this.firstVersionReleaseDate = firstVersionReleaseDate;
		this.currentVersionReleaseDate = currentVersionReleaseDate;
		this.nextVersionReleaseDate = nextVersionReleaseDate;
		this.trialDays = trialDays;
		this.langUsed = langUsed;
		this.minProcessorSpeed = minProcessorSpeed;
		this.minRamSpaceRequired = minRamSpaceRequired;
		this.internetNeeded = internetNeeded;
		this.ageLimit = ageLimit;
		this.noOfDownloads = noOfDownloads;
		this.rating = rating;
		this.osTypeSupported = osTypeSupported;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDTO other = (ApplicationDTO) obj;
		return ageLimit == other.ageLimit && Objects.equals(createdDate, other.createdDate)
				&& Objects.equals(currentVersionReleaseDate, other.currentVersionReleaseDate)
				&& Objects.equals(developedBy, other.developedBy)
				&& Objects.equals(firstVersionReleaseDate, other.firstVersionReleaseDate)
				&& internetNeeded == other.internetNeeded && Objects.equals(langUsed, other.langUsed)
				&& Double.doubleToLongBits(minProcessorSpeed) == Double.doubleToLongBits(other.minProcessorSpeed)
				&& Double.doubleToLongBits(minRamSpaceRequired) == Double.doubleToLongBits(other.minRamSpaceRequired)
				&& Objects.equals(name, other.name)
				&& Objects.equals(nextVersionReleaseDate, other.nextVersionReleaseDate)
				&& noOfDownloads == other.noOfDownloads && Objects.equals(osTypeSupported, other.osTypeSupported)
				&& price == other.price && rating == other.rating
				&& Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size)
				&& Objects.equals(trialDays, other.trialDays) && Objects.equals(type, other.type)
				&& Double.doubleToLongBits(version) == Double.doubleToLongBits(other.version);
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", /nversion=" + version + ", /ncreatedDate=" + createdDate
				+ ", /nsize=" + size + ", /ndevelopedBy=" + developedBy + ", /ntype=" + type + ", /nprice=" + price
				+ ", /nfirstVersionReleaseDate=" + firstVersionReleaseDate + ", /ncurrentVersionReleaseDate="
				+ currentVersionReleaseDate + ", /nnextVersionReleaseDate=" + nextVersionReleaseDate + ", /ntrialDays="
				+ trialDays + ", /nlangUsed=" + langUsed + ", /nminProcessorSpeed=" + minProcessorSpeed
				+ ", /nminRamSpaceRequired=" + minRamSpaceRequired + ", /ninternetNeeded=" + internetNeeded
				+ ", /nageLimit=" + ageLimit + ", /nnoOfDownloads=" + noOfDownloads + ", /nrating=" + rating
				+ ", /nosTypeSupported=" + osTypeSupported + "]";
	}

}
