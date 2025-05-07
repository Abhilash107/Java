package OutputQNS.oops;

class Alpha{
    static String s = " ";//Static variable s is shared across all instances.
    protected Alpha(){
        s += "alpha ";
    }
}

class SubAlpha extends Alpha{
    private SubAlpha(){
        s += "sub ";////Constructor is private. Not used in main(), so it doesn’t matter here.
    }
}

public class q4 extends Alpha {
    private q4(){
        s += "subsub ";

    }

    public static void main(String[] args) {
        new q4();
        System.out.println(s);
    }


//Since q4 extends Alpha, the constructor of Alpha is implicitly called before the body of q4 constructor.
    //Then why isn’t "sub " added to s?
    //Because SubAlpha's constructor is never called.
//Even though s is static and shared, you must still call code that modifies it.

//Since no object of SubAlpha is created, its constructor never runs, so "sub " is never added.

}
