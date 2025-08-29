package Youtube;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YoutubePlaylist {
@FindBy(xpath = "(//*[@class='yt-icon-shape style-scope yt-icon ytSpecIconShapeHost'])[4]")private WebElement home;


private WebDriver driver;

public YoutubePlaylist(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void homeIcon() {
	home.click();
	
}


}
