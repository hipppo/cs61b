import sun.util.locale.InternalLocaleBuilder;

public class Intlist {
    int first;
    Intlist rest;

    public Intlist (int first, Intlist rest){
        this.first = first;
        this. rest = rest;
    }

    public Intlist (){
        this.first = 0;
        this.rest = null;
    }

    public static Intlist List(Integer... args){
        Intlist result, p;

        if(args.length > 0)
            result = new Intlist(args[0], null);
        else
            return null;

        int k;
        for(k = 1, p = result; k < args.length; k +=1, p = p.rest){
            p.rest = new Intlist(args[k], null);
        }
        return result;
    }

    public static Intlist SquareDestructive(Intlist L) {
        while (L != null) {
            L.first = L.first * L.first;
            L = L.rest;
        }
        return L;
    }


    public static Intlist SquareNonDestructive(Intlist L){
        if (L == null)
            return null;
        return new Intlist(L.first * L.first, SquareNonDestructive(L.rest));
    }

    public static void main(String[] args){
        Intlist test1 = List(1, 2, 3, 4);
        Intlist test1nondistructive = SquareNonDestructive(test1);
        Intlist test1distructive = SquareDestructive(test1);

    }
}
