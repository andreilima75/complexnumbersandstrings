package me.andrei;

class MyCode {
    public static void main(String[] args) {
       /* System.out.println("(a[0]+b[2c[6]])            passed:" + parensMatch("(a[0]+b[2c[6]])"));
        System.out.println("f(e(d))                    passed:" + parensMatch("f(e(d))"));
        System.out.println("[()]{}([])                 passed:" + parensMatch("[()]{}([])"));
        System.out.println("((b)                       passed:" + !parensMatch("((b)"));
        System.out.println("(c]                        passed:" + !parensMatch("(c]"));
        System.out.println("{(a[])                     passed:" + !parensMatch("{(a[])"));
        System.out.println("([)]                       passed:" + !parensMatch("([)]"));
        System.out.println("[({{}}])                   passed:" + !parensMatch("[({{}}])"));
        System.out.println(")(                         passed:" + !parensMatch(")("));*/
        System.out.println(parensMatch("(a[0]+b[2c[6]])"));
        System.out.println(parensMatch("f(e(d))"));
        System.out.println(parensMatch("[()]{}([])"));
        System.out.println(parensMatch("((b)"));
        System.out.println(parensMatch("(c]"));
        System.out.println(parensMatch("{(a[])"));
        System.out.println(parensMatch("([)]"));
        System.out.println(parensMatch("[({{}}])"));
        System.out.println(parensMatch(")("));

    }

    public static boolean parensMatch(String sentence) {
        System.out.println(sentence);
        sentence = sentence.replaceAll("[^(){}\\[\\]]", "");
        //System.out.println(sentence);
        boolean replaced = false;

        do {
            replaced = false;
            int size = sentence.length();
            sentence = sentence.replaceAll("\\(\\)", "");
            sentence = sentence.replaceAll("\\[\\]", "");
            sentence = sentence.replaceAll("\\{\\}", "");
            //System.out.println(sentence);
            if (size > sentence.length() && sentence.length() > 0)
                replaced = true;
        } while (replaced);

        if (sentence.length() > 0)
            return false;
        else
            return true;
    }

}

// Write a function that returns true if the brackets in a given string are balanced.
// Balanced means that every parenthesis/bracket or brace that is opened must be closed
// And it must be closed in the right order (Always close the last symbol you opened)
// The function must handle parens (), square brackets [], and curly braces {}.

