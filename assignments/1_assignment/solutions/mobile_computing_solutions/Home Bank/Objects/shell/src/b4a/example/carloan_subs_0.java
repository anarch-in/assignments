package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class carloan_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (carloan) ","carloan",2,carloan.mostCurrent.activityBA,carloan.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.carloan.remoteMe.runUserSub(false, "carloan","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"carLoan\")";
Debug.ShouldStop(2);
carloan.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("carLoan")),carloan.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (carloan) ","carloan",2,carloan.mostCurrent.activityBA,carloan.mostCurrent,43);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.carloan.remoteMe.runUserSub(false, "carloan","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (carloan) ","carloan",2,carloan.mostCurrent.activityBA,carloan.mostCurrent,39);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.carloan.remoteMe.runUserSub(false, "carloan","activity_resume");}
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncalculate_click() throws Exception{
try {
		Debug.PushSubsStack("btnCalculate_Click (carloan) ","carloan",2,carloan.mostCurrent.activityBA,carloan.mostCurrent,77);
if (RapidSub.canDelegate("btncalculate_click")) { return b4a.example.carloan.remoteMe.runUserSub(false, "carloan","btncalculate_click");}
RemoteObject _amount = RemoteObject.createImmutable(0);
RemoteObject _deposit = RemoteObject.createImmutable(0);
RemoteObject _repayment = RemoteObject.createImmutable(0);
RemoteObject _term = RemoteObject.createImmutable(0);
RemoteObject _final_term = RemoteObject.createImmutable(0);
RemoteObject _months = RemoteObject.createImmutable(0);
RemoteObject _str1 = RemoteObject.createImmutable("");
RemoteObject _total_amount = RemoteObject.createImmutable(0);
RemoteObject _interest = RemoteObject.createImmutable(0);
RemoteObject _initial_interest = RemoteObject.createImmutable(0);
RemoteObject _final_interest = RemoteObject.createImmutable(0);
RemoteObject _initial_term = RemoteObject.createImmutable(0);
 BA.debugLineNum = 77;BA.debugLine="Sub btnCalculate_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 80;BA.debugLine="Dim amount As Double";
Debug.ShouldStop(32768);
_amount = RemoteObject.createImmutable(0);Debug.locals.put("amount", _amount);
 BA.debugLineNum = 81;BA.debugLine="Dim deposit As Double";
Debug.ShouldStop(65536);
_deposit = RemoteObject.createImmutable(0);Debug.locals.put("deposit", _deposit);
 BA.debugLineNum = 82;BA.debugLine="Dim repayment As Double";
Debug.ShouldStop(131072);
_repayment = RemoteObject.createImmutable(0);Debug.locals.put("repayment", _repayment);
 BA.debugLineNum = 83;BA.debugLine="Dim term As Double";
Debug.ShouldStop(262144);
_term = RemoteObject.createImmutable(0);Debug.locals.put("term", _term);
 BA.debugLineNum = 84;BA.debugLine="Dim final_term As Int";
Debug.ShouldStop(524288);
_final_term = RemoteObject.createImmutable(0);Debug.locals.put("final_term", _final_term);
 BA.debugLineNum = 85;BA.debugLine="Dim months As Int";
Debug.ShouldStop(1048576);
_months = RemoteObject.createImmutable(0);Debug.locals.put("months", _months);
 BA.debugLineNum = 86;BA.debugLine="Dim str1 As String";
Debug.ShouldStop(2097152);
_str1 = RemoteObject.createImmutable("");Debug.locals.put("str1", _str1);
 BA.debugLineNum = 87;BA.debugLine="Dim total_amount As Double";
Debug.ShouldStop(4194304);
_total_amount = RemoteObject.createImmutable(0);Debug.locals.put("total_amount", _total_amount);
 BA.debugLineNum = 90;BA.debugLine="Dim const INTEREST As Double = 0.0965";
Debug.ShouldStop(33554432);
_interest = BA.numberCast(double.class, 0.0965);Debug.locals.put("INTEREST", _interest);Debug.locals.put("INTEREST", _interest);
 BA.debugLineNum = 91;BA.debugLine="Dim const INITIAL_INTEREST As Double = 0.0495";
Debug.ShouldStop(67108864);
_initial_interest = BA.numberCast(double.class, 0.0495);Debug.locals.put("INITIAL_INTEREST", _initial_interest);Debug.locals.put("INITIAL_INTEREST", _initial_interest);
 BA.debugLineNum = 92;BA.debugLine="Dim const FINAL_INTEREST As Double = 0.0695";
Debug.ShouldStop(134217728);
_final_interest = BA.numberCast(double.class, 0.0695);Debug.locals.put("FINAL_INTEREST", _final_interest);Debug.locals.put("FINAL_INTEREST", _final_interest);
 BA.debugLineNum = 93;BA.debugLine="Dim const INITIAL_TERM As Int = 5";
Debug.ShouldStop(268435456);
_initial_term = BA.numberCast(int.class, 5);Debug.locals.put("INITIAL_TERM", _initial_term);Debug.locals.put("INITIAL_TERM", _initial_term);
 BA.debugLineNum = 96;BA.debugLine="If (edtTxtAmount.Text == \"\") Or (edtTxtDeposit.Te";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",carloan.mostCurrent._edttxtamount.runMethod(true,"getText"),RemoteObject.createImmutable(""))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",carloan.mostCurrent._edttxtdeposit.runMethod(true,"getText"),RemoteObject.createImmutable(""))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",carloan.mostCurrent._edttxtterm.runMethod(true,"getText"),RemoteObject.createImmutable("")))))) { 
 BA.debugLineNum = 97;BA.debugLine="Msgbox(\"Please ensure all fields are filled befo";
Debug.ShouldStop(1);
carloan.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please ensure all fields are filled before calculation")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),carloan.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 98;BA.debugLine="Else If (edtTxtDeposit.Text >= edtTxtAmount.Text)";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, carloan.mostCurrent._edttxtdeposit.runMethod(true,"getText")),BA.numberCast(double.class, carloan.mostCurrent._edttxtamount.runMethod(true,"getText"))))) { 
 BA.debugLineNum = 99;BA.debugLine="Msgbox(\"Please Check Deposit amount.\",\"Error\")";
Debug.ShouldStop(4);
carloan.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please Check Deposit amount.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),carloan.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 101;BA.debugLine="amount = edtTxtAmount.Text";
Debug.ShouldStop(16);
_amount = BA.numberCast(double.class, carloan.mostCurrent._edttxtamount.runMethod(true,"getText"));Debug.locals.put("amount", _amount);
 BA.debugLineNum = 102;BA.debugLine="deposit = edtTxtDeposit.Text";
