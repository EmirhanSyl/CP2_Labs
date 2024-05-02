package com.blackflower.fantasticquestions;

/**
 *
 * @author emirs
 */
public class Products {

    String productName;
    int stockCount;
    
    public Products(String productName, int stockCount) {
        this.productName = productName;
        this.stockCount = stockCount;
    }

    @Override
    public String toString() {
        return productName;
    }
    
    
    
}
