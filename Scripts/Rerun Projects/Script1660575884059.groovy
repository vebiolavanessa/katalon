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

WebUI.click(findTestObject('Object Repository/Rerun Projects/div_MgSchema'))

WebUI.click(findTestObject('Object Repository/Rerun Projects/svg_Type Newtable_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/Rerun Projects/li_Delete'))

WebUI.click(findTestObject('Object Repository/Rerun Projects/span_ok'))

WebUI.click(findTestObject('Object Repository/Rerun Projects/span_Rerun'))

WebUI.delay(200)

WebUI.click(findTestObject('Object Repository/Rerun Projects/span_MgSchema'))

WebUI.click(findTestObject('Object Repository/Rerun Projects/span_Create New Type'))

WebUI.setText(findTestObject('Object Repository/Rerun Projects/input_Table Name_tableName'), 'newtable')

WebUI.click(findTestObject('Object Repository/Rerun Projects/span_Create'))

WebUI.click(findTestObject('Object Repository/Rerun Projects/span_Rerun'))

WebUI.delay(200)

WebUI.click(findTestObject('Object Repository/Rerun Projects/div_MgTable'))

WebUI.click(findTestObject('Object Repository/Rerun Projects/span_newtables'))

WebUI.closeBrowser()