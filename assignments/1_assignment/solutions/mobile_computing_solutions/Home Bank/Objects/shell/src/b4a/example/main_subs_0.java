package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"main\")";
Debug.ShouldStop(1073741824);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,35);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
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
public static RemoteObject  _btncarloan_click() throws Exception{
try {
		Debug.PushSubsStack("btnCarLoan_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
if (RapidSub.canDelegate("btncarloan_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btncarloan_click");}
 BA.debugLineNum = 44;BA.debugLine="Sub btnCarLoan_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="StartActivity(\"CarLoan\")";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("CarLoan"))));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("btnHomeLoan_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
if (RapidSub.canDelegate("btnhomeloan_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnhomeloan_click");}
 BA.debugLineNum = 48;BA.debugLine="Sub btnHomeLoan_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="StartActivity(\"HomeLoan\")";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("HomeLoan"))));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private btnCarLoan As Button";
main.mostCurrent._btncarloan = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private btnHomeLoan As Button";
main.mostCurrent._btnhomeloan = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
carloan_subs_0._process_globals();
homeloan_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
carloan.myClass = BA.getDeviceClass ("b4a.example.carloan");
homeloan.myClass = BA.getDeviceClass ("b4a.example.homeloan");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}