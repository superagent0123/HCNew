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

WebUI.setText(findTestObject('Login/Username'), 'superagent@warriors')

WebUI.setText(findTestObject('Login/Password'), 'Tester2019!')

WebUI.click(findTestObject('Login/Login Button'))

WebUI.delay(3)

WebUI.navigateToUrl('https://qa.medisource.com/emergency/services')

WebUI.delay(3)

WebUI.click(findTestObject('Medical Resources/Emergency Services/edit_emergency'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/Add Category/add_category'))

WebUI.setText(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/Add Category/title'), 'asdfghjkl')

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/Add Category/cancel'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/Add Category/add_category'))

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/Add Category/title'), 'sample')

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/Add Category/save'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/Add Category/delete'))

WebUI.click(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/Add Category/delete_confirm'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/Add Category/add_category'))

WebUI.setText(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/Add Category/title'), 'sample again')

WebUI.click(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/Add Category/save'))

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/Add Category/edit'))

WebUI.setText(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/Add Category/title'), 'Transportation Company')

WebUI.click(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/Add Category/save'))

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/name'), 'Emergency')

WebUI.setText(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/phone_num'), '09179274824')

WebUI.setText(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/other_phone'), '09954755939')

WebUI.delay(2)

WebUI.click(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/save_emergency'))

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/name'), 'changing')

WebUI.click(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/discard_changes'))

WebUI.click(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/discard_cancel'))

WebUI.delay(2)

WebUI.setText(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/name'), 'asdfghjkl')

WebUI.click(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/discard_changes'))

WebUI.click(findTestObject('Medical Resources/Emergency Services/Edit Emergency Service/discard_confirm'))

