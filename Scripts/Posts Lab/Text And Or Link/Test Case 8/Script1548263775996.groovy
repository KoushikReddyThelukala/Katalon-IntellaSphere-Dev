import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.eclipse.jetty.util.security.Password as Password
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

'Waiting Until The Page Gets Loaded.'
WebUI.waitForPageLoad(10)

'Calling The "User Login With Valid Credentials" Test Case To This Test Case'
WebUI.callTestCase(findTestCase('User Login Test Cases/User Login With Valid Credentials'), [('Email') : email, ('Password') : password], 
    FailureHandling.STOP_ON_FAILURE)

'Clicking the "Posts" Tab in Header with the JScript.'
CustomKeywords.'create.clickJS.clickJavaScript'(findTestObject('Engage Page/Header/Posts Tab In Header'), 5)

Thread.sleep(3000)

'Clicking on the "Create" button.'
CustomKeywords.'create.clickJS.clickJavaScript'(findTestObject('Object Repository/Posts Page/Create Dropdown Button'), 5)

Thread.sleep(3000)

'Clicking The "Create Post" Option Of "Create" Dropdown.'
CustomKeywords.'create.clickJS.clickJavaScript'(findTestObject('Object Repository/Posts Page/Create Post Option Of Create Dropdown'), 
    5)

Thread.sleep(3000)

'Switching To The Create Content Popup iFrame.'
WebUI.switchToFrame(findTestObject('Posts Page/Create Posts/Creating Text And Or Link Posts Section/iframe Of Create Content Popup'), 
    5)

Thread.sleep(3000)

WebUI.click(findTestObject('Posts Page/Create Posts/Creating Text And Or Link Posts Section/Ok Button Of Select Profile(S) Popup'))

Thread.sleep(3000)

'Sending keys to the "Enter text and/or link to be published" text field'
WebUI.setText(findTestObject('Posts Page/Create Posts/Creating Text And Or Link Posts Section/Enter Text And Or Links To Be Published Text Field'), enterTextAndOrLink)

Thread.sleep(3000)

'Wait for the "Submit" button(element) to present/appear within the given time in second unit.'
WebUI.waitForElementPresent(findTestObject('Posts Page/Create Posts/Creating Text And Or Link Posts Section/Submit Button Of Create Text And Or Link To Be Published'), 5, FailureHandling.STOP_ON_FAILURE)

'Clicking on the "Submit" button of the "Create Post" popup.'
WebUI.click(findTestObject('Posts Page/Create Posts/Creating Text And Or Link Posts Section/Submit Button Of Create Text And Or Link To Be Published'))

Thread.sleep(10000)

'Clicking on the "Yes" button of the "Do You Want To Publish This Post" Popup.'
WebUI.click(findTestObject('Posts Page/Create Posts/Creating Text And Or Link Posts Section/Do You Want To Publish This Post Popup/Yes'))



