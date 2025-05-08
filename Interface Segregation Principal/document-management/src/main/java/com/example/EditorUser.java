package com.example;

public class EditorUser implements Editable{
    public void edit() {
        System.out.println("Edit document");
    }
    public void save() {
        System.out.println("Save document");
    }
}
