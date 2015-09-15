/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.cf.study.jee.cdi.producer.instance;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;

public class RandomProducer {

    private final java.util.Random random = new java.util.Random(System.currentTimeMillis());

    @Produces
    @Random
    int next() {
        return random.nextInt();
    }

    @Produces
    @Random
    @SessionScoped
    RandomBean sessionNext() {
        return new RandomBean();
    }

}