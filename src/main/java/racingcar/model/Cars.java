package racingcar.model;

public class Cars {
    private String name;
    private String loadState;

    public Cars(String name, String loadState){
        this.name=name;
        this.loadState=loadState;
    }

    public String getName() {
        return name;
    }

    public String getLoadState() {
        return loadState;
    }

    public void setLoadState(String loadState) {
        this.loadState = loadState;
    }

    public void setName(String name) {
        this.name = name;
    }
}
