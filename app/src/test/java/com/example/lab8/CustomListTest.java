package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * check if hasCity works correctly
     * add a city to the list using addCity
     * then test if hasCity returns true
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Calmar", "AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    /**
     * check if deleteCity works correctly
     * add a city to the list then delete it.
     * check if it contains city still.
     */
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City city = new City("Calmar", "AB");
        list.addCity(city);
        list.deleteCity(city);
        Assertions.assertFalse(list.hasCity(city));
    }

}
