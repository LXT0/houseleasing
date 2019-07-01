package com.mokelock.houseleasing.model.HouseModel;

import org.junit.Test;

import static org.junit.Assert.*;

public class LowLocationTest {

    @Test
    public void toJson() {

        LowLocation a = new LowLocation("h","t","h","t");

        assertEquals("t",a.LLtoJson().get(a.getCity()));

    }
    @Test
    public void toLLO() {
    }
}