package com.company;

public class MyStringBuilder {
    private Element head;

    public MyStringBuilder() {
    }

    public void append(String str) {
        if (head == null) {
            Element element = new Element(str);
            head = element;
        } else {
            Element element = new Element(head.getDate() + str);
            element.setPrev(head);
            head = element;
        }
    }

    public void undo() {
        if (head.getPrev() == null) {
            head=new Element("null");
        } else
            head = head.getPrev();
    }

    @Override
    public String toString() {
        return head.getDate();
    }
}
