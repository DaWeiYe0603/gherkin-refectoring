package Gherkin;

import java.util.List;

public class ExampleRow {
    private int line;
    private List<String> cells;

    public int getLine(){
        return line;
    }
    public List<String> getCells(){
        return cells;
    }


    public void setLine(int line){
        this.line = line;
    }
    public void setCells(List<String>cells){
        this.cells = cells;
    }

    public String toString(){
        return String.format("[line]: %s\n\n", line);
    }
}
