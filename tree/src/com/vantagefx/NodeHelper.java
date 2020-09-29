package com.vantagefx;

public class NodeHelper {

    public static <T> void printDecendants(Node<T> node, String appender) {
        /**
         * implement this method
         * use T.toString() as the node's text
         * print the descendants of the given node in tree structure
         *
         */


        if(appender.equals("")){
            System.out.println(appender + node.getData());
        }else {
            System.out.println(appender + node.getData());

            for (Node user : node.getChildren()) {
                printDecendants(user, "\t" + appender);

            }
        }
    }
}
