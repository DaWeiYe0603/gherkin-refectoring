package Gherkin;

import java.util.List;

public class Story {
    private String keyword;
    private String name;
    private int line;
    private String id;
    private String type;
    private String description;
    private List<Element> elements;

    public String getKeyword(){
        return keyword;
    }

    public String getName(){
        return name;
    }

    public List<Element> getElement(){
        return elements;
    }

    public int getLine(){
        return line;
    }

    public String getId(){
        return id;
    }

    public String getType(){
        return type;
    }

    public String getDescription(){
        return description;
    }


    public void setKeyword(String keyword){
        this.keyword = keyword;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setElement(List<Element> elements){
        this.elements = elements;
    }

    public void setLine(int line){
        this.line = line;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String toString(){
        return String.format("[keyword]: %s, \n[name]: %s, \n[line]: %s, \n[elements]: %s\n\n", keyword, name, line, elements);
    }

}
