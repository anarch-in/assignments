B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.801
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private edtTxtAmount As EditText
	Private edtTxtDeposit As EditText
	Private edtTxtTerm As EditText
	Private lblResults As Label
	Private btnCalculate As Button
	Private btnClear As Button
	Private btnCarLoan As Button
	Private btnContact As Button
	Private btnHomeLoan As Button
	Private lblHeader As Label
	Private pnlContact As Panel
	Private pnlCalculator As Panel
	Private lblInterestInfo As Label
	Private lblDecimal As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("carLoan")
	

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub btnCarLoan_Click
	pnlCalculator.BringToFront
	lblHeader.Text = "Car Loan Calculator"
	lblInterestInfo.Text = "* Interest rate at 9.65% per annum"
	btnClear_Click
	
End Sub

Sub btnContact_Click
	pnlContact.BringToFront
	lblHeader.Text = "Contact Us"
End Sub

Sub btnHomeLoan_Click
	pnlCalculator.BringToFront	
	lblHeader.Text = "Home Loan Calculator"
	lblInterestInfo.Text = "* Interest at 4.95% for first 5 years, 6.95% for remaining years"
	btnClear_Click
End Sub

Sub btnClear_Click
	edtTxtAmount.Text = ""
	edtTxtDeposit.Text = ""
	edtTxtTerm.Text = ""
	lblResults.Text = "$0"
	lblDecimal.Text = ""
	edtTxtAmount.RequestFocus
End Sub

Sub btnCalculate_Click
	
	'variables
	Dim amount As Double
	Dim deposit As Double
	Dim repayment As Double
	Dim term As Double
	Dim final_term As Int
	Dim months As Int
	Dim str1 As String
	Dim total_amount As Double
	
	'constants
	Dim const INTEREST As Double = 0.0965
	Dim const INITIAL_INTEREST As Double = 0.0495
	Dim const FINAL_INTEREST As Double = 0.0695
	Dim const INITIAL_TERM As Int = 5
		
	' General validation checks - applies to both home loan and car loan fields
	If (edtTxtAmount.Text == "") Or (edtTxtDeposit.Text == "") Or (edtTxtTerm.Text == "") Then
		Msgbox("Please ensure all fields are filled before calculation","Error")
	Else If (edtTxtDeposit.Text >= edtTxtAmount.Text) Then
		Msgbox("Please Check Deposit amount.","Error")
	Else
		amount = edtTxtAmount.Text
		deposit = edtTxtDeposit.Text
		term = edtTxtTerm.Text 
		months = term * 12
		
		amount = amount - deposit
		
		'Car Loan calculation
		If (lblHeader.Text == "Car Loan Calculator") Then
			'Specific validation checks - applies only to car loan fields
			If (edtTxtAmount.Text > 700000) Then	'Restricts loan amount upto $700,000
				Msgbox("Bank holds a maximum lending amount of $700,000. Please call 1122334 for assistance.","Error")
			Else If (edtTxtTerm.Text > 7) Then		'Restricts loan term to within 7 years
				Msgbox("Loan Term must be within 7 years","Error")
			Else
				repayment = (((amount * INTEREST) * term) + amount) / months
				lblResults.Text = "$" & NumberFormat2(repayment,1,2,2,False)
				
			End If
			'Home Loan calculation
		Else
			If (edtTxtAmount.Text > 12000000) Then	'Restricts loan amount upto $12M
				Msgbox("Bank holds a maximum lending amount of $12 million. Please call 1122334 for assistance.","Error")
			Else If (edtTxtTerm.Text > 30) Then		'Restricts loan term to within 30 years
				Msgbox("Loan Term must be within 30 years","Error")
			Else
				final_term = term - INITIAL_TERM
			
				total_amount = (amount * INITIAL_INTEREST * INITIAL_TERM) + (amount * FINAL_INTEREST * final_term)
				total_amount = total_amount + amount
				repayment = total_amount / months
						
				str1 = NumberFormat2(repayment,1,2,2,False)
			
				If (str1.Length >= 9)Then
					lblResults.Text = "$" & str1.SubString2(0,7)
					lblDecimal.Text = str1.SubString2(7,9)
				Else
					lblDecimal.Text = ""
					lblResults.Text = "$" & NumberFormat2(repayment,1,2,2,False)
				End If
			End If
		End If
	End If
		
End Sub