Debug.ShouldStop(32);
_deposit = BA.numberCast(double.class, carloan.mostCurrent._edttxtdeposit.runMethod(true,"getText"));Debug.locals.put("deposit", _deposit);
 BA.debugLineNum = 103;BA.debugLine="term = edtTxtTerm.Text";
Debug.ShouldStop(64);
_term = BA.numberCast(double.class, carloan.mostCurrent._edttxtterm.runMethod(true,"getText"));Debug.locals.put("term", _term);
 BA.debugLineNum = 104;BA.debugLine="months = term * 12";
Debug.ShouldStop(128);
_months = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_term,RemoteObject.createImmutable(12)}, "*",0, 0));Debug.locals.put("months", _months);
 BA.debugLineNum = 106;BA.debugLine="amount = amount - deposit";
Debug.ShouldStop(512);
_amount = RemoteObject.solve(new RemoteObject[] {_amount,_deposit}, "-",1, 0);Debug.locals.put("amount", _amount);
 BA.debugLineNum = 109;BA.debugLine="If (lblHeader.Text == \"Car Loan Calculator\") The";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("=",carloan.mostCurrent._lblheader.runMethod(true,"getText"),RemoteObject.createImmutable("Car Loan Calculator")))) { 
 BA.debugLineNum = 111;BA.debugLine="If (edtTxtAmount.Text > 700000) Then	'Restricts";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean(">",BA.numberCast(double.class, carloan.mostCurrent._edttxtamount.runMethod(true,"getText")),BA.numberCast(double.class, 700000)))) { 
 BA.debugLineNum = 112;BA.debugLine="Msgbox(\"Bank holds a maximum lending amount of";
Debug.ShouldStop(32768);
carloan.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Bank holds a maximum lending amount of $700,000. Please call 1122334 for assistance.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),carloan.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 113;BA.debugLine="Else If (edtTxtTerm.Text > 7) Then		'Restricts";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean(">",BA.numberCast(double.class, carloan.mostCurrent._edttxtterm.runMethod(true,"getText")),BA.numberCast(double.class, 7)))) { 
 BA.debugLineNum = 114;BA.debugLine="Msgbox(\"Loan Term must be within 7 years\",\"Err";
Debug.ShouldStop(131072);
carloan.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Loan Term must be within 7 years")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),carloan.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 116;BA.debugLine="repayment = (((amount * INTEREST) * term) + am";
Debug.ShouldStop(524288);
_repayment = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_amount,_interest}, "*",0, 0)),_term}, "*",0, 0)),_amount}, "+",1, 0)),_months}, "/",0, 0);Debug.locals.put("repayment", _repayment);
 BA.debugLineNum = 117;BA.debugLine="lblResults.Text = \"$\" & NumberFormat2(repaymen";
