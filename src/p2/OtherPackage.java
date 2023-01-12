package p2;


import p1.Protection;

class OtherPackage {
    OtherPackage() {
        Protection p = new Protection2();

        System.out.println("n_pub = " + p.n_pub);
    }
}