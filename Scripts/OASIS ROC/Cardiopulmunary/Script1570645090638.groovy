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

WebUI.openBrowser('https://qa.medisource.com')

WebUI.delay(10)

WebUI.comment('Login')

WebUI.setText(findTestObject('Login/Username'), 'superagent@warriors')

WebUI.setText(findTestObject('Login/Password'), 'Tester2019!')

WebUI.click(findTestObject('Login/Login Button'))

WebUI.delay(20)

WebUI.comment('Select a Patient')

WebUI.navigateToUrl('https://qa.medisource.com/patientcare/5C5BB14F-F7BD-4655-89A9-C250D73000BE/4C5141CF-C978-4A1B-983A-0E198DC584D2/2019/oasis/cardio/roc/5B22BC45-3627-4664-BD10-6AC4A8CC0204/5C5BB14F-F7BD-4655-89A9-C250D73000BE')

WebUI.delay(20)

WebUI.comment('Respiratory Status')

WebUI.check(findTestObject('OASIS ROC/Cardiopulmunary/Respiratory Status/Breath Sounds Clear - Yes'))

WebUI.delay(2)

WebUI.check(findTestObject('OASIS ROC/Cardiopulmunary/Respiratory Status/Breath Sounds Clear - NO'))

WebUI.delay(2)

WebUI.check(findTestObject('OASIS ROC/Cardiopulmunary/Respiratory Status/Cough - NO'))

WebUI.delay(2)

WebUI.check(findTestObject('OASIS ROC/Cardiopulmunary/Respiratory Status/Cough - YES'))

WebUI.delay(2)

WebUI.comment('If YES (cough) is checked')

WebUI.comment('Special Procedure')

WebUI.check(findTestObject('OASIS ROC/Cardiopulmunary/Respiratory Status/Special Procedure - Oxygen_use'))

WebUI.delay(2)

WebUI.check(findTestObject('OASIS ROC/Cardiopulmunary/Respiratory Status/Special Procedure - Tracheostomy'))

WebUI.delay(2)

WebUI.check(findTestObject('OASIS ROC/Cardiopulmunary/Respiratory Status/Special Procedure - Ventilator'))

WebUI.delay(2)

WebUI.check(findTestObject('OASIS ROC/Cardiopulmunary/Respiratory Status/Special Procedure - PleurX_catheter'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS ROC/Cardiopulmunary/Respiratory Status/Special Procedure - Other'), 'sample')