Debug.ShouldStop(1048576);
carloan.mostCurrent._lblresults.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$"),carloan.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(_repayment),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(carloan.mostCurrent.__c.getField(true,"False"))))));
 }}
;
 }else {
 BA.debugLineNum = 122;BA.debugLine="If (edtTxtAmount.Text > 12000000) Then	'Restric";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean(">",BA.numberCast(double.class, carloan.mostCurrent._edttxtamount.runMethod(true,"getText")),BA.numberCast(double.class, 12000000)))) { 
 BA.debugLineNum = 123;BA.debugLine="Msgbox(\"Bank holds a maximum lending amount of";
Debug.ShouldStop(67108864);
carloan.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Bank holds a maximum lending amount of $12 million. Please call 1122334 for assistance.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),carloan.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 124;BA.debugLine="Else If (edtTxtTerm.Text > 30) Then		'Restricts";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean(">",BA.numberCast(double.class, carloan.mostCurrent._edttxtterm.runMethod(true,"getText")),BA.numberCast(double.class, 30)))) { 
 BA.debugLineNum = 125;BA.debugLine="Msgbox(\"Loan Term must be within 30 years\",\"Er";
Debug.ShouldStop(268435456);
carloan.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Loan Term must be within 30 years")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),carloan.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 127;BA.debugLine="final_term = term - INITIAL_TERM";
Debug.ShouldStop(1073741824);
_final_term = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_term,_initial_term}, "-",1, 0));Debug.locals.put("final_term", _final_term);
 BA.debugLineNum = 129;BA.debugLine="total_amount = (amount * INITIAL_INTEREST * IN";
Debug.ShouldStop(1);
_total_amount = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_amount,_initial_interest,_initial_term}, "**",0, 0)),(RemoteObject.solve(new RemoteObject[] {_amount,_final_interest,_final_term}, "**",0, 0))}, "+",1, 0);Debug.locals.put("total_amount", _total_amount);
 BA.debugLineNum = 130;BA.debugLine="total_amount = total_amount + amount";
Debug.ShouldStop(2);
_total_amount = RemoteObject.solve(new RemoteObject[] {_total_amount,_amount}, "+",1, 0);Debug.locals.put("total_amount", _total_amount);
 BA.debugLineNum = 131;BA.debugLine="repayment = total_amount / months";
