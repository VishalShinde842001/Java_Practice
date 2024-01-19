public class Covert_Sentence_into_Its_Equivalent_Mobile {

    public static void main(String[] args) {
       String S = "GFG";
       Covert_Sentence_into_Its_Equivalent_Mobile c=new Covert_Sentence_into_Its_Equivalent_Mobile();
        System.out.println(c.printSequence(S));


    }
    String printSequence(String S)

    {

        // code here

        StringBuilder s= new StringBuilder();

        for(int i=0;i<S.length();i++){

            char c=S.charAt(i);

            switch(c){

                case 'A': s.append("2");

                    continue;

                case 'B': s.append("22");

                    continue;

                case 'C': s.append("222");

                    continue;

                case 'D': s.append("3");

                    continue;

                case 'E': s.append("33");

                    continue;

                case 'F': s.append("333");

                    continue;

                case 'G': s.append("4");

                    continue;

                case 'H': s.append("44");

                    continue;

                case 'I': s.append("444");

                    continue;

                case 'J': s.append("5");

                    continue;

                case 'K': s.append("55");

                    continue;

                case 'L': s.append("555");

                    continue;

                case 'M': s.append("6");

                    continue;

                case 'N': s.append("66");

                    continue;

                case 'O': s.append("666");

                    continue;

                case 'P': s.append("7");

                    continue;

                case 'Q': s.append("77");

                    continue;

                case 'R': s.append("777");

                    continue;

                case 'S': s.append("7777");

                    continue;

                case 'T': s.append("8");

                    continue;

                case 'U': s.append("88");

                    continue;

                case 'V': s.append("888");

                    continue;

                case 'W': s.append("9");

                    continue;

                case 'X': s.append("99");

                    continue;

                case 'Y': s.append("999");

                    continue;

                case 'Z': s.append("9999");

                    continue;

                case ' ': s.append("0");

                    continue;

            }

        }

        return s.toString();

    }
}
