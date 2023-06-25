import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.waitForPageLoad(10)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Model Decision Objects/Radio Button - Telkom Looking for Partner'))

WebUI.click(findTestObject('Model Decision Objects/Radio Button - No JIK Payung'))

WebUI.selectOptionByValue(findTestObject('Model Decision Objects/Partnership Model'), '1', true)

WebUI.selectOptionByValue(findTestObject('Model Decision Objects/Partnership Flow'), 'nonPartnership', true)

WebUI.selectOptionByValue(findTestObject('Model Decision Objects/Companion'), '10078495', true)

WebUI.selectOptionByValue(findTestObject('Model Decision Objects/Priority'), 'high', true)

WebUI.setText(findTestObject('Model Decision Objects/Comment'), 'Test Comment by automated test run')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Model Decision Objects/button_Submit'))

WebUI.click(findTestObject('Model Decision Objects/button_Yes, create'))

WebUI.click(findTestObject('Model Decision Objects/button_OK'))

WebUI.click(findTestObject('Model Decision Objects/Model Dec View Partnership'))

WebUI.scrollToPosition(1700, 25)

not_run: WebUI.verifyElementVisible(findTestObject('null'))

not_run: WebUI.click(findTestObject('null'))

WebUI.waitForPageLoad(10)

not_run: WebUI.verifyElementPresent(findTestObject('null'), 10)

WebUI.takeFullPageScreenshot()

