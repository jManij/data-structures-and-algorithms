package utilities;

import stacksandqueues.Stack;

public class MultiBracketValidation {
    public boolean stringValidation(String str) {
        if (str.length() == 1) return false;
        Stack store = new Stack();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                store.push(str.charAt(i));
            } else if(str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
                if (!checkPairs(store.pop().toString().charAt(0), str.charAt(i)))
                    return false;
            }
        }
        return true;
    }

    public boolean checkPairs(char first, char second) {
        if (first == '(' && second == ')' || first == '{' && second == '}' || first == '[' && second == ']')
            return true;
        return false;
    }

}
