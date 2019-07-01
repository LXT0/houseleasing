package com.mokelock.houseleasing.model.HouseModel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResponseTest {

    @Test
    public void restoJson2() {

        Response res = new Response(200,"success");

        assertEquals(200,res.RestoJson2().get("status"));

    }
}