Debug.ShouldStop(4);
_repayment = RemoteObject.solve(new RemoteObject[] {_total_amount,_months}, "/",0, 0);Debug.locals.put("repayment", _repayment);
 BA.debugLineNum = 133;BA.debugLine="str1 = NumberFormat2(repayment,1,2,2,False)";
Debug.ShouldStop(16);
_str1 = carloan.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(_repayment),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(carloan.mostCurrent.__c.getField(true,"False")));Debug.locals.put("str1", _str1);
 BA.debugLineNum = 135;BA.debugLine="If (str1.Length >= 9)Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("g",_str1.runMethod(true,"length"),BA.numberCast(double.class, 9)))) { 
 BA.debugLineNum = 136;BA.debugLine="lblResults.Text = \"$\" & str1.SubString2(0,7)";
Debug.ShouldStop(128);
carloan.mostCurrent._lblresults.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$"),_str1.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 7))))));
 BA.debugLineNum = 137;BA.debugLine="lblDecimal.Text = str1.SubString2(7,9)";
Debug.ShouldStop(256);
carloan.mostCurrent._lbldecimal.runMethod(true,"setText",BA.ObjectToCharSequence(_str1.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 9)))));
 }else {
 BA.debugLineNum = 139;BA.debugLine="lblDecimal.Text = \"\"";
Debug.ShouldStop(1024);
carloan.mostCurrent._lbldecimal.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 140;BA.debugLine="lblResults.Text = \"$\" & NumberFormat2(repayme";
Debug.ShouldStop(2048);
carloan.mostCurrent._lblresults.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$"),carloan.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(_repayment),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(carloan.mostCurrent.__c.getField(true,"False"))))));
 };
 }}
;
 };
 }}
