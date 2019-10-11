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

WebUI.delay(3)

WebUI.navigateToUrl('https://qa.medisource.com/patientcare/9B1E9547-DAF3-40F4-820E-C5881066FBCA/C8456552-AA09-4EBF-B4EC-9A3EB6FBF25B/2019/oasis/clinical/roc/B8A507ED-973F-4CB5-82DB-48318F1127A4/9B1E9547-DAF3-40F4-820E-C5881066FBCA')

WebUI.delay(10)

WebUI.click(findTestObject('OASIS_ROC/Visit_Date'))

WebUI.setText(findTestObject('OASIS_ROC/Visit_Date'), '10/09/2019')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_ROC/Timein'))

WebUI.setText(findTestObject('OASIS_ROC/Timein'), '01:00')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_ROC/Timeout'))

WebUI.acceptAlert()

WebUI.setText(findTestObject('OASIS_ROC/Timeout'), '02:00')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_ROC/Clinical_Records/M0014'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_ROC/Clinical_Records/M0014_AK'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_ROC/Clinical_Records/M0014'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_ROC/Clinical_Records/M0014_AL'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_ROC/Clinical_Records/M0016'))

