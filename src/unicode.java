class NameInUnicode {

    public static void main(){
        char S = '\u0053';
        char O = '\u004F';
        char M = '\u004D';
        char I = '\u0049';
        char L = '\u006c';
        System.out.println(S);
        System.out.println(O);
        System.out.println(M);
        System.out.println(I);
        System.out.println(L);
        
        //or

        System.out.println('\u0053' + ""+ '\u004F'+""+'\u004D'+""+ '\u0049'+""+'\u006c');
    }   
}

