package com.t3h.immutable;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(" World");

        builder.insert(4, "đã insert");

        builder.delete(4, 13);
        builder.reverse();
        builder.reverse();

        System.out.println(builder);
    }
}
