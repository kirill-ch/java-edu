package ru.javatutor.easy;

public class DefangingIP {
    public String defangIPaddr(String address) {
        char[] chars = address.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if(c == '.')
                sb.append("[.]");
            else
                sb.append(c);
        }
        return sb.toString();
    }

    // Runtime: 3 ms, faster than 26.74%
    public String defangIPaddr2(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
