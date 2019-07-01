package com.mokelock.houseleasing.services.servicesImpl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import static org.junit.Assert.*;

public class HouseServiceImplTest {

    @Test
    public void speInfo() {

        HouseServiceImpl hsi = new HouseServiceImpl();

        JSONObject hj = (JSONObject) hsi.speInfo("sdfwenk31345");

        JSONObject dj = (JSONObject) hj.get("data");

        assertEquals("quyanso111",dj.get("owner"));

        assertEquals("138.49",dj.get("lat"));

    }

    @Test
    public void search() {

        HouseServiceImpl hsi = new HouseServiceImpl();

        //JSONObject s = (JSONObject) hsi.search("山东省济南市高新区奥龙官邸","","","",true);
        JSONObject s = (JSONObject) hsi.search("","","","",true);

        JSONArray j = (JSONArray) s.get("data");

        JSONObject jj = j.getJSONObject(0);


        assertEquals("",jj.get("low_str_location"));

        //JSONObject jo = j.getJSONObject(0);

        //assertEquals("",jj.get("elevator"));
    }


    @Test
    public void allInfo() {
        HouseServiceImpl h=new HouseServiceImpl();
        JSONObject j=(JSONObject)h.allInfo();
        JSONObject j1=(JSONObject)j.get("data");

        JSONArray j2=(JSONArray)j1.get("non_verified");
        JSONObject j3=j2.getJSONObject(0);

        assertEquals("2800",j3.get("lease"));


    }

}