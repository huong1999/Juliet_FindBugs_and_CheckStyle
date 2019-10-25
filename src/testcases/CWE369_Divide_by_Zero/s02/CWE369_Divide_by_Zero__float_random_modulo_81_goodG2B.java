/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE369_Divide_by_Zero__float_random_modulo_81_goodG2B.java
Label Definition File: CWE369_Divide_by_Zero__float.label.xml
Template File: sources-sinks-81_goodG2B.tmpl.java
*/
/*
 * @description
 * CWE: 369 Divide by zero
 * BadSource: random Set data to a random value between 0.0f (inclusive) and 1.0f (exclusive)
 * GoodSource: A hardcoded non-zero number (two)
 * Sinks: modulo
 *    GoodSink: Check for zero before modulo
 *    BadSink : Modulo by a value that may be zero
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package testcases.CWE369_Divide_by_Zero.s02;
import testcasesupport.*;

public class CWE369_Divide_by_Zero__float_random_modulo_81_goodG2B extends CWE369_Divide_by_Zero__float_random_modulo_81_base
{
    public void action(float data ) throws Throwable
    {

        /* POTENTIAL FLAW: Possibly modulo by zero */
        int result = (int)(100.0 % data);
        IO.writeLine(result);

    }
}
