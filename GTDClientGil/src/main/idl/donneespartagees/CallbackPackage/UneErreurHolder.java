package donneespartagees.CallbackPackage;

/**
 * donneespartagees/CallbackPackage/UneErreurHolder.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from C:/Users/Florian/workspace2/alma-gtd/idl/donneespartagees.idl
 * mercredi 6 janvier 2010 22 h 46 CET
 */

public final class UneErreurHolder implements org.omg.CORBA.portable.Streamable
{
	public donneespartagees.CallbackPackage.UneErreur value = null;

	public UneErreurHolder ()
	{
	}

	public UneErreurHolder (donneespartagees.CallbackPackage.UneErreur initialValue)
	{
		value = initialValue;
	}

	public void _read (org.omg.CORBA.portable.InputStream i)
	{
		value = donneespartagees.CallbackPackage.UneErreurHelper.read (i);
	}

	public void _write (org.omg.CORBA.portable.OutputStream o)
	{
		donneespartagees.CallbackPackage.UneErreurHelper.write (o, value);
	}

	public org.omg.CORBA.TypeCode _type ()
	{
		return donneespartagees.CallbackPackage.UneErreurHelper.type ();
	}

}
