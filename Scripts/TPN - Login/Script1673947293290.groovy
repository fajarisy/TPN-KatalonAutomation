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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tpn-dev.digipart.id/v3/login')

WebUI.maximizeWindow()

'Initial State Evidence'
WebUI.takeFullPageScreenshot()

'Cek apakah field "Input Email" tampil pada layar'
WebUI.verifyElementVisible(findTestObject('Login Page Objects/input__email'), FailureHandling.STOP_ON_FAILURE)

'Pengecekan nama field Input email sesuai dengan value "E-mail / NIK *"'
WebUI.verifyElementText(findTestObject('Login Page Objects/Input Email Title Only'), 'E-mail / NIK *', FailureHandling.CONTINUE_ON_FAILURE)

'Capture field "E-mail / NIK *" for Evidence (Before Input) :'
WebUI.takeElementScreenshot(findTestObject('Login Page Objects/Input Email Field With Title'))

'Input field "E-mail / NIK*  dengan Email/NIK User'
WebUI.setText(findTestObject('Object Repository/Login Page Objects/input__email'), GlobalVariable.Email)

'Capture field "E-mail / NIK *" for Evidence (After Input) :'
WebUI.takeElementScreenshot(findTestObject('Login Page Objects/Input Email Field With Title'))

'Pengecekan nama field Input email sesuai dengan value "Password *"'
WebUI.verifyElementText(findTestObject('Login Page Objects/Input Password Title Only'), 'Password *', FailureHandling.CONTINUE_ON_FAILURE)

'Capture field "Password *" for Evidence (Before Input) :'
WebUI.takeElementScreenshot(findTestObject('Login Page Objects/Input Password Title Only'))

'User input password'
WebUI.setEncryptedText(findTestObject('Object Repository/Login Page Objects/input__password'), 'TCdEHGtpZOB9RGd04yx5DA==')

'Capture field "Password *" for Evidence (After Input) :'
WebUI.takeElementScreenshot(findTestObject('Login Page Objects/input__password'))

'User klik show password'
WebUI.click(findTestObject('Object Repository/Login Page Objects/svg__field-icon'))

'Caputre full screen evidence'
WebUI.takeFullPageScreenshot()

'User klik tombol Login'
WebUI.click(findTestObject('Login Page Objects/Button Login'))

'Verifikasi user sudah masuk halaman dashboard'
WebUI.verifyElementText(findTestObject('Login Page Objects/Welcome Text Dashboard'), 'DDS ADMIN')

'User sukses Login'
WebUI.takeFullPageScreenshot()

