ABSTRACT CLASS:
==============

definition : set of complete and incomplete methods.
Purpose : methods override purpose

SYNTAX 
====== 

  abstract class classname
  {
      variable => should be declared & defined; (can)
      method => can be complete/incomplete.
  }


Objects cannot be created for abstract class


ABSTRACTION:
============ 

Showing only essential information, hiding other details.

Real time Eg:

  1. car driver - driver knowing how to apply break, horn, accelerator but not the mechanism behind them.
  2. ATM machine
  3. TV remote
  i.e. private data is not shown but the public data is shown.

---
ENCAPSULATION:
==============
Wrapping of data.

Eg : Capsule tablets
1.Technical expln : class containing variables & methods.
2.private - variables specified using private is accessible only inside that specific class.

ACCESS SPECIFIER:
=================

Private===========>
public============>
protected=========>
default===========>


                           pack1                                             pack2

                      base        derive              main              base        derive


private                yes         no                  no                no           no
public                 yes         yes                 yes               yes          yes
protected              yes         yes                 yes               no           yes
default                yes         yes                 yes               no           no

EXCEPTION HANDLING:
===================

Def : To avoid runtime or dynamic error.

TYPES:
======
1) Checked exception (compile time)
2) unchecked exception (runtime)

inbuilt Exception:
==================
1. ArithmeticException (0 / 0 any/0)
2. InputMismatchException (wrong input format)
3. ArrayIndexOutOfBoundsException(out of range)
4. NegativeArraySizeException(we can't declare -ve size)
5. FileNotFoundException

custom or userdefined exception:
'===============================
1. AgeException
2. NisanthException
3. PasswordException

SYNTAX:
=======
try
{
  //write java code
}
catch(exceptionname)