package com.curoonline;

/**
 * Created by kakuffo on 05/09/15.
 */
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class HelloConcordionFixture {

    public String greetingFor(String firstName) {

        return "Hello " + firstName + "!";
    }
}
