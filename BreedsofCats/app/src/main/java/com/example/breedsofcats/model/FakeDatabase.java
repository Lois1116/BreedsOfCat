package com.example.breedsofcats.model;
import com.example.breedsofcats.model.Cat;


import java.util.HashMap;
import java.util.List;


public class FakeDatabase {
    public static HashMap<Long, Cat> cats = new HashMap<>();

    public static Cat getCatById(long catID) { return cats.get(catID);}

    public static List<Cat> getAllCat(){return (List) cats.values();}

    public static void saveCatToFakeDatabase(List<Cat> catsToSave){
        for (int i = 0; i < catsToSave.size();i++){
            Cat cat = catsToSave.get(i);
            cats.put(cat.getId(),cat);
        }
    }



}
