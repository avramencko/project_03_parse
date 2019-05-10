package by.avramenko.app;

import com.google.gson.Gson;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class JSONWriter {
    private ArrayList<Product> productList;

    public JSONWriter(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void write(String filepath, String filename) {
        String path = filepath + "\\" + filename + ".json";

        Gson gson = new Gson();
        String json = gson.toJson(productList);
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write("{\"results\":"+json+"}");
            fileWriter.close();
            System.out.println("Ready!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
//        String path = filepath + "\\" + filename + ".json";
//        JSONObject results = new JSONObject();
//
//        JSONArray array = new JSONArray();
//        for (Product product : productList) {
//            JSONObject object = new JSONObject();
//            object.put("scalematesUrl", product.getScalematesUrl());
//            object.put("brand", product.getBrand());
//            object.put("scale", product.getScale());
//            object.put("brandCatno", product.getBrandCatno());
//            object.put("name", product.getName());
//            object.put("boxartUrl", product.getBoxartUrl());
//            object.put("year", product.getYear());
//            object.put("description", product.getDescription());
//            array.add(object);
//        }
//        results.put("results", array);
//        try {
//            FileWriter fileWriter = new FileWriter(path);
//            fileWriter.write(results.toJSONString());
//            fileWriter.close();
//            System.out.println("Ready!");
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
    }
}
