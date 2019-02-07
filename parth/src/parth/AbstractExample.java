/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package parth;

abstract class Polyhedron {
    int length;
    Polyhedron(int length) {
        this.length = length;
        System.out.println("ABstract class constructor called");
    } 
    abstract void calculateVolume(); 
}

class Cube extends Polyhedron {
    Cube(int length) {
        super(length);
        System.out.println("Cube constructor called");
    }
    @Override
    void calculateVolume() {
        System.out.println("Volume = " + (Math.pow(this.length, 3)));
    }
}

class Cuboid extends Polyhedron {
    private int breadth, height;

    Cuboid(int length, int breadth, int height) {
        super(length);
        this.breadth = breadth;
        this.height = height;
        System.out.println("Cuboid constructor called");
    }
    @Override
    void calculateVolume() {
        System.out.println("Volume = " + (this.length * this.breadth * this.height));
    }
}


class AbstractExample {
    public static void main(String[] args) {
        Polyhedron p1 = new Cube(10);
        Polyhedron p2 = new Cuboid(2, 3, 5);
        p1.calculateVolume();
        p2.calculateVolume();
    }
}

