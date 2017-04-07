package org.omg.PortableServer;


/**
* org/omg/PortableServer/_ServantLocatorStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-linux-amd64/jdk8u121/8372/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Monday, December 12, 2016 4:37:46 PM PST
*/


/**
	 * When the POA has the NON_RETAIN policy it uses servant 
	 * managers that are ServantLocators. Because the POA 
	 * knows that the servant returned by this servant 
	 * manager will be used only for a single request, 
	 * it can supply extra information to the servant 
	 * manager's operations and the servant manager's pair 
	 * of operations may be able to cooperate to do 
	 * something different than a ServantActivator. 
	 * When the POA uses the ServantLocator interface, 
	 * immediately after performing the operation invocation 
	 * on the servant returned by preinvoke, the POA will 
	 * invoke postinvoke on the servant manager, passing the 
	 * ObjectId value and the Servant value as parameters 
	 * (among others). This feature may be used to force 
	 * every request for objects associated with a POA to 
	 * be mediated by the servant manager.
	 */
public class _ServantLocatorStub extends org.omg.CORBA.portable.ObjectImpl implements org.omg.PortableServer.ServantLocator
{
  final public static java.lang.Class _opsClass = ServantLocatorOperations.class;



  /**
  	 * This operations is used to get a servant that will be
  	 * used to process the request that caused preinvoke to
  	 * be called.
  	 * @param oid the object id associated with object on
  	 *            which the request was made. 
  	 * @param adapter the reference for POA in which the
  	 *                object is being activated.
  	 * @param operation the operation name.
  	 * @param the_cookie  an opaque value that can be set
  	 *                    by the servant manager to be used
  	 *                    during postinvoke.
  	 * @return Servant used to process incoming request.
  	 * @exception ForwardRequest to indicate to the ORB 
  	 *            that it is responsible for delivering 
  	 *            the current request and subsequent 
  	 *            requests to the object denoted in the 
  	 *            forward_reference member of the exception.
  	 */
  public org.omg.PortableServer.Servant preinvoke (byte[] oid, org.omg.PortableServer.POA adapter, String operation, org.omg.PortableServer.ServantLocatorPackage.CookieHolder the_cookie) throws org.omg.PortableServer.ForwardRequest
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("preinvoke", _opsClass);
      ServantLocatorOperations  $self = (ServantLocatorOperations) $so.servant;

      try {
         return $self.preinvoke (oid, adapter, operation, the_cookie);
      } finally {
          _servant_postinvoke ($so);
      }
  } // preinvoke


  /**
  	 * This operation is invoked whenener a servant completes
  	 * a request.
  	 * @param oid the object id ssociated with object on which
  	 *            the request was made.
  	 * @param adapter the reference for POA in which the
  	 *                object was active.
  	 * @param the_cookie  an opaque value that contains
  	 *                    the data set by preinvoke.
  	 * @param the_servant reference to the servant that is
  	 *                    associated with the object.
  	 */
  public void postinvoke (byte[] oid, org.omg.PortableServer.POA adapter, String operation, java.lang.Object the_cookie, org.omg.PortableServer.Servant the_servant)
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("postinvoke", _opsClass);
      ServantLocatorOperations  $self = (ServantLocatorOperations) $so.servant;

      try {
         $self.postinvoke (oid, adapter, operation, the_cookie, the_servant);
      } finally {
          _servant_postinvoke ($so);
      }
  } // postinvoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/PortableServer/ServantLocator:1.0", 
    "IDL:omg.org/PortableServer/ServantManager:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ServantLocatorStub
