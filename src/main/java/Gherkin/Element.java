package Gherkin;

import java.util.List;

public class Element {
    private String keyword;
    private String name;
    private int line;
    private String id;
    private String type;
    private List<Example> examples;
    private List<Step> steps;

    public String getKeyword(){
        return keyword;
    }

    public String getName(){
        return name;
    }

    public List<Step> getSteps(){
        return steps;
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

    public List<Example> getExample(){
        return examples;
    }

    public void setKeyword(String keyword){
        this.keyword = keyword;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSteps(List<Step> steps){
        this.steps = steps;
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

    public void setExample(List<Example> examples){
        this.examples = examples;
    }

    public String toString(){
        return String.format("[keyword]: %s, \n[name]: %s, \n[line]: %s, \n[steps]: %s , \n[examples]: %s\n\n", keyword, name, line, steps, examples);
    }

    public String stepsString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Step step : steps){
            stringBuilder.append(step.getKeyword() + step.getName() + "\n");
        }

        return stringBuilder.toString();
    }
}
