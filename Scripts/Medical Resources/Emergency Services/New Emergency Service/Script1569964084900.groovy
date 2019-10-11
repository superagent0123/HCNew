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

WebUI.delay(5)

WebUI.comment('Login account')

WebUI.setText(findTestObject('Login/Username'), 'superagent@warriors')

WebUI.setText(findTestObject('Login/Password'), 'Tester2019!')

WebUI.click(findTestObject('Login/Login Button'))

WebUI.delay(10)

WebUI.comment('Go to Emergency Service Page')

WebUI.navigateToUrl('https://qa.medisource.com/emergency/services')

WebUI.delay(5)

WebUI.comment('Open the form for adding emergency service')

WebUI.click(findTestObject('Medical Resources/Emergency Services/new_emergency'))

WebUI.delay(2)

WebUI.comment('Click Add Category button')

WebUI.click(findTestObject('Medical Resources/Emergency Services/New Emergency Service/Add Category/add_category_btn'))

WebUI.delay(2)

WebUI.comment('Cancel category')

WebUI.click(findTestObject('Medical Resources/Emergency Services/New Emergency Service/Add Category/cancel'))

WebUI.delay(2)

WebUI.comment('Add a category')

WebUI.click(findTestObject('Medical Resources/Emergency Services/New Emergency Service/Add Category/add_category_btn'))

WebUI.setText(findTestObject('Medical Resources/Emergency Services/New Emergency Service/Add Category/title'), 'Gas Company')

WebUI.click(findTestObject('Medical Resources/Emergency Services/New Emergency Service/Add Category/save'))

WebUI.delay(3)

WebUI.comment('Delete the category')

WebUI.click(findTestObject('Medical Resources/Emergency Services/New Emergency Service/Add Category/delete'))

WebUI.click(findTestObject('Medical Resources/Emergency Services/New Emergency Service/Add Category/del_con_yes'))

WebUI.delay(3)

WebUI.comment('Add category again')

WebUI.click(findTestObject('Medical Resources/Emergency Services/New Emergency Service/Add Category/add_category_btn'))

WebUI.setText(findTestObject('Medical Resources/Emergency Services/New Emergency Service/Add Category/title'), 'Gas Company')

WebUI.click(findTestObject('Medical Resources/Emergency Services/New Emergency Service/Add Category/save'))

WebUI.delay(2)

WebUI.comment('Edit the category')

WebUI.click(findTestObject('Medical Resources/Emergency Services/New Emergency Service/Add Category/edit'))

WebUI.setText(findTestObject('Medical Resources/Emergency Services/New Emergency Service/Add Category/title'), 'Transportation Company')

WebUI.click(findTestObject('Medical Resources/Emergency Services/New Emergency Service/Add Category/save'))

WebUI.delay(2)

WebUI.comment('Set text for other fields and save')

WebUI.setText(findTestObject('Medical Resources/Emergency Services/New Emergency Service/name'), 'sample name')

WebUI.setText(findTestObject('Medical Resources/Emergency Services/New Emergency Service/phone_num'), '09179274824')

WebUI.setText(findTestObject('Medical Resources/Emergency Services/New Emergency Service/other_phone'), '09954755939')

WebUI.click(findTestObject('Medical Resources/Emergency Services/New Emergency Service/save_emergency'))

WebUI.delay(2)

WebUI.comment('Set text for name field')

WebUI.setText(findTestObject('Medical Resources/Emergency Services/New Emergency Service/name'), 'asdfghjkl')

WebUI.delay(2)

WebUI.comment('discard changes then cancel')

WebUI.click(findTestObject('Medical Resources/Emergency Services/New Emergency Service/discard_changes'))

WebUI.click(findTestObject('Medical Resources/Emergency Services/New Emergency Service/discard_cancel'))

WebUI.delay(2)

WebUI.comment('discard changes and confirm')

WebUI.click(findTestObject('Medical Resources/Emergency Services/New Emergency Service/discard_changes'))

WebUI.click(findTestObject('Medical Resources/Emergency Services/New Emergency Service/discard_confirmation'))

WebUI.delay(2)

WebUI.comment('Sign out')

WebUI.click(findTestObject('User Profile/user_profile'))

WebUI.click(findTestObject('User Profile/sign_out'))

