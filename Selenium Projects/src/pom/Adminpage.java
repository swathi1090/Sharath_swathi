package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adminpage {

	@FindBy(linkText = "Admin")
	WebElement admin;

	@FindBy(linkText = "PIM")
	WebElement pim;

	@FindBy(linkText = "Leave")
	WebElement leave;

	@FindBy(linkText = "Time")
	WebElement time;

	@FindBy(linkText = "Recruitment")
	WebElement recruitment;

	@FindBy(linkText = "Performance")
	WebElement performance;

	@FindBy(linkText = "Directory")
	WebElement directory;

	@FindBy(linkText = "Dashboard")
	WebElement dashboard;

	@FindBy(partialLinkText = "Welcome")
	WebElement WelcomeAdmin;

	@FindBy(linkText = "About")
	WebElement about;

	@FindBy(linkText = "Logout")
	WebElement logout;

	public void Adminclick() {

		admin.click();
	}

	public void pimclick() {

		pim.click();
	}

	public void timeclick() {

		time.click();
	}

	public void Recruitmentclick() {

		recruitment.click();
	}

	public void performanceclick() {

		performance.click();
	}

	public void leaveclick() {

		leave.click();
	}

	public void Dashboardclick() {

		dashboard.click();
	}

	public void directoryclick() {

		directory.click();
	}

	public void welcomeadminclick() {

		WelcomeAdmin.click();
	}

	public void Logoutclick() {

		logout.click();
	}

	public void Aboutclick() {

		about.click();
	}

}
