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

WebUI.waitForElementPresent(findTestObject('Initiation Objects/path'), 30)

WebUI.takeFullPageScreenshot()

'Click Initiaton Menu'
WebUI.click(findTestObject('Object Repository/Initiation Objects/path'))

WebUI.waitForElementPresent(findTestObject('Initiation Objects/span_Create New'), 30)

'Click Create New Button'
WebUI.click(findTestObject('Object Repository/Initiation Objects/span_Create New'))

WebUI.waitForPageLoad(10)

WebUI.waitForJQueryLoad(10)

WebUI.takeFullPageScreenshot()

'Input Partnership Title'
WebUI.setText(findTestObject('Object Repository/Initiation Objects/input__title'), 'Test Partnership PKS Fajar #2 26-01-2023')

WebUI.click(findTestObject('Initiation Objects/Product Category'))

'Click product category options "Digital Advertising"'
WebUI.click(findTestObject('Initiation Objects/div_Digital Advertising'))

'Click option JIK Payung "No"'
WebUI.click(findTestObject('Object Repository/Initiation Objects/input_Yes_jikpayung-existing'))

'Check Time Period is present after click JIK Payung - no'
WebUI.verifyElementPresent(findTestObject('Initiation Objects/input__period'), 10)

'Input time Period'
WebUI.setText(findTestObject('Object Repository/Initiation Objects/input__period'), '12')

'Input Text Partnership Descriptions'
WebUI.setText(findTestObject('Object Repository/Initiation Objects/textarea_Automated Test Run'), 'Automated Test Run')

WebUI.takeFullPageScreenshot()

'Click button "Submit"'
WebUI.click(findTestObject('Object Repository/Initiation Objects/button_SUBMIT'))

'Click konfirm "Yes"'
WebUI.click(findTestObject('Object Repository/Initiation Objects/button_yes, create'))

WebUI.waitForPageLoad(10)

WebUI.verifyElementText(findTestObject('Initiation Objects/Approval Status'), 'Waiting')

WebUI.scrollToPosition(1700, 25)

WebUI.verifyElementClickable(findTestObject('Initiation Objects/Approve Initiation Button'))

WebUI.click(findTestObject('Initiation Objects/Approve Initiation Button'))

