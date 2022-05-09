package com.Execise6.shape;
public class circle extends shape {
    circle(int dim1){
        super(dim1, -1);
    }
    public double area(){
        return Math.PI * dim1 * dim1;
    }
    
}
