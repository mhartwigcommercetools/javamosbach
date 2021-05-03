package com.education.mosbach.banking;

import com.education.mosbach.algorithms.health.BMICalculator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestAccount {

    private Account myAccount;

    @Before
    public void before() {
        myAccount = new Account(1, "1", 1000, 1000);
    }

    @After
    public void after() {
        myAccount = null;
    }

    @Test
    @Parameters({
            "1000               ,   1000            , -500       ,   500",
            "1000               ,   1000            , -2000      ,   1000",
            "1000               ,   1000            , -1999      ,   -999",
            "1000               ,   1000            , 1999      ,   2999"
    })
    public void testUpdate(int balance, int credit, int delta, int newBalance) {
            myAccount.setBalance(balance);
            myAccount.setCredit(credit);
            myAccount.update(delta);
            assertEquals(newBalance, myAccount.getBalance());
    }


}
