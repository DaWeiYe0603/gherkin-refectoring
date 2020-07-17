package Gherkin;

public class Step {
    private String keyword;
    private String name;
    private int line;

    public String getKeyword(){
        return keyword;
    }

    public String getName(){
        return name;
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

    public void setLine(int line){
        this.line = line;
    }

    public String toString(){
        return String.format("[keyword]: %s, \n[name]: %s, \n[line]: %s\n\n", keyword, name, line);
    }

}
