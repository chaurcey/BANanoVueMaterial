
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmmenuitem {
    public static RemoteObject myClass;
	public vmmenuitem() {
	}
    public static PCBA staticBA = new PCBA(null, vmmenuitem.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _menuitem = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"ID",_ref.getField(false, "_id"),"MenuItem",_ref.getField(false, "_menuitem"),"module",_ref.getField(false, "_module"),"vue",_ref.getField(false, "_vue")};
}
}