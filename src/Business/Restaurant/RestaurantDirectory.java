/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;


import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
     private ArrayList<Restaurant> restaurantList;
     public RestaurantDirectory() {
        restaurantList = new ArrayList();
    }

    public ArrayList<Restaurant> getRestaurantDirectory() {
        return restaurantList;
    }
    
    /*public Restaurant addRestaurant(String name){
        Restaurant restaurant = new Restaurant();
        restaurant.setRestaurantName(name);
        restaurantList.add(restaurant);
        return restaurant;
    }*/
    public void addRestaurant(Restaurant restaurant){
        restaurantList.add(restaurant);
    }
    public void removeRestaurant(Restaurant restaurant){
        restaurantList.remove(restaurant);
    }
}
