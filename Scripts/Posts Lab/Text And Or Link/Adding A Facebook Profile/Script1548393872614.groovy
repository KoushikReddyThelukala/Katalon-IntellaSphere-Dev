import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

'Waiting Until The Page Gets Loaded.'
WebUI.waitForPageLoad(10)

'Calling The "User Login With Valid Credentials" Test Case To This Test Case'
WebUI.callTestCase(findTestCase('User Login Test Cases/User Login With Valid Credentials'), [('Email') : email, ('Password') : password], 
    FailureHandling.STOP_ON_FAILURE)

//CustomKeywords.'create.clickJS.refreshBrowser'()

'Clicking the "Posts" Tab in Header with the JScript.'
CustomKeywords.'create.clickJS.clickJavaScript'(findTestObject('Engage Page/Header/Posts Tab In Header'), 5)

Thread.sleep(5000)

'Clicking on the "Create" button.'
CustomKeywords.'create.clickJS.clickJavaScript'(findTestObject('Object Repository/Posts Page/Create Dropdown Button'), 5)

Thread.sleep(5000)

'Clicking The "Create Post" Option Of "Create" Dropdown.'
CustomKeywords.'create.clickJS.clickJavaScript'(findTestObject('Object Repository/Posts Page/Create Post Option Of Create Dropdown'), 
    5)

Thread.sleep(5000)

'Switching To The Create Content Popup iFrame.'
WebUI.switchToFrame(findTestObject('Posts Page/Create Posts/Creating Text And Or Link Posts Section/iframe Of Create Content Popup'), 5)

'Clicking on the "Add Profiles" button of Select Profile(S) popup.'
WebUI.click(findTestObject('Posts Page/Create Posts/Creating Text And Or Link Posts Section/Add Profiles Button In Select Profile(S) Popup'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Posts Page/Add Profiles/Facebook Section/a_Company Page(s)'))

'Clicking on the "Connect To Your Facebook Profiels" button.'
WebUI.click(findTestObject('Posts Page/Add Profiles/Facebook Section/Connect To Your Facebook Page(s)'))

WebUI.switchToWindowTitle("Facebook - Google Chrome")

WebUI.sendKeys(findTestObject('Posts Page/Add Profiles/Facebook Section/FB Login Popup/Email Or Phone Text Field'), "dvsaikumar")

WebUI.setEncryptedText(findTestObject('Posts Page/Add Profiles/Facebook Section/FB Login Popup/Password Text Field'), "lsnworks")

WebUI.click(findTestObject('Posts Page/Add Profiles/Facebook Section/FB Login Popup/Log In Button'))

