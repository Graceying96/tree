package com.vantagefx;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    T data;

    private Node<T> parent;
    private List<Node<T>> children = new ArrayList<>();

    public Node (T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public boolean isRoot() {
        return this.parent == null;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void addChild(Node<T> child) {
        child.setParent(this);
        this.children.add(child);
    }

    public List<Node<T>> getChildren() {
        return this.children;
    }

}
