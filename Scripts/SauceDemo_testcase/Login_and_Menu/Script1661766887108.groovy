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

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.sendKeys(findTestObject('Amartha_testObject/username'), 'standard_user', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Amartha_testObject/Password'), 'secret_sauce')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Amartha_testObject/Submit'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Amartha_testObject/dashboard'), 0)

WebUI.selectOptionByValue(findTestObject('Amartha_testObject/Filter'), 'za', false)

WebUI.selectOptionByValue(findTestObject('Amartha_testObject/Filter'), 'hilo', false)

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Amartha_testObject/add_chart'))

WebUI.click(findTestObject('Amartha_testObject/chart_list'))

WebUI.click(findTestObject('Amartha_testObject/Remove_chart'))

WebUI.click(findTestObject('Amartha_testObject/Continue_shopping'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Amartha_testObject/add_chart2'))

WebUI.click(findTestObject('Amartha_testObject/chart_list'))

WebUI.click(findTestObject('Amartha_testObject/Checkout'))

WebUI.delay(5)

WebUI.setText(findTestObject('Amartha_testObject/First_name'), 'Rendy')

WebUI.setText(findTestObject('Amartha_testObject/Last_name'), 'Eduardi')

WebUI.setText(findTestObject('Amartha_testObject/Postal_code'), '1234')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Amartha_testObject/Submit_continue'))

WebUI.click(findTestObject('Amartha_testObject/Submit_finish'))

WebUI.click(findTestObject('Amartha_testObject/Back_Home'))

WebUI.click(findTestObject('Amartha_testObject/Open_menu'))

WebUI.click(findTestObject('Amartha_testObject/Log_out'))

