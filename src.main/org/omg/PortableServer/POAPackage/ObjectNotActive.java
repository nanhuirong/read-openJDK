package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/ObjectNotActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-linux-amd64/jdk8u121/8372/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Monday, December 12, 2016 4:37:47 PM PST
*/

public final class ObjectNotActive extends org.omg.CORBA.UserException
{

  public ObjectNotActive ()
  {
    super(ObjectNotActiveHelper.id());
  } // ctor


  public ObjectNotActive (String $reason)
  {
    super(ObjectNotActiveHelper.id() + "  " + $reason);
  } // ctor

} // class ObjectNotActive
