package com.sun.corba.se.spi.activation.InitialNameServicePackage;


/**
* com/sun/corba/se/spi/activation/InitialNameServicePackage/NameAlreadyBound.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u45/3457/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Friday, April 10, 2015 10:49:20 AM PDT
*/

public final class NameAlreadyBound extends org.omg.CORBA.UserException
{

  public NameAlreadyBound ()
  {
    super(NameAlreadyBoundHelper.id());
  } // ctor


  public NameAlreadyBound (String $reason)
  {
    super(NameAlreadyBoundHelper.id() + "  " + $reason);
  } // ctor

} // class NameAlreadyBound