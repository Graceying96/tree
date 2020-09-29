package com.vantagefx;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Code challenge of VantageFX Java Developer
 * Please finish this task within 1.5 hours
 *  
 * This application requires printing a user relation tree structure based on
 * User - Basic Java Bean
 * Node - Node class of the tree
 * SampleData - Samples of user data and relation
 * NodeHelper - A helper class for Node
 * 
 * Supposing we manage users in this way:
 * 1. Every user has a unique ID (Integer)
 * 2. Every user has a parent user, except for root user
 * 3. Every user can have any number of child user(s)
 * 4. There is only one root user
 * 
 * Please implement 
 * 1. Application.buildUserTree(Node<User> node)
 * 2. NodeHelper.printDecendants(Node<T> node, String appender)
 * and the expected output should be:
 * 1
 *   |--2
 *     |--5
 *     |--6
 *       |--11
 *       |--12
 *     |--7
 *       |--13
 *   |--3
 *     |--8
 *       |--14
 *       |--15
 *         |--21
 *       |--16
 *         |--22
 *           |--23
 *             |--24
 *       |--17
 *       |--18
 *     |--9
 *   |--4
 *     |--10
 *       |--19
 *       |--20
 *
 */
public class Application {

    public static void buildUserTree(Node<User> node) {
        /**
         * implement this method
         * build the tree data structure
         *
         */
        if(node.getParent() == null) {
            NodeHelper.printDecendants(node, "");
        }
        else if(node.getParent().isRoot()){
            NodeHelper.printDecendants(node, "|-- ");
        }
    }

    public static void main(String[] args) {
        Map<Integer, User> userMap = SampleData.getUserData();
        Map<Integer, Integer> relationMap = SampleData.getRelationMap();
        //construct Node Tree of User
        Integer rootUserId = SampleData.getRelationMap().entrySet().stream()
                .filter(p -> null == p.getValue()).findAny().get().getKey();
        List<Node<User>> userList = new ArrayList<>();
        Node<User> root = new Node<>(userMap.get(rootUserId));
        root.setParent(null);
        userList.add(root);

        for (Map.Entry<Integer, Integer> entry : relationMap.entrySet()) {
            if(entry.getValue()!= null) {
                if(entry.getValue().equals(rootUserId)) {
                    Node<User> user = new Node<>(userMap.get(entry.getKey()));
                    user.setParent(root);
                    userList.add(user);
                }else{
                    Node<User> child = new Node<>(userMap.get(entry.getKey()));
                    for(Node <User> parent:userList){
                        if(entry.getValue().equals(parent.getData().getId())){
                            parent.addChild(child);
                            child.setParent(parent);
                        }
                    }
                    userList.add(child);
                }

            }
        }
        for(Node<User> user:userList) {
            buildUserTree(user);
        }

    }
}
