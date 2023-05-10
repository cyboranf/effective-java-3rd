package org.example.chapter2.topic1;

import java.math.BigInteger;
import java.time.Instant;
import java.util.Date;
import java.util.EnumSet;
import java.util.Random;
import java.util.Set;

public class topicNo1 {
    public static void main(String[] args) {
        boolean booleanVariable=true;

        System.out.print("Simple type: ");
        System.out.println(booleanVariable);

        System.out.print("Boolean Object after call static method 'valueOf': ");
        System.out.println(valueOf(booleanVariable));
        System.out.println("-------------");

        //next example
        System.out.print(".probablePrime method(16 [bit length], Random Object) returns: ");
        System.out.println(BigInteger.probablePrime(16, new Random())); // from java 4
        System.out.println("--------------");

        //next example (from method) - method to conversion type.
        //Give parameter, get object with the same value of parameter
        Instant instant= new Date().toInstant();
        Date d=Date.from(instant);
        System.out.print("instant: ");
        System.out.println(instant);
        System.out.print("date (uses .from on instant): ");
        System.out.println(d);
        System.out.println("--------------");

        //next example (of method) method gets a lot of parameters
        //then give u an instance of correct type included all parameters
//      Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);

        //next example: alternative to .from and .of
        System.out.print("Return .valueOf(Integer.MAX_VALUE) as a BigInteger variable: ");
        BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);
        System.out.print(prime+" ");
        System.out.println(prime.getClass());
        System.out.println("---------------");
    }

    public static Boolean valueOf(boolean b) {
        return (b ? Boolean.TRUE : Boolean.FALSE); // look like design pattern: Flyweight
    }

}