;
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncarloan_click() throws Exception{
try {
		Debug.PushSubsStack("btnCarLoan_Click (carloan) ","carloan",2,carloan.mostCurrent.activityBA,carloan.mostCurrent,48);
if (RapidSub.canDelegate("btncarloan_click")) { return b4a.example.carloan.remoteMe.runUserSub(false, "carloan","btncarloan_click");}
 BA.debugLineNum = 48;BA.debugLine="Sub btnCarLoan_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="pnlCalculator.BringToFront";
Debug.ShouldStop(65536);
carloan.mostCurrent._pnlcalculator.runVoidMethod ("BringToFront");
 BA.debugLineNum = 50;BA.debugLine="lblHeader.Text = \"Car Loan Calculator\"";
Debug.ShouldStop(131072);
carloan.mostCurrent._lblheader.runMethod(true,"setText",BA.ObjectToCharSequence("Car Loan Calculator"));
 BA.debugLineNum = 51;BA.debugLine="lblInterestInfo.Text = \"* Interest rate at 9.65%";
Debug.ShouldStop(262144);
carloan.mostCurrent._lblinterestinfo.runMethod(true,"setText",BA.ObjectToCharSequence("* Interest rate at 9.65% per annum"));
 BA.debugLineNum = 52;BA.debugLine="btnClear_Click";
Debug.ShouldStop(524288);
_btnclear_click();
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclear_click() throws Exception{
try {
		Debug.PushSubsStack("btnClear_Click (carloan) ","carloan",2,carloan.mostCurrent.activityBA,carloan.mostCurrent,68);
if (RapidSub.canDelegate("btnclear_click")) { return b4a.example.carloan.remoteMe.runUserSub(false, "carloan","btnclear_click");}
 BA.debugLineNum = 68;BA.debugLine="Sub btnClear_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="edtTxtAmount.Text = \"\"";
Debug.ShouldStop(16);
carloan.mostCurrent._edttxtamount.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 70;BA.debugLine="edtTxtDeposit.Text = \"\"";
Debug.ShouldStop(32);
carloan.mostCurrent._edttxtdeposit.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 71;BA.debugLine="edtTxtTerm.Text = \"\"";
Debug.ShouldStop(64);
carloan.mostCurrent._edttxtterm.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 72;BA.debugLine="lblResults.Text = \"$0\"";
Debug.ShouldStop(128);
carloan.mostCurrent._lblresults.runMethod(true,"setText",BA.ObjectToCharSequence("$0"));
 BA.debugLineNum = 73;BA.debugLine="lblDecimal.Text = \"\"";
Debug.ShouldStop(256);
carloan.mostCurrent._lbldecimal.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 74;BA.debugLine="edtTxtAmount.RequestFocus";
Debug.ShouldStop(512);
carloan.mostCurrent._edttxtamount.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncontact_click() throws Exception{
try {
		Debug.PushSubsStack("btnContact_Click (carloan) ","carloan",2,carloan.mostCurrent.activityBA,carloan.mostCurrent,56);
if (RapidSub.canDelegate("btncontact_click")) { return b4a.example.carloan.remoteMe.runUserSub(false, "carloan","btncontact_click");}
 BA.debugLineNum = 56;BA.debugLine="Sub btnContact_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="pnlContact.BringToFront";
Debug.ShouldStop(16777216);
carloan.mostCurrent._pnlcontact.runVoidMethod ("BringToFront");
 BA.debugLineNum = 58;BA.debugLine="lblHeader.Text = \"Contact Us\"";
Debug.ShouldStop(33554432);
carloan.mostCurrent._lblheader.runMethod(true,"setText",BA.ObjectToCharSequence("Contact Us"));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnhomeloan_click() throws Exception{
try {
		Debug.PushSubsStack("btnHomeLoan_Click (carloan) ","carloan",2,carloan.mostCurrent.activityBA,carloan.mostCurrent,61);
if (RapidSub.canDelegate("btnhomeloan_click")) { return b4a.example.carloan.remoteMe.runUserSub(false, "carloan","btnhomeloan_click");}
 BA.debugLineNum = 61;BA.debugLine="Sub btnHomeLoan_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="pnlCalculator.BringToFront";
Debug.ShouldStop(536870912);
carloan.mostCurrent._pnlcalculator.runVoidMethod ("BringToFront");
 BA.debugLineNum = 63;BA.debugLine="lblHeader.Text = \"Home Loan Calculator\"";
Debug.ShouldStop(1073741824);
carloan.mostCurrent._lblheader.runMethod(true,"setText",BA.ObjectToCharSequence("Home Loan Calculator"));
 BA.debugLineNum = 64;BA.debugLine="lblInterestInfo.Text = \"* Interest at 4.95% for f";
Debug.ShouldStop(-2147483648);
carloan.mostCurrent._lblinterestinfo.runMethod(true,"setText",BA.ObjectToCharSequence("* Interest at 4.95% for first 5 years, 6.95% for remaining years"));
 BA.debugLineNum = 65;BA.debugLine="btnClear_Click";
Debug.ShouldStop(1);
_btnclear_click();
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private edtTxtAmount As EditText";
carloan.mostCurrent._edttxtamount = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private edtTxtDeposit As EditText";
carloan.mostCurrent._edttxtdeposit = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private edtTxtTerm As EditText";
carloan.mostCurrent._edttxtterm = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private lblResults As Label";
carloan.mostCurrent._lblresults = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private btnCalculate As Button";
carloan.mostCurrent._btncalculate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btnClear As Button";
carloan.mostCurrent._btnclear = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private btnCarLoan As Button";
carloan.mostCurrent._btncarloan = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private btnContact As Button";
carloan.mostCurrent._btncontact = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private btnHomeLoan As Button";
carloan.mostCurrent._btnhomeloan = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblHeader As Label";
carloan.mostCurrent._lblheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private pnlContact As Panel";
carloan.mostCurrent._pnlcontact = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private pnlCalculator As Panel";
carloan.mostCurrent._pnlcalculator = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lblInterestInfo As Label";
carloan.mostCurrent._lblinterestinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private lblDecimal As Label";
carloan.mostCurrent._lbldecimal = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}