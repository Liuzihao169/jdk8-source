package org.omg.CosNaming;

/**
* org/omg/CosNaming/NamingContextHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u45/3457/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Friday, April 10, 2015 10:49:21 AM PDT
*/


/** 
 * A naming context is an object that contains a set of name bindings in 
 * which each name is unique. Different names can be bound to an object 
 * in the same or different contexts at the same time. <p>
 * 
 * See <a href="http://www.omg.org/technology/documents/formal/naming_service.htm">
 * CORBA COS 
 * Naming Specification.</a>
 */
public final class NamingContextHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.NamingContext value = null;

  public NamingContextHolder ()
  {
  }

  public NamingContextHolder (org.omg.CosNaming.NamingContext initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.NamingContextHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.NamingContextHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.NamingContextHelper.type ();
  }

}
