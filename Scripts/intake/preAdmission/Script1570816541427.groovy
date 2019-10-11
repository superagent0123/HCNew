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
import org.openqa.selenium.Keys as Keys

//proceeding directly to add patienbt
'clicking the add patient on patient manager menu'
WebUI.navigateToUrl('https://app.medisource.com/patient')

WebUI.delay(5)

WebUI.click(findTestObject('addPatient/SKIP'))

WebUI.delay(5)

//referral date,MR# and SOC date information
'clicking the datepicker icon'
WebUI.setText(findTestObject('addPatient/datePicker'), '01012019')

not_run: WebUI.delay(3)

'selecting current date'
WebUI.setText(findTestObject('addPatient/refTime'), '1000')

WebUI.delay(2)

WebUI.click(findTestObject('addPatient/mrnCheckbox1'))

'clicking the same as referral date button'
WebUI.click(findTestObject('addPatient/button_Same as Referral Date'))

//end of referral date,MR# and SOC date information
//adding of patient information
'input last name'
WebUI.setText(findTestObject('addPatient/input_Last Name_last_name'), 'John Automated')

WebUI.setText(findTestObject('addPatient/input_First Name_first_name'), 'Medisource')

//branch('master').of( //github.com/superagent0123/healthcareProject.git
//   )
WebUI.setText(findTestObject('addPatient/input_Middle Initial_mi'), 'F')

'input suffix'
WebUI.setText(findTestObject('addPatient/input_Suffix_suffix'), 'Jr')

'to delay for proceeding or clicking the date picker icon'
WebUI.delay(2)

'clicking the datepicker icon'
not_run: WebUI.click(findTestObject('addPatient/intakeBdayDatePicker'))

'select current date'
WebUI.setText(findTestObject('addPatient/intakeBdayDatePickerItem'), '01011950')

'to delay the viewing of selected item on calendar....'
WebUI.delay(2)

'check box male selected'
WebUI.click(findTestObject('addPatient/intakeGenderMale'))

'opening the dropdown on marital status'
WebUI.click(findTestObject('addPatient/a_SELECT ONE'))

'selecting "Single"'
WebUI.click(findTestObject('addPatient/li_Single'))

'opening the dropdown for ethnicity'
WebUI.click(findTestObject('addPatient/intakeEthnicity'))

'selecting the first item on the list'
WebUI.click(findTestObject('addPatient/intakeEtnicitySelect1'))

WebUI.delay(2)

WebUI.click(findTestObject('addPatient/intakeLanguageSpoken'))

WebUI.delay(2)

WebUI.click(findTestObject('addPatient/intakeLanguageSpoken1'))

WebUI.delay(2)

WebUI.setText(findTestObject('addPatient/intakeSSN'), '758755169')

not_run: branch('master').of( //github.com/superagent0123/healthcareProject.git
	//end of adding patient information
	)

//adding of patient address
WebUI.setText(findTestObject('addPatient/input_Address Line 1_main_line'), '653 South Manchester Ave. ')

WebUI.setText(findTestObject('addPatient/intakeAddress2'), '244 Wild Rose Avenue Bell Flower, CA 90706')

WebUI.setText(findTestObject('addPatient/intakeAddStreet'), '9 Bayport Dr. ')

WebUI.setText(findTestObject('addPatient/intakeAddCity'), 'Los Angeles')

WebUI.click(findTestObject('addPatient/intakeAddState'))

WebUI.delay(2)

WebUI.click(findTestObject('addPatient/intakeAddState1'))

WebUI.delay(5)

WebUI.setText(findTestObject('addPatient/intakeAddZip'), '90063')

WebUI.setText(findTestObject('addPatient/intakeAddPhone'), '3256452189')

WebUI.setText(findTestObject('addPatient/intakeAddPhone2'), '3259865478')

WebUI.setText(findTestObject('addPatient/intakeAddEmail'), 'myemail@mailintaor.com')

WebUI.delay(3)

//end of adding patient information
//start of Service Delivery Address
WebUI.click(findTestObject('addPatient/intakeAddServiceDeliveryButton'))

WebUI.delay(3)

//start of Living Situation
'clicking the "Lives alone" on living arrangement'
WebUI.click(findTestObject('addPatient/intakeLivingSituationArrangement'))

'clicking the "Round-the-clock" on assistance'
WebUI.click(findTestObject('addPatient/intakeLivingSituationAssistance'))

'adding caregiver name'
WebUI.setText(findTestObject('addPatient/intakeLivingSituationCaregiverName'), 'Jacinto Escano')

//end of Living Situation
WebUI.delay(3)

//Start of Emergency Contact
WebUI.setText(findTestObject('addPatient/intakeEmergencyName'), 'jacinti lolo')

WebUI.setText(findTestObject('addPatient/intakeEmergencyRelationship'), 'grandpa')

WebUI.setText(findTestObject('addPatient/intakeEmergencyPhone1'), '6589745621')

WebUI.setText(findTestObject('addPatient/intakeEmergencyPhone2'), '6352489745')

//End of Emergency Contact
WebUI.delay(3)

WebUI.click(findTestObject('addPatient/intakePhysicianInfoAttending'))

WebUI.click(findTestObject('addPatient/intakePhysicianInfoAttendingIndex2'))

WebUI.delay(2)

