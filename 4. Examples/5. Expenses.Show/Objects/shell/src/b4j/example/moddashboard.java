
package b4j.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class moddashboard implements IRemote{
	public static moddashboard mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public moddashboard() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new moddashboard();
		remoteMe = RemoteObject.declareNull("b4j.example.moddashboard");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("moddashboard"), "b4j.example.moddashboard");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, moddashboard.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, moddashboard.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _vm = RemoteObject.declareNull("b4j.example.bananovm");
public static RemoteObject _name = RemoteObject.createImmutable("");
public static RemoteObject _expcont = RemoteObject.declareNull("b4j.example.vmcontainer");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
  public Object[] GetGlobals() {
		return new Object[] {"BANano",moddashboard._banano,"expcont",moddashboard._expcont,"Main",Debug.moduleToString(b4j.example.main.class),"modExpenseCategories",Debug.moduleToString(b4j.example.modexpensecategories.class),"modExpenses",Debug.moduleToString(b4j.example.modexpenses.class),"modExpenseTypes",Debug.moduleToString(b4j.example.modexpensetypes.class),"modStats",Debug.moduleToString(b4j.example.modstats.class),"name",moddashboard._name,"pgIndex",Debug.moduleToString(b4j.example.pgindex.class),"vm",moddashboard._vm};
}
}