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

WebUI.sendKeys(findTestObject('Object Repository/Login Page/Username Text Field'), Email)

WebUI.sendKeys(findTestObject('Object Repository/Login Page/Password Text Field'), Password)

WebUI.click(findTestObject('Object Repository/Login Page/Log In Button'))

Thread.sleep(10000)

/*
String Windowtitle = WebUI.getWindowTitle()

println Windowtitle
*/

WebUI.click("findTestObject('Object Repository/Engage Page/Header/Posts Tab In Header')")

Thread.sleep(5000)

WebUI.click("findTestObject('Object Repository/Posts Page/Create Dropdown Button')")

WebUI.click("findTestObject('Object Repository/Posts Page/Create Post Option Of Create Dropdown')")

Thread.sleep(10000)