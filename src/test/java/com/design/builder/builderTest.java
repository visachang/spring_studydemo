package com.design.builder;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by lenovo on 2018/7/8.
 */
public class builderTest {
    private TicketHelper ticketHelper;
    private TicketBuilder ticketBuilder;

    @Before
    public void setUp() throws Exception {
        ticketHelper = new TicketHelper();
        ticketHelper.buildAdult("成人票");
        ticketHelper.buildChildrenForSeat("儿童座位票");
        ticketHelper.buildChildrenNoSeat("儿童无座票");
        ticketHelper.buildElderly("老人票");
        ticketHelper.buildSoldier("军人及家属票");
    }

    @Test
    public void testName() throws Exception {
        ticketBuilder.builder(ticketHelper);
    }
}