WebUI.click(findTestObject('addPatient/intakePhysicianInfoPrimary'))

WebUI.click(findTestObject('addPatient/intakePhysicianInfoPrimaryIndex2'))

WebUI.delay(2)

WebUI.click(findTestObject('addPatient/intakePhysicianInfoOther'))

WebUI.delay(2)

WebUI.click(findTestObject('addPatient/intakePhysicianInfoOtherIndex2'))

WebUI.delay(5)

WebUI.click(findTestObject('addPatient/intakeInsuranceInfoPrimary'))

WebUI.delay(3)

WebUI.click(findTestObject('addPatient/intakeInsuranceInfoPrimaryMedicareTraditional'))

WebUI.delay(3)

WebUI.setText(findTestObject('addPatient/IntakeInsuranceInfoPrimaryNumber'), '524365987')

WebUI.delay(3)

not_run: WebUI.click(findTestObject('addPatient/intakeInsuranceInfoSecondary'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('addPatient/IntakeInsuranceInfoSecondaryIndex2'))

not_run: WebUI.delay(3)

not_run: WebUI.setText(findTestObject('addPatient/IntakeInsuranceInfoSecondaryNumber'), '356487924')

not_run: WebUI.delay(5)

WebUI.click(findTestObject('addPatient/IntakeReferralInfoTypeofAdmission'))

WebUI.click(findTestObject('addPatient/IntakeReferralInformationTypeOfAdmissionIndex1'))

WebUI.delay(3)

WebUI.click(findTestObject('addPatient/intakeReferralInfoAdmissionSource'))

WebUI.delay(3)

WebUI.click(findTestObject('addPatient/intakeReferralInfoAdmissionSourceIndex1'))

WebUI.delay(3)

WebUI.click(findTestObject('addPatient/intakeReferralInfoTypeOfReferral'))

WebUI.delay(3)

WebUI.click(findTestObject('addPatient/intakeReferralInfoTypeOfReferrlaIndex1'))

WebUI.delay(3)

WebUI.click(findTestObject('addPatient/intakeReferralInfoReferralSource'))

WebUI.delay(5)

WebUI.click(findTestObject('addPatient/intakeReferralInfoReferralSourceIndex1'))

WebUI.delay(8)

not_run: WebUI.click(findTestObject('addPatient/intakeHospitalizationInfo'))

not_run: WebUI.delay(8)

not_run: WebUI.click(findTestObject('addPatient/intakeHospitalizationInfoIndex1'))

not_run: WebUI.delay(5)

not_run: WebUI.setText(findTestObject('addPatient/intakeHospitalizationInfoFacilityAdmitDate'), '12122018')

not_run: WebUI.delay(5)

not_run: WebUI.setText(findTestObject('addPatient/intakeHospitalizationInfoFacilityDCdate'), '12302018')

not_run: WebUI.delay(5)

not_run: WebUI.setText(findTestObject('addPatient/intakeDiagandPreAdPrimary'), 'Primary Diagnosis')

//WebUI.sendKeys(findTestObject('addPatient/intakeDiagandPreAdSecondaryDiag'), 'diag1')
//for (int i=0;i<6; i++){
//WebUI.sendKeys(findTestObject('addPatient/intakeDiagandPreAdSecondaryDiag'), findTestData('secondaryDiag').getValue(1, 1))
//}
not_run: WebUI.delay(5)

not_run: WebUI.sendKeys(findTestObject('addPatient/intakeDiagandPreAdSecondaryDiag'), Keys.chord('diag2', Keys.ENTER))

//WebUI.sendKeys(findTestObject('txt_Comment'), Keys.chord(Keys.CONTROL, 'a'))
not_run: WebUI.delay(5)

not_run: WebUI.sendKeys(findTestObject('addPatient/intakeDiagandPreAdSecondaryDiag'), Keys.chord('diag44444', Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/addPatient/button_Save'))
not_run: WebUI.delay(5)

WebUI.setText(findTestObject('addPatient/intakeDiagandPreAdSurgery'), 'heart surgery')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('addPatient/intakeDiagandPreAdAllergy'), Keys.chord('allergy1', Keys.ENTER))

WebUI.sendKeys(findTestObject('addPatient/intakeDiagandPreAdAllergy'), Keys.chord('allergy2', Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('addPatient/intakeDiagandPreAdOrders'), '1w9 rn, 2w2 pt, 3w3 ot')

not_run: WebUI.click(findTestObject('addPatient/intakeDiagandPreAdIV'))

WebUI.click(findTestObject('addPatient/intakeDiagandPreAdDME'))

WebUI.delay(3)

WebUI.click(findTestObject('addPatient/intakeDiagandPreAdDMEindex1'))

WebUI.click(findTestObject('addPatient/intakeM0080RN'))

WebUI.click(findTestObject('addPatient/intakeClinicalStaffRN'))

WebUI.delay(3)

WebUI.click(findTestObject('addPatient/intakeClinicalStaffRNMedisourceRN'))

WebUI.delay(3)

WebUI.click(findTestObject('addPatient/intakeClinicalStaffCM'))

WebUI.delay(3)

WebUI.click(findTestObject('addPatient/intakeClinicalStaffCMMedisourceCM'))

WebUI.delay(3)

WebUI.click(findTestObject('addPatient/button_Save'))

WebUI.delay(5)

