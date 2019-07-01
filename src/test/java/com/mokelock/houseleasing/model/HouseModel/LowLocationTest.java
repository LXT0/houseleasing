package com.mokelock.houseleasing.model.HouseModel;

import org.junit.Test;

import static org.junit.Assert.*;

public class LowLocationTest {

    @Test
    public void LLtoJson() {

        LowLocation ll = new LowLocation("","","高新区","");
        assertEquals("",ll.LLtoJson().get("city"));
        assertEquals("高新区",ll.LLtoJson().get("sector"));


    }

    @Test
    public void lltoStr() {

        LowLocation ll = new LowLocation("","","高新区","");
        assertEquals("高新区",ll.lltoStr());

    }

    @Test
    public void stoLL() {

        LowLocation ll = new LowLocation();
        String s = "山东省济南市高新区奥龙官邸";

        ll.StoLL(s);
        assertEquals("山东省",ll.getProvi());
        assertEquals("济南市",ll.getCity());
        assertEquals("高新区",ll.getSector());
        assertEquals("奥龙官邸",ll.getCommu_name());


    }
}