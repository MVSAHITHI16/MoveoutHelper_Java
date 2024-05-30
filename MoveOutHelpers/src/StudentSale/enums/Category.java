/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSale.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author sahithireddy
 */
public enum Category {
    
    Food,Books,Electronics,Organizers,Clothes,Medicines,Furniture;
    
    public static List<String> getCategoriesList(){
       
        return Stream.of(Category.values()).map(Category::name).collect(Collectors.toList());
    }
    
    public static String[] getCategoriesArray() {
        
        return Arrays.stream(Category.values()).map(Category::name).toArray(String[]::new);
    }    
    
}
