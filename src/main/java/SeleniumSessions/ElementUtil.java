package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil 
{
	private WebDriver driver;
	//1 arg constructor : create to solve null pointer ref issue of driver
	public ElementUtil(WebDriver driver)
	{
		this.driver = driver;
		
	}
	public By getBy(String locatorType,String locatorvalue)
	{
		By locator=null;
		switch(locatorType.toLowerCase())
		{
		case "id" :
					locator = By.id(locatorvalue);
					break;
		case "name" :
					locator = By.name(locatorvalue);
					break;
		case "classname" :
					locator = By.className(locatorvalue);
					break;
		case "xpath" :
					locator = By.xpath(locatorvalue);
					break;
		case "cssselector" :
					locator = By.cssSelector(locatorvalue);
					break;
		case "linktext" :
					locator = By.linkText(locatorvalue);
					break;
		case "partiallinktext" :
					locator = By.partialLinkText(locatorvalue);
					break;
		case "tagname" :
					locator = By.tagName(locatorvalue);
					break;
		default :
					System.out.println("Please enter valid locator...");
					break;
		}
		return locator;
	}
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public WebElement getElement(String locatorType,String locatorvalue)
	{
		return driver.findElement(getBy(locatorType,locatorvalue));
	}
	public List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	public void doSendKeys(By locator,String value)
	{
		 getElement(locator).sendKeys(value);
	}
	public void doSendKeys(String locatorType,String locatorvalue,String value)
	{
		 getElement(getBy(locatorType,locatorvalue)).sendKeys(value);
	}
	public void doClick(By locator)
	{
		getElement(locator).click();
	}
	public void doClick(String locatorType,String locatorvalue)
	{
		 getElement(getBy(locatorType,locatorvalue)).click();
	}
	public String doGetText(By locator)
	{
		return getElement(locator).getText();
	}
	public String getAttributeValue(By locator,String attrName)
	{
		 String attrVal =  getElement(locator).getAttribute(attrName);
		 System.out.println(attrVal);
		 return attrVal;
	}
	public boolean doIsDisplayed(By locator)
	{
		return driver.findElement(locator).isDisplayed();
	}
	public  boolean isElementExists(By locator)
	{
		int elementCount = getElementsCount(locator);
		System.out.println("total elements found " +elementCount);
			if(elementCount >= 1) {
				System.out.println("Element is found.."+ locator);
				return true;
			}
			else {
				System.out.println("Element is not found.."+ locator);
				return false;
			}
	}
	public int getElementsCount(By locator)
	{
		return getElements(locator).size();
	}
	public List<String> getElementsTextList(By locator)
	{
		List<WebElement> eleList = getElements(locator);
		List<String> textList = new ArrayList<String>();
		for(WebElement e:eleList)
		{
			if(!e.getText().isEmpty())
			{
				textList.add(e.getText());
			}
		}
		return textList;
	  
	}
	public List<String> getAttributeList(By locator,String attrName)
	{
		List<WebElement> eleList = getElements(locator);
		List<String> attrList = new ArrayList<String>();
		for(WebElement e:eleList)
		{
			String attrValue = e.getAttribute(attrName);
			attrList.add(attrValue);
		}
		return attrList;
	}
	public void printElementValue(List<String> eleList)
	{
		 for(String e:eleList)
		 {
			 System.out.println(e);
		 }
	}
	//************************* DropDown Utils **************************//
	public void doDropDownSelectByIndex(By locator,int index)
	{
		Select select = new Select(getElement(locator));
		
		select.selectByIndex(index);
	}
	public void doDropDownSelectByVisibleText(By locator,String text)
	{
		Select select = new Select(getElement(locator));
		
		select.selectByVisibleText(text);
	}
	public void doDropDownSelectByValue(By locator,String value)
	{
		Select select = new Select(getElement(locator));
		
		select.selectByValue(value);
	}
	public void doSelectDropDownValue(By locator,String value)
	{
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		
		for(WebElement e:optionsList )
		{
			String countryName = e.getText();
			System.out.println(countryName);
			if(countryName.equals(value))
			{
				e.click();
				break;
			}
		}
		
	}
	public void selectDropDownValueWithoutSelect(By locator,String value)
	{
		List<WebElement> optionsList = getElements(locator);
		System.out.println(optionsList.size());
		for(WebElement e:optionsList)
		{
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value))
			{
				e.click();
				break;
			}
		}
	}
	
}
