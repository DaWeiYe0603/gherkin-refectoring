package Gherkin;

import java.util.List;

public class Example {
    private String keyword;
    private String name;
    private int line;
    private List<ExampleRow> rows;

    public String getKeyword(){
        return keyword;
    }

    public String getName(){
        return name;
    }

    public List<ExampleRow> getRows(){
        return rows;
    }

    public int getLine(){
        return line;
    }

    public void setKeyword(String keyword){
        this.keyword = keyword;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRows(List<ExampleRow> rows){
        this.rows = rows;
    }

    public void setLine(int line){
        this.line = line;
    }

    public String toString(){
        return String.format("[keyword]: %s, \n[name]: %s, \n[line]: %s, \n[rows]: %s\n\n", keyword, name, line, rows);
    }

}
